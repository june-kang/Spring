package kr.co.sboard.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Repository
public class MemberDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public MemberVO login(MemberVO memberVO) {
		return mybatis.selectOne("ns.mapper.sql_member.SELECT_MEMBER", memberVO);
	}
	
	public void register(MemberVO memberVO) {
		mybatis.insert("ns.mapper.sql_member.INSERT_MEMBER", memberVO);		
	}
	
	public TermsVO terms() {
		return mybatis.selectOne("ns.mapper.sql_member.SELECT_TERMS");
	}
	
	public int idCheck(String uid) {
		return mybatis.selectOne("ns.mapper.sql_member.SELECT_COUNT", uid);
	}

}
