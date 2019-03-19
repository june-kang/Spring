package kr.co.booktopia.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Controller
public class ShopController {
	
	@Inject
	private ShopService service;
	
	@RequestMapping(value="/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@RequestMapping(value="/shop/list")
	public String list() {
		return "/shop/list";
	}
	
	@RequestMapping(value="/shop/view")
	public String view(Model model, int goods_id) {
		
		ShopGoodsVO vo = service.goodsView(goods_id);
		ShopGoodsImageVO ivo = service.goodsDetailImage(goods_id);
		model.addAttribute(vo);
		model.addAttribute(ivo);
		
		return "/shop/view";
	}
	
	@RequestMapping(value="/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@RequestMapping(value="/shop/cart")
	public String cart() {
		return "/shop/cart";
	}

}
