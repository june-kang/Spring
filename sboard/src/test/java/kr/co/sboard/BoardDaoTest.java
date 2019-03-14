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
		
		dao.write(vo);
		
		System.out.println("write 테스트 완료!!");
	}
	
	@Test
	public void getTotalCount() {
		int result =dao.getTotalCount();
		System.out.println("result : " +result);
	}

}
