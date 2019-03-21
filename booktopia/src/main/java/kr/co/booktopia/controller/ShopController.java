package kr.co.booktopia.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.MemberVO;
import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Controller
public class ShopController {
	
	@Inject
	private ShopCartVO shopCartVO; // kr.co.booktopia.vo.ShopCartVO 상단에 @Component 추가
	
	@Inject
	private MemberVO memberVO;
	
	@Inject
	private ShopService service;
	
	@RequestMapping(value="/shop/search")
	public String search(Model model, String searchWord) {
		
		List<ShopGoodsVO> list = service.search(searchWord);
		
		model.addAttribute("list", list);
		
		return "/shop/list";
	}
	
	@RequestMapping(value="/shop/list")
	public String list() {
		
		return "/shop/list";
	}
	
	@RequestMapping(value="/shop/view")
	public String view(Model model, int goods_id) {
		
		ShopGoodsVO vo = service.goodsView(goods_id);
		List<ShopGoodsImageVO> list = service.goodsDetailImage(goods_id);
		model.addAttribute(vo);
		model.addAttribute("list", list);
		
		return "/shop/view";
	}
	
	@RequestMapping(value="/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@RequestMapping(value="/shop/cart")
	public String cart(HttpSession sess) {
		memberVO = (MemberVO) sess.getAttribute("memberVO");
		String member_id = memberVO.getMember_id();
		
		Map<String, List<?>> cartMap = service.myCartList(member_id);
		sess.setAttribute("cartMap", cartMap);
		
		return "/shop/cart";
	}
	
	@ResponseBody
	@RequestMapping(value="/shop/addGoodsInCart")
	public String addGoodsInCart(int goods_id, HttpServletRequest req, HttpServletResponse resp) {
		
		HttpSession sess = req.getSession();
		memberVO = (MemberVO) sess.getAttribute("memberVO");
		System.out.println(memberVO.getMember_id());
		
		shopCartVO.setMember_id(memberVO.getMember_id());
		shopCartVO.setGoods_id(goods_id);
		
		boolean isAlreadyExisted = service.findGoodsInCart(shopCartVO);
		
		if(isAlreadyExisted) {
			return "exist";
		} else {
			service.addGoodsInCart(shopCartVO);
			return "success";
		}		
	}
	
	@RequestMapping(value="/shop/keywordAutoComplete")
	@ResponseBody
	public Map<String, List<String>> keywordAutoComplete(String keyword,
														 HttpServletRequest request,
														 HttpServletResponse response) {
		List<String> keywordList = service.keywordAutoComplete(keyword);
		
		//JSON 데이터 객체 생성(jackson 라이브러리 필요)
		Map<String, List<String>> json = new HashMap<String, List<String>>();
		json.put("keyword", keywordList);
		
		return json;
	}

}
