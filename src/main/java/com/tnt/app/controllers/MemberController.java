package com.tnt.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.dto.MemberDTO;
import com.tnt.app.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping
	public ResponseEntity<List<MemberDTO>> getManageData(Authentication authentication) {
		System.out.println("test:"+ authentication.getName()); // = JWT의 id 혹시나 보안용으로 넣어야하나 고민
		
		List<MemberDTO> memberDTOs = memberService.getMemberData();
		return ResponseEntity.ok(memberDTOs);
	}
	
}
