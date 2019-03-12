package kr.co.ch06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch06.service.BoardService;

/*
 * 날짜 : 2019/03/06
 * 이름 : 강승원
 * 내용 : Advise 동작시점 실습하기
 */

public class AOPMain {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		System.out.println("================");
		bs.insert();
		System.out.println("----------------");
		
		System.out.println("================");
		bs.select();
		System.out.println("----------------");
		
		System.out.println("================");
		bs.update();
		System.out.println("----------------");
		
		System.out.println("================");
		bs.delete();
		System.out.println("----------------");
		
	}

}
