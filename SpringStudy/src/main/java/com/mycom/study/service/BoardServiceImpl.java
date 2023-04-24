package com.mycom.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.study.dao.BoardDao;
import com.mycom.study.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDao boardDao;
	
	@Override
	public int write(BoardDto boardDto) {
		return boardDao.write(boardDto);
	}

	@Override
	public List<BoardDto> list() {
		return boardDao.list();
	}

	@Override
	public BoardDto detail(int bno) {
		return boardDao.detail(bno);
	}

}
