package kr.co.booktopia.service;

import kr.co.booktopia.vo.MemberVO;

public interface MemberService {
	
	public MemberVO login(MemberVO vo);
	public void logout();
	public void register();
	public void mypage();

}