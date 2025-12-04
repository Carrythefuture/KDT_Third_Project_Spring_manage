package com.tnt.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tnt.app.dto.BoardDTO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession mybatis;
	
	public List<BoardDTO> findAll() {
        return mybatis.selectList("Board.findAll");
    }
	
	public int delete(int seq) {
	    return mybatis.delete("Board.delete", seq);
	}
	

}
