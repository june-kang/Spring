package kr.co.ch07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/07
 * �̸� : ���¿� 
 * ���� : ������̼Ǳ�� AOP �ǽ��ϱ�
 */

public class AOPMain {

	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		System.out.println("=========================");
		bs.insert();
		System.out.println("-------------------------");
		
		System.out.println("=========================");
		bs.select();
		System.out.println("-------------------------");
		
		System.out.println("=========================");
		bs.update();
		System.out.println("-------------------------");
		
		System.out.println("=========================");
		bs.delete();
		System.out.println("-------------------------");
	}
}