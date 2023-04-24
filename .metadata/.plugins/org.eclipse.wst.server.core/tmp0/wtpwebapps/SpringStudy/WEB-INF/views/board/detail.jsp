<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mycom.study.dto.*, java.util.List"%>
<% BoardDto board = (BoardDto) request.getAttribute("board"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<h1>OrderDetail</h1>
<form method="POST" action="/study/board/update">
<div class="input-group input-group-sm mb-3">
  <span class="input-group-text">게시글 번호</span>
  <input type="text" id="bno" name="bno" value="<%=board.getBno() %>" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
</div>
<div class="input-group input-group-sm mb-3">
  <span class="input-group-text">제목</span>
  <input type="text" id="title" name="title" value="<%=board.getTitle() %>" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
</div>
<div class="input-group input-group-sm mb-3">
  <span class="input-group-text">내용</span>
  <input type="text" id="content" name="content" value="<%=board.getContent() %>" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
</div>
<div class="input-group input-group-sm mb-3">
  <span class="input-group-text">날짜</span>
  <input type="text" id="date" name="date" value="<%=board.getDate() %>" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
</div>
<div class="input-group input-group-sm mb-3">
  <span class="input-group-text">조회수</span>
  <input type="text" id=""cnt"" name="cnt" value="<%=board.getCnt() %>" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
</div>

<button class="btn btn-primary">수정</button>
<a href="/study/board/delete/<%=board.getBno() %>"><button type="button" class="btn btn-danger">삭제</button></a>
</form>
<a href="/study/board/list"><button type="button" class="btn btn-secondary">index</button></a>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</body>
</html>