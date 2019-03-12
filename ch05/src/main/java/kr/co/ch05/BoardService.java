package kr.co.ch05;

import org.springframework.stereotype.Component;

@Component
public class BoardService {

	public void insert() {
		
		System.out.println("ÇÙ½É°ü½É - insert ..."); /*Æ÷ÀÎÆ®ÄÆ*/
	}
	
	public void select() {
		System.out.println("ÇÙ½É°ü½É - select ...");
	}
	
	public void update() {
		System.out.println("ÇÙ½É°ü½É - update ...");
	}
	
	public void delete() {
		System.out.println("ÇÙ½É°ü½É - delete ...");
	}
}
