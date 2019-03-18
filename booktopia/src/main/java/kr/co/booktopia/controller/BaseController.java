package kr.co.booktopia.controller;

import java.io.File;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.coobird.thumbnailator.Thumbnails;

@Controller
public class BaseController {
	
	/*
	 *  이미지 썸네일 메서드
	 *   - 웹 애플리케이션에서 이미지를 목록으로 표시할 때는 썸네일 이미지를 사용한다.
	 *   - 웹 브라우저에 표시할 이미지 갯수가 많은 경우 이미지를 썸네일로 축소해서 신속하세 표시한다.
	 *   - pom.xml 썸네일 라이브러리 추가 (thumbnailator-0.4.8.jar)
	 */
	
	@RequestMapping("/goods/thumbnail")
	protected void thumbnails(String fileName,
							  String goods_id,
							  HttpServletRequest request,
							  HttpServletResponse response) throws Exception {
		
		String imgPath = request.getSession().getServletContext().getRealPath("/")+"resources/goods";
		
		OutputStream out = response.getOutputStream();
		String filePath = imgPath+"/"+goods_id+"/"+fileName;
		File image = new File(filePath);
		
		if(image.exists()) {
			// 썸네일 크기 설정 및 형식 출력
			Thumbnails.of(image).size(121,154).outputFormat("png").toOutputStream(out);
		} 
		
		byte[] buffer = new byte[1024*8];
		out.write(buffer);
		out.close();
	}

}
