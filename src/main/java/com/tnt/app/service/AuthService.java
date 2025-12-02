package com.tnt.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.app.dao.AuthDAO;
import com.tnt.app.dto.AdminDTO;
import com.tnt.app.utils.Encrypt;

@Service
public class AuthService {

    @Autowired
    private AuthDAO AuthDAO;

    public List<String> login(String id, String rawPw) {
   
        // 1) userId로 DTO 가져오기
    	AdminDTO Admin = AuthDAO.findByUserId(id);
    	return null;
    	
//        if (Admin == null) {
//            throw new RuntimeException("아이디가 존재하지 않습니다.");
//        }
//
//        // 2) 입력 PW SHA-512 해싱
//        String encPw = Encrypt.encrypt(rawPw);
//        System.out.println(Admin.getPassword());
//
//        System.out.println(encPw);
//        // 3) 비밀번호 비교
//        if (!encPw.equals(Admin.getPassword())) {
//            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
//        }
//
//        // 4) 권한 생성
//        List<String> roles = new ArrayList<>();
//
//        if ("admin".equals(Admin.getId())) {
//            roles.add("ADMIN");
//        } else {
//            roles.add("MEMBER");
//        }
//
//        return roles;
    }
}
