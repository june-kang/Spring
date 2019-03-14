package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class MemberDaoTest {
	
	@Inject
	private MemberDao dao;
	
	
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("aaaa");
		vo.setPass("1111");
		
		MemberVO user = dao.login(vo);
		
		System.out.println("테스트 결과 : " + user);
	}
	
	 // test하는거 하나만 어노테이션을 준다. 다른 건 지워야함
	public void registerTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("kss1919");
		vo.setPass("1111");
		vo.setName("유관순");
		vo.setNick("관순");
		vo.setEmail("kss1919@gmail.com");
		vo.setHp("010-1247-5134");
		vo.setRegip("0.0.0.0");
		
		dao.register(vo);
		System.out.println("register 테스트 완료!!");
	}
	
	@Test
	public void idCheckTest() {
		String uid = "aaaa";
		int result = dao.idCheck(uid);
		System.out.println("결과 : " + result);
	}
	
}
