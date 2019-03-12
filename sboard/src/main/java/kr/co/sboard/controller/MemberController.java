package kr.co.sboard.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.service.MemberService;
import kr.co.sboard.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login")
	public String login() {
		return "/member/login";
		
	}
	
	@RequestMapping(value="/member/register")
	public String register() {
		return "/member/register";
		
	}
	
	@RequestMapping(value="/member/terms")
	public String terms(Model model) {
		
		TermsVO termsVO = service.terms();
		model.addAttribute(termsVO);
		return "/member/terms";
		
	}

}
