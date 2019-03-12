package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019/03/07
 * 이름 : 강승원
 * 내용 : Ioc 실습하기 
 */
public class IocTest {
	
	public static void main(String[] args) {
		
		// Ioc 적용안했을때(결합도가 높다)
		LGTV ltv = new LGTV();
		ltv.power();
		ltv.chUp();
		ltv.chDown();
	
		// 다형성을 적용한 결합도 낮추기
		TV stv = new SamsungTV(); // 인터페이스 : component간의 중간매개역할, Method와 Stv 매개역할
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc 를 적용한 객체주입
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml"); // spring 설정파일을 ctx 객체로 생성
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
