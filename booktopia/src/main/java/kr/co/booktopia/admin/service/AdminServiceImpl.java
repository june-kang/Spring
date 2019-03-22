package kr.co.booktopia.admin.service;

import java.io.File;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.booktopia.admin.dao.AdminDAO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	private AdminDAO dao;
	
	@Override
	public void admin() {
		
		
	}

	@Override
	public void goods() {
		
	}

	@Override
	public int add(ShopGoodsVO shopGoodsVO) {
		return dao.addGoods(shopGoodsVO);
	}
	
	@Override
	public void addImage(ShopGoodsImageVO ivo) {
		dao.addImage(ivo);
	}
	
	@Override
	public ShopGoodsImageVO fileUpload(HttpServletRequest req, MultipartFile file, int goods_id) {
		
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/goods/"+goods_id+"/";
		
		ShopGoodsImageVO ivo = new ShopGoodsImageVO();
				
		String fileName = file.getOriginalFilename();
		int idx = fileName.lastIndexOf("_");
				
		String fileType = fileName.substring(idx+1, idx+3);
		if(fileType.equals("∏ﬁ¿Œ")) {
			fileType = "main_image";
		} else {
			fileType = "detail_image";
		}
		
		ivo.setGoods_id(goods_id);
		ivo.setFileName(fileName);
		ivo.setFileType(fileType);
		
		
		try { 
			File dir = new File(path);
			File desti = new File(path+fileName);
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			file.transferTo(desti);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ivo;
		
		
	}

	@Override
	public void order() {
		
	}

	@Override
	public void member() {
		
	}

	

	

	

}
