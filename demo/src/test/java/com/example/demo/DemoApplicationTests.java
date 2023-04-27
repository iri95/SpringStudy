package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.BoardDto;
import com.example.demo.service.BoardService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	BoardService service;
	
	@Autowired
	BoardDao dao;
	
	@Test
	void testService() {
		assertNotNull(service);
	}
	
	@Test
	void testDao() {
		assertNotNull(dao);
	}
	
	// Service
	@Test
	void testWrite() {
		BoardDto dto = new BoardDto();
		dto.setTitle("안녕");
		dto.setContent("하이");
		dto.setUserId("111");
		assertEquals(1, service.write(dto));
	}
	
	@Test
	void testUpdate() {
		BoardDto dto = new BoardDto();
		dto.setTitle("안녕");
		dto.setContent("하이");
		dto.setBno(3);
		assertEquals(1, service.update(dto));
	}
	
	@Test
	void testDelete() {
		BoardDto dto = new BoardDto();
		dto.setBno(2);
		assertEquals(1, service.update(dto));
	}
	
	@Test
	void testList() {
		assertNotNull(service.list());
	}
	
	@Test
	void testDetail() {
		assertNotNull(service.detail(2));
	}
	
	@Test
	void testWriteDao() {
		BoardDto dto = new BoardDto();
		dto.setTitle("안녕");
		dto.setContent("하이");
		dto.setUserId("111");
		assertEquals(1, dao.write(dto));
	}
	
	@Test
	void testUpdateDao() {
		BoardDto dto = new BoardDto();
		dto.setTitle("안녕");
		dto.setContent("하이");
		dto.setBno(3);
		assertEquals(1, dao.update(dto));
	}
	
	@Test
	void testDeleteDao() {
		BoardDto dto = new BoardDto();
		dto.setBno(2);
		assertEquals(1, dao.update(dto));
	}
	
	@Test
	void testListDao() {
		assertNotNull(dao.list());
	}
	
	@Test
	void testDetailDao() {
		assertNotNull(dao.detail(2));
	}
		
}
