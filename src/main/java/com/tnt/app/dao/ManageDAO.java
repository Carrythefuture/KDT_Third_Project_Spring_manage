package com.tnt.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManageDAO {
	
	@Autowired
	private SqlSession mybatis;
	
	public Map<String, Map<String,Integer>> getManageData() {
        Map<String, Map<String,Integer>> result = new HashMap<>();

        // 1. 연령대
        List<Map<String, Object>> ageList = mybatis.selectList("ManageChart.getAgeData");
        Map<String, Integer> ageMap = new HashMap<>();
        for (Map<String, Object> row : ageList) {
            ageMap.put((String) row.get("LABEL"), ((Number) row.get("CNT")).intValue());
        }
        result.put("ageChart", ageMap);

        // 2. 성별
        List<Map<String, Object>> genderList = mybatis.selectList("ManageChart.getGenderData");
        Map<String, Integer> genderMap = new HashMap<>();
        for (Map<String, Object> row : genderList) {
            genderMap.put((String) row.get("GENDER"), ((Number) row.get("CNT")).intValue());
        }
        result.put("genderChart", genderMap);

        // 3. 지역
        List<Map<String, Object>> regionList = mybatis.selectList("ManageChart.getRegionData");
        Map<String, Integer> regionMap = new HashMap<>();
        for (Map<String, Object> row : regionList) {
            regionMap.put((String) row.get("REGION"), ((Number) row.get("CNT")).intValue());
        }
        result.put("regionChart", regionMap);

        // 4. 회원 등급
        List<Map<String, Object>> membershipList = mybatis.selectList("ManageChart.getMembershipData");
        Map<String, Integer> membershipMap = new HashMap<>();
        for (Map<String, Object> row : membershipList) {
            membershipMap.put((String) row.get("LEVEL"), ((Number) row.get("CNT")).intValue());
        }
        result.put("membershipChart", membershipMap);

        return result;
    }
}
