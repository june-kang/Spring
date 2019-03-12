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
	private JdbcTemplate jdbc; // spring jdbc ��ü, mybatis ������ ������
	
	@Inject
	private SqlSessionTemplate mybatis; // mybatis ��ü
	
	
	public List<UserVO> userList() {
		
		// Spring JDBC ���
		// return jdbc.query(SQL.SELECT_USER_LIST, new UserRowMapper());
		
		// Mybatis ���
		return mybatis.selectList("ns_mapper_sql.SELECT_USER_LIST");
		
	}
	
	public void userRegist(UserVO vo) { // �Ű����� �ΰ��̻� �Ѿ�� ��ü�� ����
		
		// Spring JDBC ���
		// Object[] param = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), vo.getDep()};
		// jdbc.update(SQL.INSERT_USER, param); // �Ķ���Ͱ� ���� �Ѱܾ���!!!!
		
		// Mybatis ���
		mybatis.insert("ns_mapper_sql.INSERT_USER", vo); // vo��ü������ �˾Ƽ� �������� ns_mapper.sql - �������� namespace
	}
	
	public UserVO userView(int seq) {
		return mybatis.selectOne("ns_mapper_sql.SELECT_USER", seq);
	}

}
