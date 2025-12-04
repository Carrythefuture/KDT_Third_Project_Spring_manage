package com.tnt.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.MemberDAO;
import com.tnt.app.dto.MemberDTO;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public List<MemberDTO> getMemberData(){
		return memberDAO.getMemberData();
	}
}
