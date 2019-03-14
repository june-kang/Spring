package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao dao;
	
	@Override
	public MemberVO login(MemberVO memberVO) {
		return dao.login(memberVO);
	}
		

	@Override
	public void register(MemberVO memberVO) {
		dao.register(memberVO);
	}

	@Override
	public TermsVO terms() {
		return dao.terms();
		
	}


	@Override
	public void registerCheck() {
	}


	@Override
	public int idCheck(String uid) {
		return dao.idCheck(uid);
	}




}
