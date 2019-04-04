package kr.co.fridgeideas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.fridgeideas.service.RecipeService;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Controller
public class RecipeController {
	
	@Inject
	private RecipeService service;
	
	@RequestMapping(value="/search")
	public String search(Model model, String ingredients) {
		
		if(ingredients!=null) {
			String[] ingredList = ingredients.split("\\s+"); // 한칸 이상의 공백 자르기
			List<RecipeVO> list = service.recipeSearch(ingredList);
			model.addAttribute("list", list);
			return "/search/search";
		} else {
			return "/search/search";
		}
		
	}
	
	@RequestMapping(value="/recipe")
	public String recipeList(Model model, String cate) {
		
		List<RecipeVO> list = new ArrayList<RecipeVO>();
		
		if(cate.equals("Recipe of the Month")) {
			list = service.cateBestRecipe(cate);
		} else {
			list = service.cateRecipeList(cate);
		}

		model.addAttribute("list", list);
		model.addAttribute("cate", cate);
		return "/recipe/recipe_list";
	}
	
	@RequestMapping(value="/recipe/recipe_view")
	public String recipeView(Model model, int seq) {
		
		RecipeVO recipeVO = service.view(seq);
		List<ImageVO> imageList = service.recipeImageList(seq);
		
		String source = recipeVO.getIngredients();
		String[] ingredList = source.split(",");
				
		model.addAttribute("recipeVO", recipeVO);
		model.addAttribute("imageList", imageList);
		model.addAttribute("ingredList", ingredList);
		
		return "/recipe/recipe_view";
	}
}
