<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>web_head</title>
	<link href="css/head.css" rel="stylesheet" type="text/css" />
</head>
<body >
	<div class="head">
		<div class="head_left">
			<a href="#">
				<img src="images/logo.png" width="300" height="37.5"/>
			</a>
		</div>
		<div class = "head_right">
			<table class="rightTag" cellspacing="0" cellpadding="0">
				<tr>
				<td><a href="index.jsp"><b>首页</b></a></td>
				<td><a href="login.jsp"><b>课程</b></a></td>
				<td><a href="http://en.wikipedia.org/wiki/Massive_open_online_course" target="_black"><b>关于mooc</b></a></td>
				<s:if test = "#session.user == null">
					<td><a href="login.jsp"><b>登录/注册</b></a></td>
				</s:if>
				</tr>
			</table>
		</div>
	</div>
	
</body>
</html>