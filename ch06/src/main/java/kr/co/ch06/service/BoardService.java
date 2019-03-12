package kr.co.ch06.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	
	/*before*/
	public void insert() throws Exception { /*afterthow : 예외발생시 실행*/
		System.out.println("핵심관심 - insert");
		/*after-returning*/
	}
	/*after*/
	
	public void select() throws Exception {
		System.out.println("핵심관심 - select");
	}
	
	public void update() throws Exception {
		System.out.println("핵심관심 - update");
	}
	
	public void delete() throws Exception {
		System.out.println("핵심관심 - delete");
		
//		// NullPointException
//		String str = null;
//		str.toString();
	}
	
	
}