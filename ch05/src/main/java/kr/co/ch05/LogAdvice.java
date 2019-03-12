package kr.co.ch05;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	/*각자 메소드가 어드바이스, 포인트컷 실행될때 어드바이스 같이 실행*/
	public void beforeLog() {
		System.out.println("=======================");
		System.out.println("횡단관심 - beforeLog ...");
	}
	
	public void afterLog() {
		System.out.println("횡단관심 - afterLog ...");
		System.out.println("-----------------------");
	}
	
}