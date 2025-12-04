package com.tnt.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tnt.app.dto.MemberDTO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession mybatis;
	
	
	public List<MemberDTO> getMemberData(){
		System.out.println(mybatis.selectList("Member.getMemberData"));
		return mybatis.selectList("Member.getMemberData");
	}
}
