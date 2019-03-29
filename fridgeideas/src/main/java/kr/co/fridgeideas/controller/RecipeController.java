package kr.co.fridgeideas.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.fridgeideas.service.RecipeService;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Controller
public class RecipeController {
	
	@Inject
	private RecipeService service;
	
	@RequestMapping(value="/search/search")
	public String search() {
		return "/search/search";
	}
	
	@RequestMapping(value="/recipe/beginner")
	public String recipeList() {
		return "/recipe/beginner";
	}
	
	@RequestMapping(value="/recipe/recipe_view")
	public String recipeView(Model model, int seq) {
		
		RecipeVO recipeVO = service.view(seq);
		List<ImageVO> imageList = service.recipeImageList(seq);
		
		String source = recipeVO.getIngredients();
		String[] ingredList = source.split(",");
		
		System.out.println("레시피 디렉션9 : "+recipeVO.getDirection9());
		
		model.addAttribute("recipeVO", recipeVO);
		model.addAttribute("imageList", imageList);
		model.addAttribute("ingredList", ingredList);
		
		return "/recipe/recipe_view";
	}
}
