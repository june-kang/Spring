package kr.co.fridgeideas.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

public interface BoardService {
	
	public int commuWrite(BoardVO vo);
	public void fileUpload(HttpServletRequest req, MultipartFile file, int commu_id);
	public int fileWrite(ImageVO ivo);
	public List<BoardVO> commuList();
	public BoardVO view(int seq);
	public void updateView(int seq);
	public List<ImageVO> commuBoardImage(int seq);
	public String commentWrite(BoardVO boardVO);
	public List<BoardVO> commentList(int parent);
	public void updateCommentCount(int parent);
	public int recipeWrite(RecipeVO recipeVO);
	public void multipleFileUpload(HttpServletRequest req, int recipe_id, HashMap<String, MultipartFile> map);
}
