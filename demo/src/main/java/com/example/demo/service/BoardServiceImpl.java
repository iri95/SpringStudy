package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDao dao;

	@Override
	public List<BoardDto> list() {
		return dao.list();
	}

	@Override
	public BoardDto detail(int bno) {
		return dao.detail(bno);
	}

	@Override
	public int write(BoardDto boardDto) {
		return dao.write(boardDto);
	}

	@Override
	public int update(BoardDto boardDto) {
		return dao.update(boardDto);
	}

	@Override
	public int delete(int bno) {
		return dao.delete(bno);
	}
}
