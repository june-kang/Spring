package kr.co.fridgeideas.service;

import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.RecipeVO;
import kr.co.fridgeideas.vo.TermsVO;

public interface MemberService {
	
	public TermsVO terms();
	public void register(MemberVO memberVO);
	public MemberVO login(MemberVO memberVO);
	public int idCheck(String uid); 
	public int nickCheck(String nick);
	public int hpCheck(String hp);
	public int emailCheck(String email);
	
}
