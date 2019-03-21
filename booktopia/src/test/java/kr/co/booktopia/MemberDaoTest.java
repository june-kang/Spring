package kr.co.booktopia;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.booktopia.dao.MemberDAO;
import kr.co.booktopia.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class MemberDaoTest {
	
	@Inject
	private MemberDAO dao;
	
	
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setMember_id("hong");
		vo.setMember_pw("1212");
		
		MemberVO user = dao.login(vo);
		System.out.println("로그인성공!!" + user.getMember_id() + user.getMember_pw());
	}
	
	@Test
	public void idCheck() {
		int count = dao.idCheck("aaaa");
		System.out.println("아이디체크 성공!! result = " + count);
	}
	
	
}

