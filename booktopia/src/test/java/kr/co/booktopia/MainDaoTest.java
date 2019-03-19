package kr.co.booktopia;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.booktopia.dao.MainDAO;
import kr.co.booktopia.vo.ShopGoodsVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class MainDaoTest {
	
	@Inject
	private MainDAO dao;
	
	@Test
	public void selectGoodsList() {
		
		List<ShopGoodsVO> list = dao.selectGoodsList("bestseller");
	}

}
