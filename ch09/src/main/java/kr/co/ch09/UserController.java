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
	public String register(Model model, UserVO vo) { // ������ �߻�ȭ request.getParameter ������ frontController�� �˾Ƽ� ����, model �� attribute ����
		
		// ��� ������ ����
		//model.addAttribute("vo", vo); // vo ��ü�� �����ϰ� ���� ��� (register.jsp���� ${vo.name} �ޱ� ����
		model.addAttribute(vo); //��ü �̸� ���� ���� ${userVO.name}
		return "/user/register";
	}
}