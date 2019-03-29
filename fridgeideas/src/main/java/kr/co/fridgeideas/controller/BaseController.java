package kr.co.fridgeideas.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.coobird.thumbnailator.Thumbnails;

@Controller
public class BaseController {
	
	
	// 보드 이미지 가져오기
	@RequestMapping(value="/image/download")
	protected void download(String fileName,
							int seq,
							String fileType,
							HttpServletRequest req,
							HttpServletResponse resp) throws Exception {
		
		String imgPath = req.getSession().getServletContext().getRealPath("/")+"/resources/upload/";
		String filePath = "";
		OutputStream out = resp.getOutputStream();
		
		if(fileType.equals("community")) {
			filePath = imgPath + "community/" + seq + "/" + fileName;
		} else if(fileType.equals("recipe")) {
			filePath = imgPath + "recipe/" + seq + "/" + fileName;
		}
		
		
		File image = new File(filePath);
		
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Content-Disposition", "attachment; filename="+fileName);
		resp.setHeader("Content-Transfer-Encoding", "binary");
		resp.setHeader("Pragma", "no-cache");
		
		// 스트림 연결 파일----객체
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(image));
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
		
		byte buffer[] = new byte[1024*8];
		
		while(true) {
			// Input 스트림으로 데이터 읽어오기
			int read = bis.read(buffer);
			if(read == -1) {
				break;
			}
			// Output 스트림으로 데이터 쓰기
			bos.write(buffer, 0, read);
		}
		bis.close();
		bos.close();
	}
	
	@RequestMapping(value="/image/thumbnail")
	protected void thumbnails(String fileName,
							  String recipe_id,
							  HttpServletRequest req,
							  HttpServletResponse resp) throws IOException {
		
		String imgPath = req.getSession().getServletContext().getRealPath("/")+"resources/upload/recipe/";
		
		OutputStream out = resp.getOutputStream();
		String filePath = imgPath + recipe_id + "/" + fileName;
		File image = new File(filePath);
		
		if(image.exists()) {
			// 썸네일 크기 설정 및 형식 출력
			Thumbnails.of(image).size(310,297).outputFormat("png").toOutputStream(out);
			
			byte[] buffer = new byte[1024*8];
			out.write(buffer);
			out.close();
		}
		
	}

}
