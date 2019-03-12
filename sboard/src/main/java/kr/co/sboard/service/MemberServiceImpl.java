package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.TermsVO;

@Controller
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao dao;
	
	@Override
	public void login() {
		dao.login();
	}

	@Override
	public void register() {
		dao.register();
	}

	@Override
	public TermsVO terms() {
		return dao.terms();
		
	}

}
