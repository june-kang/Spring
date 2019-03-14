package kr.co.sboard.service;

import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

public interface MemberService {
	
	public void register(MemberVO memberVO);
	public TermsVO terms();
	public MemberVO login(MemberVO memberVO);
	public void registerCheck();
	public int idCheck(String uid);
}
