package kr.co.ch10.service;

import java.util.List;

import kr.co.ch10.vo.UserVO;

public interface UserService {
	
	public List<UserVO> userList();
	public void userRegist(UserVO vo);
	public UserVO userView(int seq);
}