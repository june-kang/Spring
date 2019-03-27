package kr.co.fridgeideas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value= {"/", "", "index"})
	public String index(Model model, String result) throws Exception {
		
		model.addAttribute("result", result);
		
		return "/index";
	}

}
