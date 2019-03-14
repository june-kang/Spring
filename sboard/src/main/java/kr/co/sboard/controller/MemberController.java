package kr.co.sboard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sboard.service.MemberService;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login() {
		return "/member/login";	
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String login(MemberVO memberVO, HttpSession sess) {
		
		MemberVO member = service.login(memberVO);
		
		if(member != null) {
			// 세션 저장
			sess.setAttribute("member", member);
			
			return "redirect:/list";
		} else {
			return "redirect:/member/login?result=fail";
		}
	}
	
	@RequestMapping(value="/member/idCheck")
	@ResponseBody // json으로 응답을 받음
	public Map<String, Integer> idCheck(String uid){
		
		// 서비스 요청
		
		
		// json으로 변환될 데이터들
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.idCheck(uid);
		map.put("result", count);
		return map;
	}
	
	
	@RequestMapping(value="/member/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	}
	
	@RequestMapping(value="/member/register", method=RequestMethod.POST)
	public String register(MemberVO memberVO, HttpServletRequest req) {

		memberVO.setRegip(req.getRemoteAddr());
		
		service.register(memberVO);
		return "redirect:/member/login";
	}
	
	
	@RequestMapping(value="/member/terms")
	public String terms(Model model) {
		
		TermsVO termsVO = service.terms();
		model.addAttribute(termsVO);
		return "/member/terms";
		
	}
	
	@RequestMapping(value="/member/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/member/login";
	}

}
