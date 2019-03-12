package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/07
 * �̸� : ���¿�
 * ���� : Ioc �ǽ��ϱ� 
 */
public class IocTest {
	
	public static void main(String[] args) {
		
		// Ioc �����������(���յ��� ����)
		LGTV ltv = new LGTV();
		ltv.power();
		ltv.chUp();
		ltv.chDown();
	
		// �������� ������ ���յ� ���߱�
		TV stv = new SamsungTV(); // �������̽� : component���� �߰��Ű�����, Method�� Stv �Ű�����
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc �� ������ ��ü����
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml"); // spring ���������� ctx ��ü�� ����
		SamsungTV getStv = (SamsungTV) ctx.getBean("stv");
		LGTV getLtv = (LGTV) ctx.getBean("ltv");
		
		getStv.power();
		getStv.chUp();
		getStv.chDown();
		
		getLtv.power();
		getLtv.chUp();
		getLtv.chDown();
	}

}
