package kr.co.booktopia.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.MainService;
import kr.co.booktopia.vo.ShopGoodsVO;

@Controller
public class MainController {
	
	@Inject
	private MainService service;
	
	@RequestMapping(value= {"/", "", "/index"})
	public String index(Model model) throws Exception {
		
		Map<String, List<ShopGoodsVO>> goodsMap = service.listGoods();
		model.addAttribute("goodsMap", goodsMap);
			
		return "/index";
	}

}
