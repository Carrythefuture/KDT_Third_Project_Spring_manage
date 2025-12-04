package com.tnt.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tnt.app.dto.BoardTagDTO;

@Repository
public class BoardTagDAO {
	
	  @Autowired
	    private SqlSession mybatis;
	
	 public List<BoardTagDTO> findByBoardId(int boardId) {
	        return mybatis.selectList("BoardTag.findByBoardId", boardId);
	    }
}
