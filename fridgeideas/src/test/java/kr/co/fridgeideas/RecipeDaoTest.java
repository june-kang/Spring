package kr.co.fridgeideas;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.RecipeDAO;
import kr.co.fridgeideas.vo.RecipeVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class RecipeDaoTest {
	
	@Inject
	private RecipeDAO dao;
	
	
	public void RecipeSearchTest() {
		String[] ingredList = {"water", "oil"};
		
		List<RecipeVO> recipeList = dao.recipeSearch(ingredList);
		for(RecipeVO a : recipeList) {
			System.out.println(a.getIngredients());
		}
	}
	
	@Test
	public void CateTest() {
		String cate = "Beginner";
		
		List<RecipeVO> recipeList = dao.cateRecipeList(cate);
		for(RecipeVO vo : recipeList) {
			System.out.println(vo.getRecipe_name());
		}
	}

}
