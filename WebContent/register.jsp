<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jslib/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(function(){
		$("#check").click(function(){
				$.post("CheckIt",{username:$("[name='userName']").val()},function(data){
					var s=data.split("$");
					$("[name='status']").val(s[0]);
					$("#info").html(s[1]);
					});
			});
			$("#sub").click(function(){
					if($("[name='status']").val()=="0")
					{
						$("#info").html("请先检查用户名是否重复！");	
						return false;
					}
					if($("[name='status']").val()=="1")
					{
						$("#info").html("用户名重复,请输入新的用户名重新检查！");
						$("[name='status']").val(0);
						return false;	
					}
					return true;
				})
			
	})
</script>
</head>
<body>
注册页面
<div id="info"></div>
<form method="post" action="welcome.jsp">
<input name="status" type="hidden" value="0">
姓名:<input type="text" name="userName"><br>
密码:<input type="password" name="pwd"><br>
<input type="button" id="check" value="检查用户名">
<input type="submit" id="sub" value="提交">
</form>
<a href="login.jsp">登录页面</a>
<a href="register.jsp">注册页面</a>
</body>
</html>