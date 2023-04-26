package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BoardDto;

@Mapper
public interface BoardDao {

	List<BoardDto> list();

	BoardDto detail(int bno);

	int write(BoardDto boardDto);

	int update(BoardDto boardDto);

	int delete(int bno);

}
