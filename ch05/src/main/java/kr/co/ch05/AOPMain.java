package kr.co.ch05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
  날짜 : 2019/03/06
  이름 : 강승원
  내용 : AOP 실습하기
  
 스프링 AOP
  - 핵심관심과 전체에 적용되는 공통관심(횡단관심)을 분리해서 프로그래밍하는 방식
  
 주요용어
 1) 조인포인트(JoinPoint)
  - 실행하는 모든 비즈니스 메서드(핵심관심)
  
 2) 포인트컷(Pointcut)
  - 조인포인트들 가운데 실행하는 핵심모듈
 
 3) 어드바이스(Advice)
  - 횡단관심에 해당하는 공통의 부가기능모듈
  
 4) 애스펙트(Aspect)
  - 포인트컷과 어드바이스의 결합
  
 5) 위빙(Weaving)
  - 포인트컷으로 지정한 핵심기능이 실행될때, 어드바이스에 해당하는 횡단관심모듈이 삽입되는 과정
  
  포인트컷 표현식
  execution(리턴타입 패키지명.클래스명.메서드명(매개변수))
  
 1) 리턴타입
  - *        : 모든 리턴타입 허용
  - void     : 리턴타입이 void인 메서드
  - !void    : 리턴타입이 void가 아닌 메서드
  
 2) 패키지명
  - kr.co.ch1    : 해당 패키지 대상
  - kr.co.ch1..  : kr.co.ch1로 시작하는 모든 패키지 대상
  - kr.co.ch1..service : kr.co.ch1로 시작해서 마지막 패키지가 service로 끝나는 패키지 대상
  
 3) 클래스명
  - BoardService : 해당 클래스 대상
  - *Service : 접미사 Service로 끝나는 클래스 대상
  
 4) 메서드명
  - *(..)  : 매개변수가 제한이 없는 모든 메서드
  - *(*) : 매개변수를 1개 갖는 모든 메서드
  - get*(..) : 매개변수가 제한이 없고 이름이 get으로 시작하는 메서드 
 */




public class AOPMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService)ctx.getBean("boardService");
		
		bs.insert();
		bs.select();
		bs.update();
		bs.delete();
	}
}
