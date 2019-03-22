package kr.co.booktopia.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.booktopia.service.MemberService;
import kr.co.booktopia.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@Autowired
	private MemberVO memberVO; // 반드시 MemberVO 클래스 상단에 @Component 추가
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login(String result, Model model) {
		
		model.addAttribute("result", result);
		
		return "/member/login";
	};
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST )
	public String login(MemberVO vo, HttpSession sess) {
		
		MemberVO memberVO = service.login(vo);
		
		if(memberVO != null) {
			if(memberVO.getMember_id().equals("admin")) {
				sess.setAttribute("isLogon", true);
				sess.setAttribute("memberVO", memberVO);
				return "redirect:/admin";
				
			} else {
				sess.setAttribute("isLogon", true);
				sess.setAttribute("memberVO", memberVO);
				return "redirect:/index";
			}
			
		} else {
			return "redirect:/member/login?result=fail";
		}
	};
	
	@RequestMapping(value="/member/logout")
	public ModelAndView logout(HttpSession sess) {
		
		// ModelAndView - Controller 처리결과 후 응답할 view와 view에 전달할 값을 저장  
		ModelAndView mav = new ModelAndView();
		sess.invalidate();
		mav.setViewName("redirect:/index");
		return mav;
	};
	
	@RequestMapping(value="/member/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	};
	
	@RequestMapping(value="/member/register", method=RequestMethod.POST)
	public String register(MemberVO vo) {
		
		service.register(vo);
		return "redirect:/index";
	};
	
	@RequestMapping(value="/member/mypage")
	public String mypage() {
		return "/member/mypage";
	};
	
	@ResponseBody
	@RequestMapping(value="/member/idCheck")
	public Map<String, Integer> idCheck(String member_id){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = service.idCheck(member_id);
		map.put("result", count);
		
		return map;
	}
}
