package com.mycom.study.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		boardDto.setDate(formatter.format(date));
		
		if(boardService.write(boardDto) == 1) {
			System.out.println("작성 성공");
			return "redirect:/board/list";
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
	public String detail(@PathVariable int bno, Model model) {
		BoardDto board = boardService.detail(bno);
		model.addAttribute("board", board);
		return "/board/detail";
	}
	
	@PostMapping("/update")
	public String update(BoardDto boardDto) {
		int result = boardService.update(boardDto);
		if(result == 1) {
			System.out.println("수정 성공");
			return "redirect:/board/list";
		}else {
			System.out.println("수정 실패");
			return "/board/detail";
		}
		
	}
	
	@GetMapping("/delete/{bno}")
	public String delete(@PathVariable int bno) {
		int result = boardService.delete(bno);
		if(result == 1) {
			System.out.println("삭제 성공");
			return "redirect:/board/list";
		}else {
			return "board/detail";
		}
		
	}
	
}
