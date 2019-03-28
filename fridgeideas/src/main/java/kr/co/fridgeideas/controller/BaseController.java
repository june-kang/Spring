package kr.co.fridgeideas.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	
	// ���� �̹��� ��������
	@RequestMapping(value="/image/download")
	protected void download(String fileName,
							int seq,
							HttpServletRequest req,
							HttpServletResponse resp) throws Exception {
		
		String imgPath = req.getSession().getServletContext().getRealPath("/")+"/resources/upload/";
		
		OutputStream out = resp.getOutputStream();
		String filePath = imgPath + seq + "/" + fileName;
		
		File image = new File(filePath);
		
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Content-Disposition", "attachment; filename="+fileName);
		resp.setHeader("Content-Transfer-Encoding", "binary");
		resp.setHeader("Pragma", "no-cache");
		
		// ��Ʈ�� ���� ����----��ü
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(image));
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
		
		byte buffer[] = new byte[1024*8];
		
		while(true) {
			// Input ��Ʈ������ ������ �о����
			int read = bis.read(buffer);
			if(read == -1) {
				break;
			}
			// Output ��Ʈ������ ������ ����
			bos.write(buffer, 0, read);
		}
		bis.close();
		bos.close();
	}

}
