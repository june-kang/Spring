package kr.co.booktopia.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Repository
public class ShopDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public ShopGoodsVO goodsView(int goods_id) {
		return mybatis.selectOne("bt.mapper.goods.selectGoods", goods_id);
	}
	
	public ShopGoodsImageVO goodsDetailImage(int goods_id) {
		return mybatis.selectOne("bt.mapper.goods.selectGoodsImage", goods_id);
	}

}
