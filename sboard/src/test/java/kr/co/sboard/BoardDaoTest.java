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
		vo.setTitle("���� �׽�Ʈ�Դϴ�.");
		vo.setContent("����");
		vo.setUid("aaaa");
		vo.setRegip("129.1.1.1");
		
		int seq = dao.write(vo);
		
		System.out.println("write �׽�Ʈ �Ϸ�!! : "+ seq);
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
		
		vo.setTitle("�����̷�Ʈ�� �ȵ�");
		vo.setContent("��������?...");
		
		int seq = dao.modify(vo);
		
		System.out.println("modify �Ϸ�! seq : " + seq);
	}
	
	@Test
	public void commentWriteTest() {
		
		BoardVO vo = new BoardVO();
		vo.setParent(2163);
		vo.setContent("����׽�Ʈ�Դϴ�.");
		vo.setUid("aaaa");
		vo.setRegip("129.1.1.1");
		
		dao.commentWrite(vo);
		System.out.println("commentWrite �Ϸ�!");
	}
	

}
