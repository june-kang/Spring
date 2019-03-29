package kr.co.fridgeideas.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.fridgeideas.vo.RecipeVO;

@Repository
public class MainDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<RecipeVO> mainRecipeList(){
		
		return mybatis.selectList("fr.mapper.recipe.selectmainList");
	}

}
