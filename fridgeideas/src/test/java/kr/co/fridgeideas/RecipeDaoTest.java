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
	public void RecipeSearchTest() {
		String[] ingredList = {"water", "oil"};
		
		List<RecipeVO> recipeList = dao.recipeSearch(ingredList);
		for(RecipeVO a : recipeList) {
			System.out.println(a.getIngredients());
		}
	}

}
