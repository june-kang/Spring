package kr.co.booktopia.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Repository
public class ShopDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public ShopGoodsVO goodsView(int goods_id) {
		return mybatis.selectOne("bt.mapper.goods.selectGoods", goods_id);
	}
	
	public List<ShopGoodsImageVO> goodsDetailImage(int goods_id) {
		return mybatis.selectList("bt.mapper.goods.selectGoodsImage", goods_id);
	}
	
	public List<ShopGoodsVO> search(String searchWord) {
		return mybatis.selectList("bt.mapper.goods.selectGoodsbyWord", searchWord);
	}
	
	public List<String> keywordAutoComplete(String keyword){
		return mybatis.selectList("bt.mapper.goods.selectKeywordSearchForAutoComplete", keyword);
	}
	
	public void addGoodsInCart(ShopCartVO shopCartVO) {
		shopCartVO.setCart_id(selectMaxCartId());
				
		mybatis.insert("bt.mapper.goods.insertGoodsInCart", shopCartVO);
	}
	
	public boolean findGoodsInCart(ShopCartVO shopCartVO) {
		String result = mybatis.selectOne("bt.mapper.goods.selectCountInCart", shopCartVO);
		return Boolean.parseBoolean(result);
	}
	
	public int selectMaxCartId() {
		return mybatis.selectOne("bt.mapper.goods.selectMaxCartId");
	}

	public List<ShopCartVO> selectCartList(String member_id){
		return mybatis.selectList("bt.mapper.goods.selectCartList", member_id);
	}
	
	public List<ShopGoodsVO> selectGoodsListForCart(List<ShopCartVO> myCartList){
		return mybatis.selectList("bt.mapper.goods.selectGoodsListForCart", myCartList);
	}
	

}
