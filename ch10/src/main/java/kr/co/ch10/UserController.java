package kr.co.ch10;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch10.service.UserService;
import kr.co.ch10.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/userList")
	public String userList(Model model) { // View로 객체를 전달해주는 클래스
		
		List<UserVO> userList = service.userList();
		
		model.addAttribute("userList", userList);
		return "/userList";
	}
	
	@RequestMapping(value="/userRegist", method=RequestMethod.GET) 
	public String userRegist() {
		return "/userRegist";
	}

	@RequestMapping(value="/userRegist", method=RequestMethod.POST)
	public String userRegist(UserVO vo) {
		service.userRegist(vo);
		//리다이렉트
		return "redirect:/userList";
	}
	
	@RequestMapping(value="/userView")
	public String userView(Model model, int seq) {
				
		UserVO vo = service.userView(seq);
		
		model.addAttribute(vo);
		
		return "/userView";
	}

}
