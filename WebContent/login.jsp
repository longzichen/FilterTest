<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
登录页面
<div id="info"></div>
<form method="post" action="CheckLogin">
姓名:<input type="text" name="userName"><br>
密码:<input type="password" name="pwd"><br>
<input type="button" id="check" value="检查用户名">
<input type="submit" id="sub" value="提交">
</form>
<a href="login.jsp">登录页面</a>
<a href="register.jsp">注册页面</a>
</body>
</html>