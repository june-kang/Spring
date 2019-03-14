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
		int currentPageGroup =(int) Math.ceil(currentPage/10.0);  // �Ǽ��� ������ �ø���
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
	public void write(BoardVO vo) {
		dao.write(vo);
	}
	
	@Override
	public int fileUpload(HttpServletRequest req, MultipartFile file) {
		
		// ���� ���ε� ó�� ����
		// ������ ����� ���͸� ��μ���
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		if(!file.isEmpty()) {
			// ������ ÷�ε�����
			String oName = file.getOriginalFilename();
			String ext = oName.substring(oName.lastIndexOf(".")); // Ȯ����
			
			// �������ϸ� ����
			String uName = UUID.randomUUID().toString()+ext;  // Universal Unique ID
			
			// ��������
			try {
				file.transferTo(new File(path+uName));
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 1; 
		} else {
			return 0;
		}
		
		// ó����		
	}

	@Override
	public void fileDownload() {
		
	}

	@Override
	public void view() {
		
	}

	@Override
	public void modify() {
		
	}

	@Override
	public void delete() {
		
	}

	

	

	

	

}
