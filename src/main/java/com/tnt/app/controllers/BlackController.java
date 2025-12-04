package com.tnt.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.dto.BlackDTO;
import com.tnt.app.service.BlackService;

@RestController
@RequestMapping("/black")
public class BlackController {
	@Autowired
	private BlackService blackService;

	@GetMapping
	public ResponseEntity<List<BlackDTO>> getManageData(Authentication authentication) {
		System.out.println("test:"+ authentication.getName()); // = JWT의 id 혹시나 보안용으로 넣어야하나 고민
		
		List<BlackDTO> blackDTOs = blackService.getMemberData();
		return ResponseEntity.ok(blackDTOs);
	}
	
	@PostMapping
	public ResponseEntity<Void> blackMember(@RequestBody Map<String, String> body, Authentication authentication) {
		String admin_id = authentication.getName();
		
		String id = body.get("id");
		String reason = body.get("reason");
		
		
		blackService.blackMember(id,reason,admin_id);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/cancel")
	public ResponseEntity<Void> blackCancelMember(@RequestBody Map<String, String> body, Authentication authentication) {
		String admin_id = authentication.getName();
		
		String id = body.get("id");
		
		blackService.blackCancelMember(id);
		return ResponseEntity.ok().build();
	}
}
