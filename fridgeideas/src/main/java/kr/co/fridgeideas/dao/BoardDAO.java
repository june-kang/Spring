package kr.co.fridgeideas.dao;

import java.util.ArrayList;
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
	
	public BoardVO view(int seq) {
		return mybatis.selectOne("fr.mapper.board.selectCommuBoard", seq);
	}
	
	public String commentWrite(BoardVO boardVO) {
		mybatis.insert("fr.mapper.board.insertComment", boardVO);
		return boardVO.getRdate();
	}
	
	public List<BoardVO> commentList(int parent){
		return mybatis.selectList("fr.mapper.board.selectCommentList", parent);
	}
	
	public void updateCommentCount(int parent) {
		mybatis.update("fr.mapper.board.updateCommentCount", parent);
	}
	
	public void updateView(int seq) {
		mybatis.update("fr.mapper.board.updateBoardView", seq);
	}
	
	public List<ImageVO> commuBoardImage(int seq){
		return mybatis.selectList("fr.mapper.board.selectCommuImage", seq);
	}

}
