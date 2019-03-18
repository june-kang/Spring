package kr.co.booktopia.service;

import java.util.List;
import java.util.Map;

import kr.co.booktopia.vo.ShopGoodsVO;

public interface MainService {
	
	public Map<String, List<ShopGoodsVO>> listGoods() throws Exception;

}
