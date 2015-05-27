<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎<%=request.getSession().getAttribute("NAME") %>,登录成功！
<a href="page/p1.jsp">p1</a>
<a href="page/p2.jsp">p2</a>
<a href="page/p3.jsp">p3</a>
</body>
</html>