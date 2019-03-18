package kr.co.booktopia.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ShopGoodsVO;

@Repository
public class MainDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<ShopGoodsVO> selectGoodsList(String goodsStatus){
		return mybatis.selectList("bt.mapper.goods.selectGoodsList", goodsStatus);
	}
	
	

}
