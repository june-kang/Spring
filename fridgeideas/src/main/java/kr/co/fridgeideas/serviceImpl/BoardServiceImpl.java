package kr.co.fridgeideas.serviceImpl;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.fridgeideas.dao.BoardDAO;
import kr.co.fridgeideas.service.BoardService;
import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject BoardDAO dao;
	
	@Override
	public int commuWrite(BoardVO vo) {
		return dao.commuWrite(vo);
	}

	@Override
	public void fileUpload(HttpServletRequest req, MultipartFile file, int commu_id) {
		
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/community/"+commu_id+"/";  // 파일을 저장할 경로
		String fileName = file.getOriginalFilename();
		
		try {
			File dir = new File(path);
			File desti = new File(path+fileName);
			
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			file.transferTo(desti);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void multipleFileUpload(HttpServletRequest req, int recipe_id, HashMap<String, MultipartFile> map) {
		
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/recipe/"+recipe_id+"/";
		
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String fileName = itr.next();
			MultipartFile file = map.get(fileName);
			try {
				File dir = new File(path);
				File desti = new File(path+fileName);
				
				if(!dir.exists()) {
					dir.mkdirs();
				}
				file.transferTo(desti);

				
			} catch(Exception e) {
				e.printStackTrace();
			}
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

	@Override
	public BoardVO view(int seq) {
		return dao.view(seq);
	}
	
	@Override
	public String commentWrite(BoardVO boardVO) {
		return dao.commentWrite(boardVO);
	}
	
	@Override
	public List<BoardVO> commentList(int parent) {
		return dao.commentList(parent);
	}

	
	@Override
	public void updateCommentCount(int parent) {
		dao.updateCommentCount(parent);
	}

	@Override
	public void updateView(int seq) {
		dao.updateView(seq);
	}

	@Override
	public List<ImageVO> commuBoardImage(int seq) {
		return dao.commuBoardImage(seq);
	}
	
	@Override
	public int recipeWrite(RecipeVO recipeVO) {
		return dao.recipeWrite(recipeVO);
	}

	

	
	

	


}
