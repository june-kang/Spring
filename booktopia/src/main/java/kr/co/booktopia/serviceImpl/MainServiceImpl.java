package kr.co.booktopia.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.MainDAO;
import kr.co.booktopia.service.MainService;
import kr.co.booktopia.vo.ShopGoodsVO;

@Service
public class MainServiceImpl implements MainService {
	
	@Inject
	private MainDAO dao;

	@Override
	public Map<String, List<ShopGoodsVO>> listGoods() throws Exception {
		
		Map<String, List<ShopGoodsVO>> goodsMap = new HashMap<String, List<ShopGoodsVO>>();
		
		List<ShopGoodsVO> goodsList = dao.selectGoodsList("bestseller");
		goodsMap.put("bestseller", goodsList);
		
		goodsList = dao.selectGoodsList("newbook");
		goodsMap.put("newbook", goodsList);
		
		goodsList = dao.selectGoodsList("steadyseller");
		goodsMap.put("steadyseller", goodsList);
		
		return goodsMap;
		
	}
	

}
