package kr.co.fridgeideas.service;

import java.util.List;

import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

public interface RecipeService {

	public RecipeVO view(int seq);
	public List<ImageVO> recipeImageList(int seq);
	public List<RecipeVO> recipeSearch(String[] ingredList);
	public List<RecipeVO> cateRecipeList(String cate);
}
