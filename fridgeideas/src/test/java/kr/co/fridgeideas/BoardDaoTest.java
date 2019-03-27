package kr.co.fridgeideas;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.fridgeideas.dao.BoardDAO;
import kr.co.fridgeideas.vo.ImageVO;

@RunWith(SpringJUnit4ClassRunner.class) // Junit �׽�Ʈ Ŭ������ �����ų ȯ��(Ŭ����)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"}) // ���ø����̼�, ���� ���ؽ�Ʈ�� �����
public class BoardDaoTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void fileWriteTest() {
		ImageVO ivo = new ImageVO();
		
		ivo.setFileType("recipe");
		ivo.setRecipe_id(2);
		ivo.setFileName("�׽�Ʈ");
		ivo.setReg_id("aaaa");
		
		dao.fileWrite(ivo);
		
		System.out.println("�̹��� ���̺� ���ε� ����!! " + ivo.getSeq());
	}
}
