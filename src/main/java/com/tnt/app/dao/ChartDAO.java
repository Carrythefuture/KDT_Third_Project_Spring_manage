package com.tnt.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChartDAO {
	 @Autowired
	    private SqlSession mybatis;
	
	 public Map<String, List<Map<String,Object>>>  getData() {
	     Map<String, List<Map<String,Object>>> map = new HashMap<String, List<Map<String,Object>>>();
		 
	     
	     List<Map<String,Object>> list = mybatis.selectList("Chart.getAgeData");
	     
	     for (Map<String,Object> row : list) {
	    	    Object label = row.get("LABEL");
	    	    Object cnt = row.get("CNT");
	    	    System.out.println("label = " + label + ", cnt = " + cnt);
	    	}
	     map.put("age", list);
	     
	     
		 return map;
	    }

}
