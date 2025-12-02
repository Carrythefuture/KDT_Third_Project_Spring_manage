package com.tnt.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.service.AuthService;
import com.tnt.app.utils.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private JwtUtil jwt;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String,String> user){
		String id = user.get("id");
        String pw = user.get("pw");

		try {
			// 로그인 처리 + ROLE 반환
			List<String> roles = authService.login(id, pw);
			// JWT 생성
			String token = jwt.createToken(id, roles);
			
			System.out.println(token);
			return ResponseEntity.ok(Map.of(
				"token", token
			));
		
		} catch (Exception e) {
			// 로그인 실패(아이디 또는 비번 불일치)
			e.printStackTrace();
			return ResponseEntity
					.status(HttpStatus.UNAUTHORIZED)
					.body(Map.of("error", e.getMessage()));
		}
	}
	
	@GetMapping("/verify")
	public ResponseEntity<?> verify(HttpServletRequest request) {
	    return ResponseEntity.ok().build();
	}
}
