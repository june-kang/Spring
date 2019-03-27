package kr.co.fridgeideas.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;

public interface BoardService {
	
	public int commuWrite(BoardVO vo);
	public void fileUpload(HttpServletRequest req, MultipartFile file, int seq);
	public int fileWrite(ImageVO ivo);
	public List<BoardVO> commuList();

}
