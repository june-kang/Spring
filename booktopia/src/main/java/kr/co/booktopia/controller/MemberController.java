package kr.co.booktopia.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.booktopia.service.MemberService;
import kr.co.booktopia.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login() {
		
		return "/member/login";
	};
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST )
	public String login(MemberVO vo, HttpSession sess) {
		
		MemberVO member = service.login(vo);
		
		if(member != null) {
			sess.setAttribute("member", member);
			return "redirect:/index";
		} else {
			return "redirect:/member/login?result=fail";
		}
	};
	
	@RequestMapping(value="/member/logout")
	public String logout(HttpSession sess) {
		
		sess.invalidate();
		return "redirect:/index";
	};
	
	@RequestMapping(value="/member/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	};
	
	@RequestMapping(value="/member/register", method=RequestMethod.POST)
	public String register(MemberVO vo) {
		
		service.register(vo);
		System.out.println("가입한 아이디 : " +vo.getMember_id());
		return "redirect:/index";
	};
	
	@RequestMapping(value="/member/mypage")
	public String mypage() {
		return "/member/mypage";
	};
}
