package kr.co.ch05;

import org.springframework.stereotype.Component;

@Component
public class BoardService {

	public void insert() {
		
		System.out.println("�ٽɰ��� - insert ..."); /*����Ʈ��*/
	}
	
	public void select() {
		System.out.println("�ٽɰ��� - select ...");
	}
	
	public void update() {
		System.out.println("�ٽɰ��� - update ...");
	}
	
	public void delete() {
		System.out.println("�ٽɰ��� - delete ...");
	}
}
