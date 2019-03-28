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

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class BoardDaoTest {
	
	@Inject
	private BoardDAO dao;
	
	
	public void fileWriteTest() {
		ImageVO ivo = new ImageVO();
		
		ivo.setFileType("recipe");
		ivo.setRecipe_id(2);
		ivo.setFileName("테스트");
		ivo.setReg_id("aaaa");
		
		dao.fileWrite(ivo);
		
		System.out.println("이미지 테이블 업로드 성공!! " + ivo.getSeq());
	}
	
	
	public void commuListTest() {
		List<BoardVO> list = dao.commuList();
		
		for(BoardVO vo : list) {
			System.out.println(vo.getSeq());
		}
	}
	
	
	public void viewTest() {
		BoardVO boardVO = dao.view(3);
		
		System.out.println("뷰 불러오기 성공!! " + boardVO.getSeq());
	}
	
	@Test
	public void commentWrite() {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setParent(2);
		boardVO.setUid("aaaa");
		boardVO.setContent("commentWriteDao 테스트");
		boardVO.setRegip("0:0:0:0:0:0:0:1");
		
		dao.commentWrite(boardVO);
		
		System.out.println("댓글입력 성공!" + boardVO.getRdate());
	}
}
