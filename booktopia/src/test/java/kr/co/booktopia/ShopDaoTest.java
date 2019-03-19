package kr.co.booktopia;

import javax.inject.Inject;

import org.junit.Test;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public class ShopDaoTest {
	
	@Inject
	private ShopDAO dao;
	
	@Test
	public void view() {
		ShopGoodsVO vo = dao.goodsView(334);
		ShopGoodsImageVO ivo = dao.goodsDetailImage(334);
		System.out.println("¿€∞°"+vo.getGoods_publisher());
		
	}

}
