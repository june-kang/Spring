package kr.co.fridgeideas.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Repository
public class RecipeDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public RecipeVO view(int seq) {
		return mybatis.selectOne("fr.mapper.recipe.selectRecipeForIndex", seq);
	}
	
	public List<ImageVO> recipeImageList(int seq){
		return mybatis.selectList("fr.mapper.recipe.selectRecipeImage", seq);
	}
	
	public List<RecipeVO> recipeSearch(String[] ingredList){
		return mybatis.selectList("fr.mapper.recipe.selectRecipeForIngredients", ingredList);
	}
	
	public List<RecipeVO> cateRecipeList(String cate){
		return mybatis.selectList("fr.mapper.recipe.selectRecipeForCate", cate);
	}
	
	public List<RecipeVO> cateBestRecipe(String cate){
		return mybatis.selectList("fr.mapper.recipe.selectBestRecipe", cate);
	}
	
	public void updateRecipeHit(int seq) {
		mybatis.update("fr.mapper.recipe.updateRecipeHit", seq);
	}
}
