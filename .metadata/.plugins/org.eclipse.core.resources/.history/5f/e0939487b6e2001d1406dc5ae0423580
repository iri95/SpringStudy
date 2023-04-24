package com.mycom.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycom.study.dto.BoardDto;
import com.mycom.study.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/write")
	public void writePage() {
	}
	
	@PostMapping("/write")
	public String write(BoardDto boardDto) {
		if(boardService.write(boardDto) == 1) {
			System.out.println("작성 성공");
			return "/board/list";
		}else {
			System.out.println("작성 실패");
			return "/board/wirte";
		}
	}
	
	@GetMapping("/list")
	public void list(Model model) {
		List<BoardDto> list = new ArrayList<>();
		list = boardService.list();
		model.addAttribute("boardList", list);
	}
	
	@GetMapping("/detail/{bno}")
	public void detail(@PathVariable int bno, Model model) {
		BoardDto board = boardService.detail(bno);
		model.addAttribute("board", board);
		
	}
	
}
