package kr.co.ch06.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	
	/*before*/
	public void insert() throws Exception { /*afterthow : ���ܹ߻��� ����*/
		System.out.println("�ٽɰ��� - insert");
		/*after-returning*/
	}
	/*after*/
	
	public void select() throws Exception {
		System.out.println("�ٽɰ��� - select");
	}
	
	public void update() throws Exception {
		System.out.println("�ٽɰ��� - update");
	}
	
	public void delete() throws Exception {
		System.out.println("�ٽɰ��� - delete");
		
//		// NullPointException
//		String str = null;
//		str.toString();
	}
	
	
}