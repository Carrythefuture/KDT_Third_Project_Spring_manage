package com.tnt.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.service.ChartService;

@RestController
@RequestMapping("/chart")
public class ChartController {
	@Autowired
	private ChartService chartService;

	@GetMapping
	public ResponseEntity<Map<String, List<Map<String,Object>>>>  getData() {
		Map<String, List<Map<String,Object>>>  map = chartService.getData();

		return ResponseEntity.ok(map);
	}
}
