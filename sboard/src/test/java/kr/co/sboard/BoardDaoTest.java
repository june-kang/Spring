package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"})
public class BoardDaoTest {
	
	@Inject
	private BoardDao dao;
	
	
	public void writeTest(){
		BoardVO vo = new BoardVO();
		
		vo.setCate("notice");
		vo.setTitle("제목 테스트입니다.");
		vo.setContent("내용");
		vo.setUid("aaaa");
		vo.setRegip("129.1.1.1");
		
		int seq = dao.write(vo);
		
		System.out.println("write 테스트 완료!! : "+ seq);
	}
	
	
	public void getTotalCountTest() {
		int result =dao.getTotalCount();
		System.out.println("result : " +result);
	}
	
	
	public void viewTest() {
		int seq = 2096;
		BoardVO vo = dao.view(seq);
		System.out.println(vo.getTitle());
	}
	
	
	public void modifyTest() {
		BoardVO vo = new BoardVO();
		
		vo.setSeq(2149);
		
		vo.setTitle("리다이렉트가 안됨");
		vo.setContent("포워드임?...");
		
		int seq = dao.modify(vo);
		
		System.out.println("modify 완료! seq : " + seq);
	}
	
	@Test
	public void commentWriteTest() {
		
		BoardVO vo = new BoardVO();
		vo.setParent(2163);
		vo.setContent("댓글테스트입니다.");
		vo.setUid("aaaa");
		vo.setRegip("129.1.1.1");
		
		dao.commentWrite(vo);
		System.out.println("commentWrite 완료!");
	}
	

}
