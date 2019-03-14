package kr.co.sboard.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.vo.BoardVO;


public interface BoardService {
	
	// 리스트용 BoardService
	public List<BoardVO> list(int start);
	public int getTotalCount();
	public int getPageEnd(int total);
	public int getLimitStart(String pg);
	public int getPageCountStart(int total, int limit);
	public int[] getPageGroupStartEnd(String pg, int pageEnd);
	
	public void write(BoardVO vo);
	public int fileUpload(HttpServletRequest req, MultipartFile file);
	public void fileDownload();
	
	public void view();
	public void modify();
	public void delete();

}
