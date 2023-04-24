package com.mycom.study.service;

import java.util.List;

import com.mycom.study.dto.BoardDto;

public interface BoardService {

	int write(BoardDto boardDto);
	
	List<BoardDto> list();
	
	BoardDto detail(int bno);

	int delete(int bno);

	int update(BoardDto boardDto);

}
