package com.tnt.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tnt.app.dto.BlackDTO;


@Repository
public class BlackDAO {
	@Autowired
	private SqlSession mybatis;

	public List<BlackDTO> getMemberData(){
		return mybatis.selectList("Black.getBlackData");
	}
	
	@Transactional
	public void blackMember(String id, String reason, String admin_id){
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("id", id);
		map.put("reason", reason);
		map.put("admin_id", admin_id);
		
		mybatis.insert("Black.blackMember",map);
		mybatis.update("Black.updateMemberBlack",id);
	}
	
	@Transactional
	public void blackCancelMember (String id){
		mybatis.delete("Black.deleteBlack", id);
		mybatis.update("Black.updateMemberBlackCancel",id);
	}
}
