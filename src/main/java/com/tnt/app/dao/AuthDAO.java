package com.tnt.app.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tnt.app.dto.AdminDTO;

@Repository
public class AuthDAO {
	
	@Autowired
	private SqlSession mybatis;

	public AdminDTO findByUserId(String id) {
		
		return null;
		//return mybatis.selectOne("Member.findByUserId", id);
	}

}
