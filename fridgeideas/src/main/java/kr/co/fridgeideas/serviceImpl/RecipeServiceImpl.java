package kr.co.fridgeideas.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.fridgeideas.dao.RecipeDAO;
import kr.co.fridgeideas.service.RecipeService;
import kr.co.fridgeideas.vo.ReviewVO;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Inject
	private RecipeDAO dao;

	@Override
	public RecipeVO view(int seq) {
		return dao.view(seq);
	}

	@Override
	public List<ImageVO> recipeImageList(int seq) {
		return dao.recipeImageList(seq);
	}

	@Override
	public List<RecipeVO> recipeSearch(RecipeVO recipeVO) {
		return dao.recipeSearch(recipeVO);
	}

	@Override
	public List<RecipeVO> cateRecipeList(String cate) {
		return dao.cateRecipeList(cate);
	}

	@Override
	public List<RecipeVO> cateBestRecipe(String cate) {
		return dao.cateBestRecipe(cate);
	}

	@Override
	public void updateRecipeHit(int seq) {
		dao.updateRecipeHit(seq);		
	}

	@Override
	public int reviewWrite(ReviewVO rvo) {
		return dao.reviewWrite(rvo);
	}


	@Override
	public void updateRatingReviewCount(RecipeVO recipeVO) {
		dao.updateRatingReviewCount(recipeVO);
	}
	

}
