package kr.co.fridgeideas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
	
	@RequestMapping(value="/search/search")
	public String search() {
		return "/search/search";
	}
	
	@RequestMapping(value="/recipe/beginner")
	public String recipeList() {
		return "/recipe/beginner";
	}
	
	@RequestMapping(value="/recipe/recipe_view")
	public String recipeView() {
		return "/recipe/recipe_view";
	}
}
