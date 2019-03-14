package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardVO;


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
		
	public void write(BoardVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_BOARD", vo);	
	}

}
