package kr.co.fridgeideas.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.fridgeideas.service.MemberService;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.RecipeVO;
import kr.co.fridgeideas.vo.TermsVO;

@Controller
public class MemberController {
	
	@Autowired
	private TermsVO termsVO;
		
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String login(MemberVO memberVO, HttpSession sess) {
		
		memberVO = service.login(memberVO);
		
		if(memberVO != null) {
			sess.setAttribute("isLogOn", true);
			sess.setAttribute("memberVO", memberVO);
			return "redirect:/index";
		} else {
			return "redirect:/index?result=fail";
		}
	}
	
	@RequestMapping(value="/member/logout")
	public ModelAndView logout(HttpSession sess) {
		
		ModelAndView mav = new ModelAndView(); 
		sess.invalidate();
		mav.setViewName("redirect:/index");
		return mav;
	}
	
	@RequestMapping(value="/member/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	}
	
	@RequestMapping(value="/member/register", method=RequestMethod.POST)
	public String register(MemberVO memberVO, HttpServletRequest req) {
		memberVO.setRegip(req.getRemoteAddr());
		service.register(memberVO);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/member/terms")
	public String terms(Model model ) {
		
		termsVO = service.terms();
		model.addAttribute("termsVO", termsVO);
		return "/member/terms";
	}
	
	@RequestMapping(value="/member/mypage")
	public String mypage() {
		return "/member/mypage";
	}
	
	@RequestMapping(value="/member/myrecipe", method=RequestMethod.GET)
	public String myrecipe() {
		return "/member/myrecipe";
	}
	
	@RequestMapping(value="/member/myrecipe", method=RequestMethod.POST)
	public String myrecipe(RecipeVO recipeVO, HttpSession sess, HttpServletRequest req) {
		MemberVO memberVO = (MemberVO) sess.getAttribute("memberVO");
		recipeVO.setUid(memberVO.getUid());
		recipeVO.setNick(memberVO.getNick());
		recipeVO.setRegip(req.getRemoteAddr());
		
		service.recipeWrite(recipeVO);
		return "redirect:/index";
	}
	
	@ResponseBody
	@RequestMapping(value="/member/idCheck")
	public Map<String, Integer> idCheck(String uid){
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.idCheck(uid);
		
		map.put("result", count);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/member/nickCheck")
	public Map<String, Integer> nickCheck(String nick){
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.nickCheck(nick);
		map.put("result", count);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/member/hpCheck")
	public Map<String, Integer> hpCheck(String hp){
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.hpCheck(hp);
		map.put("result", count);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="/member/emailCheck")
	public Map<String, Integer> emailCheck(String email){
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.emailCheck(email);
		map.put("result", count);
		return map;
	}
	

}
