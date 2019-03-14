package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class MemberDaoTest {
	
	@Inject
	private MemberDao dao;
	
	
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("aaaa");
		vo.setPass("1111");
		
		MemberVO user = dao.login(vo);
		
		System.out.println("�׽�Ʈ ��� : " + user);
	}
	
	 // test�ϴ°� �ϳ��� ������̼��� �ش�. �ٸ� �� ��������
	public void registerTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("kss1919");
		vo.setPass("1111");
		vo.setName("������");
		vo.setNick("����");
		vo.setEmail("kss1919@gmail.com");
		vo.setHp("010-1247-5134");
		vo.setRegip("0.0.0.0");
		
		dao.register(vo);
		System.out.println("register �׽�Ʈ �Ϸ�!!");
	}
	
	@Test
	public void idCheckTest() {
		String uid = "aaaa";
		int result = dao.idCheck(uid);
		System.out.println("��� : " + result);
	}
	
}
