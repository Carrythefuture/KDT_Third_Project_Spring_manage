package com.tnt.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.app.service.BoardService;
@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;
    
    @GetMapping("/list")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(boardService.findAll());
    }
    @DeleteMapping("/delete/{seq}")
    public ResponseEntity<Void> deletePost(@PathVariable int seq) {
        int result = boardService.delete(seq);
        if (result > 0) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
