package kr.co.sboard.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

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

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;
import kr.co.sboard.vo.MemberVO;

@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/list")
	public String list(Model model, String pg) {
		
		
		
		// Limit용 start 계산
		int start = service.getLimitStart(pg);
		
		
		// 페이지번호 계산
		int total = service.getTotalCount();
		int pageEnd =  service.getPageEnd(total);
		
		// 글 카운트 번호 계산
		int count = service.getPageCountStart(total, start);
		
		// 페이지 그룹 계산
		int[] GroupStartEnd = service.getPageGroupStartEnd(pg, pageEnd);
		
		List<BoardVO> list = service.list(start);
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("groupStartEnd", GroupStartEnd);
		model.addAttribute("list", list);
		
		return "/list";
	}
	
	@RequestMapping(value="/view")
	public String view(Model model, int seq, HttpSession sess) {
		
		BoardVO vo= service.view(seq);
		MemberVO mvo = (MemberVO) sess.getAttribute("member");
		
		if(!vo.getUid().equals(mvo.getUid())) {
			service.updateHit(seq);
		}
		
		model.addAttribute(vo);
		return "/view";
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "/write";
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo, HttpServletRequest req, HttpSession sess) {
		
		MemberVO memberVO = (MemberVO) sess.getAttribute("member");
		
		vo.setRegip(req.getRemoteAddr());
		vo.setCate("notice");
		vo.setUid(memberVO.getUid());
		
		MultipartFile file = vo.getFname();
		
		
		if(!file.isEmpty()) {
			
			vo.setFile(1);
			int parent = service.write(vo);
			
			FileVO fvo = service.fileUpload(req, file);
			fvo.setParent(parent);
					
			service.fileWrite(fvo);	
			
		}else {
			vo.setFile(0);
			service.write(vo);
		}
		
		return "redirect:/list";
	}
	
	@RequestMapping(value="/fileDownload")
	public void fileDownload(int parent, HttpServletRequest req, HttpServletResponse resp) {
		
		// 파일테이블에서 파일정보 가져오기
		FileVO vo = service.fileDownload(parent);
		service.fileUpdate(parent);
		
		String filePath = req.getSession().getServletContext().getRealPath("/");
		filePath += "resource/upload/"+vo.getNewName();
		
		try {
			File file = new File(filePath);
			
			String name = new String(vo.getOldName().getBytes("UTF-8"), "iso-8859-1");
			
			resp.setHeader("Cache-Control", "no-cache");
			resp.setHeader("Content-Disposition", "attachment; filename="+name);
			resp.setHeader("Content-Transfer-Encoding", "binary");
			resp.setHeader("Pragma", "no-cache");
			
			// 스트림 연결 : 파일 --- response 객체
			
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
			
			byte buffer[] = new byte[1024*8];
			
			while(true) {
				// Input스트림으로 데이터 읽어오기
				int read = bis.read(buffer);
				if(read == -1) {
					break;
				}
				
				// Output 스트림으로 데이터 쓰기
				bos.write(buffer, 0, read);
			}
			
			bis.close();
			bos.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/delete")
	public String delete(int seq) {
		service.delete(seq);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modify(Model model, int seq) {
		BoardVO vo = service.view(seq);
		model.addAttribute(vo);
		return "/modify";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(Model model, BoardVO vo) {
		
		int seq = service.modify(vo);
		
		return "redirect:/view?seq="+seq;
	}
	
	@RequestMapping(value="/commentWrite", method=RequestMethod.POST)
	public String commentWrite(BoardVO vo, HttpServletRequest req){
		
		int parent = vo.getParent();
		vo.setRegip(req.getRemoteAddr());
			
		service.commentWrite(vo);
		service.commentCountPlus(parent);
		return "redirect:/view?seq="+parent;
	}
	
	@RequestMapping(value="/commentDelete")
	public String commentDelete(int seq, int parent) {
		
		service.commentDelete(seq);
		service.commentCountMinus(parent);
		return "redirect:/view?seq="+parent;
		
	}
	
	@RequestMapping(value="/commentModify")
	public void commentModify() {
		
	}
	
	@ResponseBody
	@RequestMapping(value="/commentList")
	public List<BoardVO> commentList(int parent) {
			
		List<BoardVO> list = service.commentList(parent);
		return list;
	}
}
