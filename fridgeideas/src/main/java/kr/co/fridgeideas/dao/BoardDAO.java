package kr.co.fridgeideas.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.fridgeideas.vo.BoardVO;
import kr.co.fridgeideas.vo.ImageVO;

@Repository
public class BoardDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public int commuWrite(BoardVO vo) {
		mybatis.insert("fr.mapper.board.insertCommuBoard", vo);
		return vo.getSeq();
	}
	
	public int fileWrite(ImageVO ivo) {
		mybatis.insert("fr.mapper.board.insertImage", ivo);
		return ivo.getSeq();
	}
	
	public List<BoardVO> commuList(){
		return mybatis.selectList("fr.mapper.board.selectCommuList");
	}

}
