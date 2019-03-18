package kr.co.booktopia;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.booktopia.dao.MemberDAO;
import kr.co.booktopia.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class MemberDaoTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setMember_id("hong");
		vo.setMember_pw("1212");
		
		MemberVO user = dao.login(vo);
		System.out.println("�α��μ���!!" + user.getMember_id() + user.getMember_pw());
	}

}
