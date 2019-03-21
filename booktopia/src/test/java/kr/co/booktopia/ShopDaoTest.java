package kr.co.booktopia;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class ShopDaoTest {
	
	@Inject
	private ShopDAO dao;
	
	
	public void view() {
		
		List<ShopGoodsImageVO> list = dao.goodsDetailImage(343);
		
		for(ShopGoodsImageVO ivo : list) {
			System.out.println(ivo.getGoods_id());
		}
	}
	
	
	public void search() {
		
		List<ShopGoodsVO> list = dao.search("�ڹ�");
		
		System.out.println("�˻� ����!");
		for(ShopGoodsVO vo : list) {
			System.out.println(vo.getFileName());
			System.out.println(vo.getGoods_title());
		}
	}
	
	@Test
	public void keywordAutoComplete() {
		
		List<String> list = dao.keywordAutoComplete("�ڹ�");
		
		System.out.println("����!");
		for(String a : list) {
			System.out.println(a);
		}
	}
	


}
