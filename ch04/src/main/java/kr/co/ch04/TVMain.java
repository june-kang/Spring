package kr.co.ch04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019/03/05
 * 이름 : 강승원
 * 내용 : Ioc 실습하기
 * 
 * 어노테이션 종류
 * @Component(@Controller, @Service, @Repository)
 *  - 스프링 컨테이너가 해당 어노테이션 클래스를 객체관리하기 위한 어노테이션
 * @Inject
 *  - 멤버변수 해당 타입에 맞는 객체를 주입 받는 어노테이션(자바전용)
 * @Autowired
 *  - 멤버변수 해당 타입에 맞는 객체를 주입 받는 어노테이션(스프링전용)
 * @Resource
 *  - 의존성주입이 되는 객체가 2개 이상일 때, 아이디를 지정해서 한정하는 어노테이션
 */
public class TVMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV stv = (SamsungTV)ctx.getBean("samsungTV");
		TV ltv = (LgTV)ctx.getBean("lgTV");
		
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
