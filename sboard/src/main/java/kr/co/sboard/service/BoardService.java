package kr.co.sboard.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;


public interface BoardService {
	
	// 리스트용 BoardService
	public List<BoardVO> list(int start);
	public int getTotalCount();
	public int getPageEnd(int total);
	public int getLimitStart(String pg);
	public int getPageCountStart(int total, int limit);
	public int[] getPageGroupStartEnd(String pg, int pageEnd);
	
	public int write(BoardVO vo);
	public FileVO fileUpload(HttpServletRequest req, MultipartFile file);
	public void fileWrite(FileVO fvo);
	public FileVO fileDownload(int parent);
	public void fileUpdate(int parent);
	
	public BoardVO view(int seq);
	public void updateHit(int seq);
	public int modify(BoardVO vo);
	public void delete(int seq);
	
	public void commentWrite(BoardVO vo);
	public void commentDelete(int seq);
	public void commentModify();
	public List<BoardVO> commentList(int parent);
	public void commentCountPlus(int seq);
	public void commentCountMinus(int seq);
}
