package kr.co.sboard.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardVO;
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
	public String view() {
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
		vo.setFile(service.fileUpload(req, file)); // file값 1 or 0 전달 
		
		service.write(vo);
		
		return "redirect:/list";
	}
	


}
