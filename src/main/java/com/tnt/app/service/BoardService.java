package com.tnt.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.BoardDAO;
import com.tnt.app.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
    private BoardDAO boardDAO;
	
	
	public List<BoardDTO> findAll() {
        return boardDAO.findAll();
    }
	
	public int delete(int seq) {
		return boardDAO.delete(seq);
	}
	
	
}
