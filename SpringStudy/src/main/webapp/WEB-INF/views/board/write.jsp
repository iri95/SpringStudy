<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.mycom.study.dto.*, java.util.List"%>
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
<form action="write" method="POST">
<input type="hidden" value="<%=((UserDto)session.getAttribute("user")).getUserId() %>" name="userId">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Title</span>
  <input type="text" class="form-control" name="title" aria-label="Username" aria-describedby="basic-addon1">
</div>
<div class="input-group">
  <span class="input-group-text">Content</span>
  <textarea class="form-control" name="content" aria-label="With textarea"></textarea>
</div>
<button type="submit" class="btn btn-primary" >작성하기</button>
</form>
<a href="/study/board/list"><button type="button" class="btn btn-secondary">목록</button></a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>