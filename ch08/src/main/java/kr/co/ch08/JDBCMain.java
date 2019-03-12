package kr.co.ch08;
/*
 * 날짜 : 19/03/07
 * 이름 : 강승원
 * 내용 : 스프링 JDBC 실습하기
 */

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		UserService user = (UserService) ctx.getBean("userServiceImpl");
		
//		// insert
//		UserVO vo = new UserVO();
//		vo.setUid("p102");
//		vo.setName("김유신");
//		vo.setHp("010-7856-8945");
//		vo.setAddr("신라");
//		vo.setPos("대리");
//		vo.setDep(102);
//		
//		user.insertUser(vo);
		
		// select
		List<UserVO> list = user.selectUserList();
		for (UserVO u : list) {
			System.out.println("=====================");
			System.out.println("uid : "+u.getUid());
			System.out.println("uid : "+u.getName());
			System.out.println("uid : "+u.getRdate());
			System.out.println("---------------------");			
		}
		
		UserVO userOne = user.selectUserOne("p102");
		System.out.println("---Select User ONE---");
		System.out.println("uid : "+userOne.getUid());
		System.out.println("uid : "+userOne.getName());
		System.out.println("uid : "+userOne.getRdate());
		System.out.println("---------------------");

		
		// update
		user.updateUser();
		
		// delete
		user.deleteUser();
		
	}

}
