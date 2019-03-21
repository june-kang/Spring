package kr.co.booktopia.service;

import java.util.List;
import java.util.Map;

import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public interface ShopService {
	
	public List<ShopGoodsVO> search(String searchWord);
	public void list();
	public ShopGoodsVO goodsView(int goods_id);
	public List<ShopGoodsImageVO> goodsDetailImage(int goods_id);
	public void order();
	public void cart();
	public List<String> keywordAutoComplete(String keyword);
	public void addGoodsInCart(ShopCartVO shopCartVO);
	public boolean findGoodsInCart(ShopCartVO shopCartVO);
	public Map<String, List<?>> myCartList(String member_id);

}
