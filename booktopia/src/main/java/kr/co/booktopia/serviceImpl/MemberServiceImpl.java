package kr.co.booktopia.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.MemberDAO;
import kr.co.booktopia.service.MemberService;
import kr.co.booktopia.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public MemberVO login(MemberVO vo) {
		return dao.login(vo);
	}

	@Override
	public void logout() {
		
	}

	@Override
	public void register(MemberVO vo) {
		dao.register(vo);
	}

	@Override
	public void mypage() {
		
	}

	@Override
	public int idCheck(String member_id) {
		return dao.idCheck(member_id);
	}

}
