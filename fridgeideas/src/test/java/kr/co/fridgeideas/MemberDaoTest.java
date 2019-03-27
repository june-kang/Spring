package kr.co.fridgeideas;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.MemberDAO;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.TermsVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class MemberDaoTest {
	
	@Inject
	private MemberDAO dao;
	
	
	public void terms() {
		TermsVO termsVO = dao.terms();
		
		System.out.println("��� �������� ����!!!" + termsVO.getTerms());
	}
	
	
	public void idCheck() {
		int count = dao.idCheck("aaaa");
		
		System.out.println("���̵� üũ ����!! ī��Ʈ ��� : " + count);
	}
	
	public void EmailCheck() {
		int count = dao.emailCheck("gildong@gmail.com");
		
		System.out.println("�̸��� üũ ����!! ī��Ʈ ��� : " + count);
	}
	
	@Test
	public void login() {
		MemberVO memberVO = new MemberVO();
		memberVO.setUid("aaaa");
		memberVO.setPass("1111");
		
		memberVO = dao.login(memberVO);
		System.out.println("�α��� ����!! �г��� : " +memberVO.getNick());
	}
}
