package kr.co.fridgeideas.serviceImpl;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.fridgeideas.dao.BoardDAO;
import kr.co.fridgeideas.service.BoardService;
import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject BoardDAO dao;
	
	@Override
	public int commuWrite(BoardVO vo) {
		return dao.commuWrite(vo);
	}

	@Override
	public void fileUpload(HttpServletRequest req, MultipartFile file, int seq) {
		
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/"+seq+"/";  // 파일을 저장할 경로
		String fileName = file.getOriginalFilename();
		
		try {
			File dir = new File(path);
			File desti = new File(path+fileName);
			
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			file.transferTo(desti);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int fileWrite(ImageVO ivo) {
		return dao.fileWrite(ivo);
	}

	@Override
	public List<BoardVO> commuList() {
		return dao.commuList();
	}


}
