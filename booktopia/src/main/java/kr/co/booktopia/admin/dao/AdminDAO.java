package kr.co.booktopia.admin.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Repository
public class AdminDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void admin(){}
	
	public int addGoods(ShopGoodsVO shopGoodsVO){
		mybatis.insert("bt.mapper.admin.insertGoods", shopGoodsVO);
		return shopGoodsVO.getGoods_id();
	}
	
	public void addImage(ShopGoodsImageVO ivo) {
		mybatis.insert("bt.mapper.admin.insertImage", ivo);
	}
	
	public void order(){}
	
	public void member(){}

}
