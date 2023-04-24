package com.mycom.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycom.study.common.DBManager;
import com.mycom.study.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public int write(BoardDto boardDto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int ret = -1;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" insert into board(title, content, date) ")
			.append(" values(?, ?, ?) ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1,boardDto.getTitle());
			pstmt.setString(2, boardDto.getContent());
			pstmt.setString(3, boardDto.getDate());
			
			ret = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(pstmt, con);
		}
		
		return ret;
	}

	@Override
	public List<BoardDto> list() {
		List<BoardDto> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" select * from board ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDto dto = new BoardDto();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setDate(rs.getString("date"));
				dto.setCnt(rs.getInt("cnt"));
				
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(pstmt, con);
		}
		
		return list;
	}

	@Override
	public BoardDto detail(int bno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDto dto = new BoardDto();
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" select * from board ")
			.append(" where bno = ? ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			rs.next();
			dto.setBno(rs.getInt("bno"));
			dto.setUserId(rs.getString("userid"));
			dto.setTitle(rs.getString("title"));
			dto.setContent(rs.getString("content"));
			dto.setDate(rs.getString("date"));
			dto.setCnt(rs.getInt("cnt"));
			System.out.println(dto.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(rs, pstmt, con);
		}
		
		return dto;
	}

	@Override
	public int delete(int bno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int ret = -1;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" delete from board ")
			.append(" where bno = ? ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			ret = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(pstmt, con);
		}
		
		return ret;
	}

	@Override
	public int update(BoardDto boardDto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int ret = -1;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" update board set title = ?, content = ? ")
			.append(" where bno = ? ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, boardDto.getTitle());
			pstmt.setString(2, boardDto.getContent());
			pstmt.setInt(3, boardDto.getBno());
			ret = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(pstmt, con);
		}
		return ret;
	}

}
