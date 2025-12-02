package com.tnt.app.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.ManageDAO;

@Service
public class ManageService {
	
	@Autowired
	private ManageDAO manageDAO;
	
	public Map<String, Map<String,Integer>> getManageData(){
		return manageDAO.getManageData();
	}
}
