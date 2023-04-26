package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BoardDto;
import com.example.demo.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/board")
	public List<BoardDto> list(){
		List<BoardDto> list = boardService.list();
		return list;
	}
	
	@GetMapping("/board/{bno}")
	public BoardDto detail(@PathVariable int bno) {
		BoardDto detail = boardService.detail(bno);
		return detail;
	}
	
	@PostMapping("/board")
	public int write(BoardDto boardDto) {
		int ret = boardService.write(boardDto);
		return ret;
	}
	
	@PutMapping("/board/{bno}")
	public int update(BoardDto boardDto) {
		int ret = boardService.update(boardDto);
		return ret;
	}
	
	@DeleteMapping("/board/{bno}")
	public int delete(@PathVariable int bno) {
		int ret = boardService.delete(bno);
		return ret;
	}
	
}
