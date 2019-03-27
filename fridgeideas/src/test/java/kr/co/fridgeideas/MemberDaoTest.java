package kr.co.fridgeideas;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.MemberDAO;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.TermsVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit 테스트 클래스를 실행시킬 환경(클래스)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // 애플리케이션, 서블릿 컨텍스트를 사용함
public class MemberDaoTest {
	
	@Inject
	private MemberDAO dao;
	
	
	public void terms() {
		TermsVO termsVO = dao.terms();
		
		System.out.println("약관 가져오기 성공!!!" + termsVO.getTerms());
	}
	
	
	public void idCheck() {
		int count = dao.idCheck("aaaa");
		
		System.out.println("아이디 체크 성공!! 카운트 결과 : " + count);
	}
	
	public void EmailCheck() {
		int count = dao.emailCheck("gildong@gmail.com");
		
		System.out.println("이메일 체크 성공!! 카운트 결과 : " + count);
	}
	
	@Test
	public void login() {
		MemberVO memberVO = new MemberVO();
		memberVO.setUid("aaaa");
		memberVO.setPass("1111");
		
		memberVO = dao.login(memberVO);
		System.out.println("로그인 성공!! 닉네임 : " +memberVO.getNick());
	}
}
