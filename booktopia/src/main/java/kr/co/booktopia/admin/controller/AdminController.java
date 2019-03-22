package kr.co.booktopia.admin.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.co.booktopia.admin.service.AdminService;
import kr.co.booktopia.vo.MemberVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;



@Controller
public class AdminController {
	
	@Inject
	private AdminService service;
	
	@RequestMapping(value= {"/admin", "/admin/index"})
	public String admin() {
				
		return "/admin/index";
	}
	
	@RequestMapping(value= {"/admin/goods", "/admin/goods/index"})
	public String goods() {
		return "/admin/goods/index";
	}
	
	@RequestMapping(value="/admin/goods/add", method=RequestMethod.GET)
	public String add() {
		return "/admin/goods/add";
	}
	
	@RequestMapping(value="/admin/goods/add", method=RequestMethod.POST)
	public String add(ShopGoodsVO shopGoodsVO,HttpServletRequest req, HttpSession sess) {
		
		
		MultipartFile file = shopGoodsVO.getFname();
		if(file!=null) {
			MemberVO memberVO = (MemberVO) sess.getAttribute("memberVO");
			String member_id = memberVO.getMember_id();
			int goods_id = service.add(shopGoodsVO);
			
			ShopGoodsImageVO ivo = service.fileUpload(req, file, goods_id);
			ivo.setReg_id(member_id);
			service.addImage(ivo);
			
			
		} else {
			service.add(shopGoodsVO);
		}

		return "redirect:/admin/goods/add";
	}
	
	@RequestMapping(value= {"/admin/order", "/admin/order/index"})
	public String order() {
		return "/admin/order/index";
	}
	
	@RequestMapping(value= {"/admin/member", "/admin/member/index"})
	public String member(MemberVO memberVO) {
		return "/admin/member/index";
	}

}
