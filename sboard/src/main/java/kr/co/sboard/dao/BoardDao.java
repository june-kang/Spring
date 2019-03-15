package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;


@Repository
public class BoardDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	
	
	public List<BoardVO> list(int start) {
		return mybatis.selectList("ns.mapper.sql_board.SELECT_LIST", start);
	}
	
	public int getTotalCount() {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_LIST_COUNT");
	}
		
	public int write(BoardVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_BOARD", vo);
		return vo.getSeq();
	}
	
	public void fileWrite(FileVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_FILE", vo);
	}
	
	public BoardVO view(int seq) {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_VIEW_WITH_FILE", seq);
	}
	
	public void updateHit(int seq) {
		mybatis.update("ns.mapper.sql_board.UPDATE_HIT", seq);
	}
	
	public FileVO fileDownload(int parent) {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_FILE", parent);
	}
	
	public void fileUpdate(int parent) {
		mybatis.update("ns.mapper.sql_board.UPDATE_FILE", parent);
	}
	
	public void delete(int seq) {
		mybatis.delete("ns.mapper.sql_board.DELETE_VIEW", seq);
	}
	
	public int modify(BoardVO vo) {
		mybatis.update("ns.mapper.sql_board.UPDATE_VIEW", vo);
		return vo.getSeq();
	}
	
	public void commentWrite(BoardVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_COMMENT", vo);
	}
	
	public List<BoardVO> commentWrite(int parent) {
		return mybatis.selectList("ns.mapper.sql_board.SELECT_COMMENT", parent);
	}
	
	public void commentDelete(int seq) {
		mybatis.delete("ns.mapper.sql_board.DELETE_COMMENT", seq);
	}
	
	public void commentCountPlus(int parent) {
		mybatis.update("ns.mapper.sql_board.UPDATE_COMMENT_COUNT_PLUS", parent);
	}
	
	public void commentCountMinus(int parent) {
		mybatis.update("ns.mapper.sql_board.UPDATE_COMMENT_COUNT_MINUS", parent);
	}

}
