package kr.co.booktopia.service;

import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public interface ShopService {
	
	public void search();
	public void list();
	public ShopGoodsVO goodsView(int goods_id);
	public ShopGoodsImageVO goodsDetailImage(int goods_id);
	public void order();
	public void cart();

}
