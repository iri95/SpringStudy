package com.mycom.study.dao;

import java.util.List;

import com.mycom.study.dto.BoardDto;

public interface BoardDao {

	int write(BoardDto boardDto);

	List<BoardDto> list();

	BoardDto detail(int bno);

}
