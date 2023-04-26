package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDto;

public interface BoardService {

	List<BoardDto> list();

	BoardDto detail(int bno);

	int write(BoardDto boardDto);

	int update(BoardDto boardDto);

	int delete(int bno);

}
