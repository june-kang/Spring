package kr.co.booktopia.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Inject
	private ShopDAO dao;

	@Override
	public List<ShopGoodsVO> search(String searchWord) {
		return dao.search(searchWord);
	}

	@Override
	public void list() {
		
	}

	@Override
	public ShopGoodsVO goodsView(int goods_id) {
		return dao.goodsView(goods_id);
	}
	
	@Override
	public List<ShopGoodsImageVO> goodsDetailImage(int goods_id) {
		return dao.goodsDetailImage(goods_id);
	}

	@Override
	public void order() {
		
	}

	@Override
	public void cart() {
		
	}

	@Override
	public List<String> keywordAutoComplete(String keyword) {
		return dao.keywordAutoComplete(keyword);
	}

	@Override
	public void addGoodsInCart(ShopCartVO shopCartVO) {
		dao.addGoodsInCart(shopCartVO);
		
	}

	@Override
	public boolean findGoodsInCart(ShopCartVO shopCartVO) {
		return dao.findGoodsInCart(shopCartVO);
	}

	@Override
	public Map<String, List<?>> myCartList(String member_id) {
		Map<String, List<?>> cartMap = new HashMap<String, List<?>>();
		
		List<ShopCartVO> myCartList = dao.selectCartList(member_id);
		
		if(myCartList.size() == 0) {
			return null;
		}
		
		List<ShopGoodsVO> myGoodsList = dao.selectGoodsListForCart(myCartList);
		cartMap.put("myCartList", myCartList);
		cartMap.put("myGoodsList", myGoodsList);
		return cartMap;
	}

	

}
