package kr.co.sboard.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.TermsVO;

@Repository
public class MemberDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void login() {
		
		
	}
	
	public void register() {
		
	}
	
	public TermsVO terms() {
		return mybatis.selectOne("ns.mapper.sql_member.SELECT_TERMS");
	}

}
