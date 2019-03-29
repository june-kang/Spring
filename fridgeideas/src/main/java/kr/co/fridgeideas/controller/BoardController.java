package kr.co.fridgeideas.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.fridgeideas.service.BoardService;
import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/tips/usingtools")
	public String Tips() {
		return "/tips/usingtools";
	}

	@RequestMapping(value="/community/commu_list")
	public String commuList(Model model) {
		
		List<BoardVO> list = service.commuList();
		model.addAttribute("list", list);
		
		return "/community/commu_list";
	}
	
	@RequestMapping(value="/community/commu_write", method=RequestMethod.GET)
	public String commuWrite() {
		return "/community/commu_write";
	}
	
	@RequestMapping(value="/community/commu_write", method=RequestMethod.POST)
	public String commuWrite(BoardVO vo, HttpServletRequest req, HttpSession sess) {
		
		vo.setRegip(req.getRemoteAddr());
		
		MultipartFile file = vo.getFname();
		
		if(!file.isEmpty()) {
			vo.setFile(1);
			int commu_id = service.commuWrite(vo);
			String fileName = file.getOriginalFilename();
			
			ImageVO ivo = new ImageVO();
			ivo.setCommu_id(commu_id);
			ivo.setFileType("community");
			ivo.setFileName(fileName);
			ivo.setReg_id(vo.getUid());
			
			service.fileWrite(ivo); // 이미지 테이블의 seq
			
			service.fileUpload(req, file, commu_id);
			
		} else {
			vo.setFile(0);
			service.commuWrite(vo);
		}
		
		return "redirect:/community/commu_list";
	}
	
	
	
	@RequestMapping(value="/community/commu_view")
	public String commuView(Model model, int seq, HttpSession sess) {
		
		MemberVO memberVO = (MemberVO) sess.getAttribute("memberVO");
		String uid = memberVO.getUid();
		
		BoardVO boardVO = service.view(seq);
		List<ImageVO> list = new ArrayList<>();
		
		if(!boardVO.getUid().equals(uid)) {
			service.updateView(seq);
		}
		
		if(boardVO.getFile()==1) {
			list = service.commuBoardImage(seq);
		}
		
		model.addAttribute("boardVO", boardVO);
		model.addAttribute("list", list);
		
		return "/community/commu_view";
	}
	
	@ResponseBody
	@RequestMapping(value="/community/commentWrite", method=RequestMethod.POST)
	public Map<String, String> commentWrite(BoardVO vo, HttpServletRequest req){
		
		vo.setRegip(req.getRemoteAddr());
		String rdate = service.commentWrite(vo);
		service.updateCommentCount(vo.getParent());
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("nick", vo.getNick());
		map.put("rdate", rdate);
		map.put("content", vo.getContent());
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/community/commentList", method=RequestMethod.GET)
	public ArrayList<BoardVO> commentList(int parent){
		
		System.out.println(parent);
		ArrayList<BoardVO> list = (ArrayList<BoardVO>) service.commentList(parent);
		for(BoardVO vo : list) {
			System.out.println(vo.getContent());
		}
		return list;
	}
	
	@RequestMapping(value="/notice/notice")
	public String noticeList() {
		return "/notice/notice";
	}
	
	@RequestMapping(value="/member/myrecipe", method=RequestMethod.GET)
	public String myrecipe() {
		return "/member/myrecipe";
	}
	
	@RequestMapping(value="/member/myrecipe", method=RequestMethod.POST)
	public String myrecipe(RecipeVO recipeVO, HttpServletRequest req, HttpServletResponse resp) {
		
		recipeVO.setRegip(req.getRemoteAddr());
		HashMap<String, MultipartFile> map = new HashMap<>();
				
		MultipartHttpServletRequest mhsq = (MultipartHttpServletRequest) req; // 다중 파일 업로드
		List<MultipartFile> files = mhsq.getFiles("fname");
		
		if(!files.isEmpty()) {
			recipeVO.setFile(1);
			int recipe_id = service.recipeWrite(recipeVO);
			
			ImageVO ivo = new ImageVO();
			ivo.setRecipe_id(recipe_id);
			ivo.setFileType("recipe");
			ivo.setReg_id(recipeVO.getUid());
			
			for(MultipartFile file : files) {
				String fileName = file.getOriginalFilename();
				if(fileName!="") {
					ivo.setFileName(fileName);
					service.fileWrite(ivo);
					
					map.put(fileName, file);
				}
				
			}
			service.multipleFileUpload(req, recipe_id, map);
		}else {
			recipeVO.setFile(0);
			service.recipeWrite(recipeVO);
		}
		return "redirect:/index";
	}
	
	
}
