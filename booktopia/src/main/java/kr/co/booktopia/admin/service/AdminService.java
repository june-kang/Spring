package kr.co.booktopia.admin.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public interface AdminService {
	
	public void admin();
	public void goods();
	public int add(ShopGoodsVO shopGoodsVO);
	public void addImage(ShopGoodsImageVO ivo);
	public ShopGoodsImageVO fileUpload(HttpServletRequest req, MultipartFile file, int goods_id);
	public void order();
	public void member();
}
