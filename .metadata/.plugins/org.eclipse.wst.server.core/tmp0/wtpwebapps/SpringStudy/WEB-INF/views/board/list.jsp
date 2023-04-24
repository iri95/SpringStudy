<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.mycom.study.dto.*, java.util.List"%>
<%
	List<BoardDto> boardList = (List<BoardDto>) request.getAttribute("boardList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<h1>OrderList</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col"></th>
				<th scope="col">제목</th>
				<th scope="col">내용</th>
				<th scope="col">날짜</th>
				<th scope="col">조회수</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (BoardDto board : boardList) {
			%>
			<tr onclick="location.href='detail/<%=board.getBno()%>'">
				<th scope="row"><%=board.getBno()%></th>
				<td><%=board.getTitle()%></td>
				<td><%=board.getContent()%></td>
				<td><%=board.getDate()%></td>
				<td><%=board.getCnt()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<% if(session.getAttribute("user") != null){%>
	<a href="/study/board/write"><button type="button" class="btn btn-secondary">작성하기</button></a>
	<% }else{%>
	<a href="/study/user/login"><button type="button" class="btn btn-secondary">로그인</button></a>
	<a href="/study/user/signin"><button type="button" class="btn btn-secondary">회원가입</button></a>
	<%} %>
</body>
</html>