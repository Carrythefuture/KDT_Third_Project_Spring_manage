package com.tnt.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.BlackDAO;
import com.tnt.app.dto.BlackDTO;

@Service
public class BlackService {
	@Autowired
	private BlackDAO blackDAO;
	
	public List<BlackDTO> getMemberData(){
		return blackDAO.getMemberData();
	}

	public void blackMember(String id, String reason, String admin_id){
		blackDAO.blackMember(id,reason,admin_id);
	}
	
	public void blackCancelMember (String id){
		blackDAO.blackCancelMember(id);
	}
	
	
	
}
