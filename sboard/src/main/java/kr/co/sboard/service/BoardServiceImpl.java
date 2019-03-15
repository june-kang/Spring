package kr.co.sboard.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDao dao;
	
	@Override
	public List<BoardVO> list(int start) {
		return dao.list(start);
	}
	
	@Override
	public int getTotalCount() {
		return dao.getTotalCount();
	}
	
	@Override
	public int getPageEnd(int total) {
		int pageEnd = 0;
		
		if(total % 10 == 0) {
			pageEnd = total / 10;
		}else {
			pageEnd = (total / 10) + 1;
		}
		
		return pageEnd;
	}
	
	@Override
	public int getLimitStart(String pg) {
		
		int start = 0;
				
		if(pg == null){
			start = 1;
		}else{
			start = Integer.parseInt(pg);
		}
				
		return (start - 1) * 10;
	}

	@Override
	public int getPageCountStart(int total, int limit) {
		return total - limit + 1;
	}

	@Override
	public int[] getPageGroupStartEnd(String pg, int pageEnd) {
		
		int[] groupStartEnd = new int[2];
		int current = 0;
		
		if(pg==null) {
			current = 1;
		}else {
			current = Integer.parseInt(pg);
		}
		
		int currentPage = current;
		int currentPageGroup =(int) Math.ceil(currentPage/10.0);  // 실수로 나눠서 올림함
		int groupStart = (currentPageGroup-1)*10+1;
		int groupEnd = (currentPageGroup)*10;
		
		if(groupEnd > pageEnd){
			groupEnd = pageEnd;
		}
		groupStartEnd[0] = groupStart;
		groupStartEnd[1] = groupEnd;
		
		return groupStartEnd;
	}

	@Override
	public int write(BoardVO vo) {
		return dao.write(vo);
	}
	
	@Override
	public FileVO fileUpload(HttpServletRequest req, MultipartFile file) {
		
		// 파일 업로드 처리 시작
		// 파일이 저장될 디렉터리 경로설정
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		FileVO fvo = new FileVO();
		
		// 파일이 첨부됐을때
		String oName = file.getOriginalFilename();
		String ext = oName.substring(oName.lastIndexOf(".")); // 확장자
		
		// 고유파일명 생성
		String uName = UUID.randomUUID().toString()+ext;  // Universal Unique ID
		
		// 파일전송
		try {
			file.transferTo(new File(path+uName));
			fvo.setNewName(uName);
			fvo.setOldName(oName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		// 처리끝		
		return fvo; 
	}
		
	@Override
	public void fileWrite(FileVO fvo) {
		dao.fileWrite(fvo);
	}

	@Override
	public FileVO fileDownload(int parent) {
		return dao.fileDownload(parent);
	}
	
	@Override
	public void fileUpdate(int parent) {
		dao.fileUpdate(parent);
	}

	@Override
	public BoardVO view(int seq) {
		return dao.view(seq);
	}
	
	@Override
	public void updateHit(int seq) {
		dao.updateHit(seq);
	}

	@Override
	public int modify(BoardVO vo) {
		return dao.modify(vo);
	}

	@Override
	public void delete(int seq) {
		dao.delete(seq);
	}

	@Override
	public void commentWrite(BoardVO vo) {
		dao.commentWrite(vo);
	}
	

	@Override
	public void commentDelete(int seq) {
		dao.commentDelete(seq);
	}

	@Override
	public void commentModify() {
		
	}
	
	@Override
	public List<BoardVO> commentList(int parent) {
		return dao.commentWrite(parent);
	}

	@Override
	public void commentCountPlus(int seq) {
		dao.commentCountPlus(seq);
	}

	@Override
	public void commentCountMinus(int seq) {
		dao.commentCountMinus(seq);
	}


	

	

	

	

	

	

	

	

}
