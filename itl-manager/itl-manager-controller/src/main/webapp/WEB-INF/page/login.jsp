<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>后台管理</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Internship Sign In & Sign Up Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() {
		 setTimeout(hideURLbar, 0);
		 }, false);
	 function hideURLbar(){
		 window.scrollTo(0,1);
		 } 

</script>
<!-- Custom Theme files -->
<link
	href="${pageContext.request.contextPath }/css/source/style/font-awesome.min.css"
	rel="stylesheet" type="text/css" media="all">
<!-- <link href="source/style/snow.css" rel="stylesheet" type="text/css" -->
<!-- 	media="all" /> -->
<link
	href="${pageContext.request.contextPath }/css/source/style/style.css"
	rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<!--<link href="//fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">-->

<!-- //web font -->
<script>
	setTimeout(
			function() {
				document.getElementsByTagName('body')[0].style.height = window.innerHeight
						+ 'px';
			}, 20);
</script>
</head>
<body>
	<div id="bg">
		<div class="top-buttons-agileinfo">
			<a href="/itl/index" class="active one">首页</a>
		</div>
		<h1>管理员登录</h1>

		<div class="main-agileits">
			<!--form-stars-here-->
			<div class="form-w3-agile">
				<form action="/itl/user/login" method="post">
					<input type="text" name="username" placeholder="请输入用户名" required="true" />
					<input type="password" name="password" placeholder="请输入密码" required="true" />
					<div class="submit-w3l">
						<input type="submit" value="登录">
					</div>
				</form>
				<div>
					<a style="color: red"><%=request.getAttribute("error") == null ? "" : request.getAttribute("error")%></a>
				</div>
				<%-- <div>
					<a style="color: red"><%=request.getAttribute("alreadyLogged") == null ? "" : request.getAttribute("alreadyLogged")%></a>
				</div> --%>
			</div>
		</div>

		<!--//form-ends-here-->
		<!-- copyright -->
		<div class="copyright w3-agile">
			<p>
				安阳工学院 版权所有©2018</a>
			</p>
		</div>

	</div>
	<!-- //copyright -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
</body>
</html>