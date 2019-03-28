package kr.co.fridgeideas;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.BoardDAO;
import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class BoardDaoTest {
	
	@Inject
	private BoardDAO dao;
	
	
	public void fileWriteTest() {
		ImageVO ivo = new ImageVO();
		
		ivo.setFileType("recipe");
		ivo.setRecipe_id(2);
		ivo.setFileName("�׽�Ʈ");
		ivo.setReg_id("aaaa");
		
		dao.fileWrite(ivo);
		
		System.out.println("�̹��� ���̺� ���ε� ����!! " + ivo.getSeq());
	}
	
	
	public void commuListTest() {
		List<BoardVO> list = dao.commuList();
		
		for(BoardVO vo : list) {
			System.out.println(vo.getSeq());
		}
	}
	
	
	public void viewTest() {
		BoardVO boardVO = dao.view(3);
		
		System.out.println("�� �ҷ����� ����!! " + boardVO.getSeq());
	}
	
	@Test
	public void commentWrite() {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setParent(2);
		boardVO.setUid("aaaa");
		boardVO.setContent("commentWriteDao �׽�Ʈ");
		boardVO.setRegip("0:0:0:0:0:0:0:1");
		
		dao.commentWrite(boardVO);
		
		System.out.println("����Է� ����!" + boardVO.getRdate());
	}
}
