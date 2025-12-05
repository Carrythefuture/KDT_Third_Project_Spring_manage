package com.tnt.app.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class AdminDTO {
	private String id;                      // 로그인 아이디
	private String password;                    // 비밀번호 해시

	private Timestamp createdAt;            // 생성일

	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDTO(String id, String password, Timestamp createdAt) {
		super();
		this.id = id;
		this.password = password;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
