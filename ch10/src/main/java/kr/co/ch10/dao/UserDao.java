package kr.co.ch10.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch10.vo.UserVO;

@Repository
public class UserDao {
	
	@Inject
	private JdbcTemplate jdbc; // spring jdbc 객체, mybatis 있으면 사용안함
	
	@Inject
	private SqlSessionTemplate mybatis; // mybatis 객체
	
	
	public List<UserVO> userList() {
		
		// Spring JDBC 방식
		// return jdbc.query(SQL.SELECT_USER_LIST, new UserRowMapper());
		
		// Mybatis 방식
		return mybatis.selectList("ns_mapper_sql.SELECT_USER_LIST");
		
	}
	
	public void userRegist(UserVO vo) { // 매개변수 두개이상 넘어가면 객체로 전달
		
		// Spring JDBC 방식
		// Object[] param = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), vo.getDep()};
		// jdbc.update(SQL.INSERT_USER, param); // 파라미터값 같이 넘겨야함!!!!
		
		// Mybatis 방식
		mybatis.insert("ns_mapper_sql.INSERT_USER", vo); // vo객체내용을 알아서 맵핑해줌 ns_mapper.sql - 쿼리문의 namespace
	}
	
	public UserVO userView(int seq) {
		return mybatis.selectOne("ns_mapper_sql.SELECT_USER", seq);
	}

}
