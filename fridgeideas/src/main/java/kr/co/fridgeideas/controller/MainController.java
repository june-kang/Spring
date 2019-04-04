package kr.co.fridgeideas.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.fridgeideas.service.MainService;
import kr.co.fridgeideas.vo.RecipeVO;

@Controller
public class MainController {
	
	@Inject
	private MainService service;
	
	@RequestMapping(value= {"/", "", "index"})
	public String index(Model model, String result, String loginStatus) throws Exception {
		
		List<RecipeVO> list = service.mainRecipeList();
		
		model.addAttribute("list", list);
		model.addAttribute("result", result);
		model.addAttribute("loginStatus", loginStatus);
		
		return "/index";
	}

}
