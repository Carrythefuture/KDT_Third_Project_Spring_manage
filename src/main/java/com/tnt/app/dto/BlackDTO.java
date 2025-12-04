package com.tnt.app.dto;

import java.sql.Timestamp;

public class BlackDTO {
	private String id;                      // 로그인 아이디
	private String nickname;                    // 닉네임
	private String name;                        // 실명
	private String reason;
	private String admin_id;
	private String created_at;
	public BlackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlackDTO(String id, String nickname, String name, String reason, String admin_id, String created_at) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.name = name;
		this.reason = reason;
		this.admin_id = admin_id;
		this.created_at = created_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	

}
