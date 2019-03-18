package kr.co.booktopia;

import java.util.List;

import javax.inject.Inject;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.booktopia.dao.MainDAO;
import kr.co.booktopia.vo.ShopGoodsVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class MainDaoTest {
	
	@Inject
	private MainDAO dao;
	
	public void selectGoodsList() {
		
		List<ShopGoodsVO> list = dao.selectGoodsList("bestseller");
		
	}

}
