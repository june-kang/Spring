package kr.co.fridgeideas.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.RecipeVO;
import kr.co.fridgeideas.vo.TermsVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public TermsVO terms() {
		return mybatis.selectOne("fr.mapper.member.selectTerms");
	}
	
	public MemberVO login(MemberVO memberVO) {
		return mybatis.selectOne("fr.mapper.member.selectMember", memberVO);
	}
	
	
	public void register(MemberVO memberVO) {
		mybatis.insert("fr.mapper.member.insertMember", memberVO);
	}
	
	public int idCheck(String uid) {
		return mybatis.selectOne("fr.mapper.member.selectMemberCountUid", uid);
	}
	public int nickCheck(String nick) {
		return mybatis.selectOne("fr.mapper.member.selectMemberCountNick", nick);
	}
	public int hpCheck(String hp) {
		return mybatis.selectOne("fr.mapper.member.selectMemberCountHp", hp);
	}
	public int emailCheck(String email) {
		return mybatis.selectOne("fr.mapper.member.selectMemberCountEmail", email);
	}
	
	public void recipeWrite(RecipeVO recipeVO) {
		mybatis.insert("fr.mapper.member.insertRecipe", recipeVO);
	}
}
