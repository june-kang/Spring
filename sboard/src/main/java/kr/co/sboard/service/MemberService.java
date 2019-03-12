package kr.co.sboard.service;

import kr.co.sboard.vo.TermsVO;

public interface MemberService {
	
	public void login();
	public void register();
	public TermsVO terms();

}
