package com.mycom.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycom.study.common.DBManager;
import com.mycom.study.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public int login(UserDto userDto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int ret = -1;
				
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" select count(*) from user ")
			.append(" where userid = ? and userpw = ? ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, userDto.getUserId());
			pstmt.setString(2, userDto.getUserPw());
			rs = pstmt.executeQuery();
			rs.next();
			ret = rs.getInt("count(*)");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(rs, pstmt, con );
		}
		
		return ret;
	}

	@Override
	public int signin(UserDto userDto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int ret = 0;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(" insert into user(userid, userpw, username, phonenum) ")
			.append(" values(?, ?, ?, ?) ");
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, userDto.getUserId());
			pstmt.setString(2, userDto.getUserPw());
			pstmt.setString(3, userDto.getUserName());
			pstmt.setString(4, userDto.getPhoneNum());
			
			ret = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(pstmt, con);
		}
		
		return ret;
	}

}
