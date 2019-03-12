package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019/03/05
 * 이름 : 강승원
 * 내용 : Ioc 실습하기
 */
public class TVMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV stv = (SamsungTV)ctx.getBean("stv");
		TV ltv = (LgTV)ctx.getBean("ltv");
		
		stv.power();
		stv.chUp();
		stv.soundUp();
		stv.connect();
		
		ltv.power();
		ltv.chDown();
		ltv.soundDown();
		ltv.disconnect();
		
	}

}
