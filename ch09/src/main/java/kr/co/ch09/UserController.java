package kr.co.ch09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/user/form")
	public String form() {
		return "/user/form";
	}
	
	@RequestMapping("/user/register")
	public String register(Model model, UserVO vo) { // 서비스의 추상화 request.getParameter 과정은 frontController가 알아서 해줌, model 로 attribute 전달
		
		// 뷰로 데이터 전달
		//model.addAttribute("vo", vo); // vo 객체에 저장하고 싶을 경우 (register.jsp에서 ${vo.name} 받기 가능
		model.addAttribute(vo); //객체 이름 없이 전달 ${userVO.name}
		return "/user/register";
	}
}