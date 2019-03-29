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
		return mybatis.selectOne("fr.mapper.recipe.selectRecipe", seq);
	}
	
	public List<ImageVO> recipeImageList(int seq){
		return mybatis.selectList("fr.mapper.recipe.selectRecipeImage", seq);
	}

}
