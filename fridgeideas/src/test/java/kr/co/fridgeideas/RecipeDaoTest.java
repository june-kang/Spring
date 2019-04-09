package kr.co.fridgeideas;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.RecipeDAO;
import kr.co.fridgeideas.vo.RecipeVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class RecipeDaoTest {
	
	@Inject
	private RecipeDAO dao;
	
	@Test
	public void searchTest() {
		String[] ingredList = {"water", "oil"};
		RecipeVO recipeVO = new RecipeVO();
		recipeVO.setIngredList(ingredList);
		recipeVO.setCooking_time("under 30m");
		recipeVO.setCooking_level("Beginner");
		recipeVO.setCate("Dinner");
		
		List<RecipeVO> list = dao.recipeSearch(recipeVO);
		
		System.out.println("�˻�����!");
		for(RecipeVO vo : list) {
			System.out.println(vo.getRecipe_name());
		}
	}
	
	
	public void CateTest() {
		String cate = "Breakfast";
		
		List<RecipeVO> recipeList = dao.cateRecipeList(cate);
		for(RecipeVO vo : recipeList) {
			System.out.println(vo.getRecipe_name());
		}
	}

}
