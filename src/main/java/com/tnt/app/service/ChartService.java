package com.tnt.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.ChartDAO;

@Service
public class ChartService {
	@Autowired
    private ChartDAO chartDAO;
  
  public Map<String, List<Map<String,Object>>>  getData() {
        return chartDAO.getData();
    }
}  
