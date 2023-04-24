<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<h1>login</h1>
<form method="POST" action="signin">
<div class="mb-3">
  <input type="text" class="form-control" id="userid" name="userId" placeholder="ID">
</div>
<div class="mb-3">
  <input type="text" class="form-control" id="userpw" name="userPw" placeholder="Password">
</div>
<div class="mb-3">
  <input type="text" class="form-control" id="username" name="userName" placeholder="Name">
</div>
<div class="mb-3">
  <input type="text" class="form-control" id="phonenum" name="phoneNum" placeholder="Phone">
</div>
<button type="submit" class="btn btn-primary">회원가입</button>
<a href="/study/board/list"><button type="button" class="btn btn-secondary">목록</button></a>

</form>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</body>
</html>