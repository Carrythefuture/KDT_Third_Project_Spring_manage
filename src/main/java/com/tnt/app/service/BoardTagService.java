package com.tnt.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.BoardTagDAO;
import com.tnt.app.dto.BoardTagDTO;

@Service
public class BoardTagService {
	
	  @Autowired
	    private BoardTagDAO boardTagDAO;
	  
	  public List<BoardTagDTO> findByBoardId(int boardId) {
	        return boardTagDAO.findByBoardId(boardId);
	    }
	
	
}
