package com.tnt.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.service.ManageService;

@RestController
@RequestMapping("/manage")
public class ManageController {


	@Autowired
	private ManageService manageService;

	@GetMapping("/data")
	public ResponseEntity<Map<String, Map<String,Integer>>> getManageData() {
		Map<String,Map<String,Integer>> map = manageService.getManageData();

		return ResponseEntity.ok(map);
	}
	
}
