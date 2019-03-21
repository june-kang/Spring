package kr.co.booktopia.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public MemberVO login(MemberVO vo) {
		return mybatis.selectOne("bt.mapper.member.selectMember", vo);
	}
	
	public void register(MemberVO vo) {
		mybatis.insert("bt.mapper.member.insertMember", vo);
	}
	public void mypage() {}
	
	public int idCheck(String member_id) {
		return mybatis.selectOne("bt.mapper.member.selectMemberCount", member_id);
	}

}
