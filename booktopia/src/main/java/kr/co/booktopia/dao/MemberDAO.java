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
		return mybatis.selectOne("bt.mapper.member.SELECT_MEMBER", vo);
	}
	
	public void logout() {}
	public void register() {}
	public void mypage() {}

}
