package kr.co.fridgeideas;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.BoardDAO;
import kr.co.fridgeideas.vo.ImageVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class BoardDaoTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void fileWriteTest() {
		ImageVO ivo = new ImageVO();
		
		ivo.setFileType("recipe");
		ivo.setRecipe_id(2);
		ivo.setFileName("테스트");
		ivo.setReg_id("aaaa");
		
		dao.fileWrite(ivo);
		
		System.out.println("이미지 테이블 업로드 성공!! " + ivo.getSeq());
	}
}
