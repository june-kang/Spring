package kr.co.fridgeideas.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.fridgeideas.dao.MemberDAO;
import kr.co.fridgeideas.service.MemberService;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public TermsVO terms() {
		return dao.terms();
	}

	@Override
	public void register(MemberVO memberVO) {
		dao.register(memberVO);
	}

	@Override
	public MemberVO login(MemberVO memberVO) {
		return dao.login(memberVO);
	}

	@Override
	public int idCheck(String uid) {
		return dao.idCheck(uid);
	}

	@Override
	public int nickCheck(String nick) {
		return dao.nickCheck(nick);
	}

	@Override
	public int hpCheck(String hp) {
		return dao.hpCheck(hp);
	}

	@Override
	public int emailCheck(String email) {
		return dao.emailCheck(email);
	}
	
}
