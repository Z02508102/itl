<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>信息技术实验室</title>

<!-- Bootstrap -->
<!--公用樣式表-->
<link
	href="${pageContext.request.contextPath }/css/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/public/style/common.css" />

<!--個人樣式表-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/source/style/department.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	  <![endif]-->
</head>

<body>
	<div class="huidaodingbu">
		<a href="#"><img
			src="${pageContext.request.contextPath }/css/public/images/0.1.png" /></a>
	</div>
	<div class="header">
		<nav class="navbar navbar-default beijing ">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<img class="navbar-brand"
						src="${pageContext.request.contextPath }/css/public/images/3.png" />
					<a class="navbar-brand nav-wenzi" href="#">Information
						Technology Lab</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/itl/index">首页</a></li>
						<li><a href="/itl/department">部门介绍</a></li>
						<li><a href="/itl/about">关于我们</a></li>
						<li><a href="/itl/item/getItem">加入我们</a></li>
						<li><a href="/itl/user/login">后台管理</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
	<!--主体部分-->
	<div>
		<div class="part">
			<div class="part-biaoti">
				<h1>部门介绍</h1>
			</div>
			<div class="part-main">
				<div class="tree clear">
					<div class="tree-left">
						<img
							src="${pageContext.request.contextPath }/css/public/images/2-1.png"
							alt="wel" class="welcome img-responsive center-block" />
						<div class="qianduan">
							<h2 class="left">前&nbsp;端&nbsp;部</h2>
							<img
								src="${pageContext.request.contextPath }/css/public/images/2-3.png"
								alt="" class="left-branch1 img-responsive center-block" />

						</div>
						<div class="qianduan-intro">
							<h4>
								主要使用Html(5),CSS(3),<br />JavaScript,JQuery等。
							</h4>
							<p>负责页面的布局及网站结构的排布，实现一些与用户实时交互的特效，构建响应式页面，使网页适应多种平台，改善用户体验。</p>
						</div>
						<div class="sql">
							<h2 class="left">数&nbsp;据&nbsp;库&nbsp;部</h2>
							<img
								src="${pageContext.request.contextPath }/css/public/images/2-3.png"
								alt="" class="left-branch2 img-responsive center-block" />

						</div>
						<div class="sql-intro">
							<h4>主要使用Oracle，Mysql，SQL serve等。</h4>
							<p>数据库主要是负责设计表结构，设计SQL语句，对数据增、删、改、查，并使其高效率处理数据。</p>
						</div>
					</div>
					<div class="tree-main">
						<img
							src="${pageContext.request.contextPath }/css/public/images/2-7.png"
							alt="tree" class="tree-main-1 img-responsive center-block" />
						<div class="tree-root">
							<img
								src="${pageContext.request.contextPath }/css/public/images/2-5.png"
								alt="root" class="tree-main-2 img-responsive center-block" />
						</div>
					</div>
					<div class="tree-right clear">
						<div class="sheji">
							<h2 class="right">设&nbsp;计&nbsp;部</h2>
							<img
								src="${pageContext.request.contextPath }/css/public/images/2-2.png"
								alt="" class="right-branch1 img-responsive center-block" />

						</div>
						<div class="sheji-intro right">
							<h4>主要使用Photoshop、UI、Coreldraw等。</h4>
							<p>负责网站项目的整体版式，风格设计。进行的广告及专题设计。以用户为中心的设计理念，对页面进行优化，改善网站用户体验。</p>
						</div>
						<div class="houduan">
							<h2 class="right">后&nbsp;端&nbsp;部</h2>
							<img
								src="${pageContext.request.contextPath }/css/public/images/2-2.png"
								alt="" class="right-branch2 img-responsive center-block" />

						</div>
						<div class="houduan-intro right">
							<h4>主要使用JAVA，MySQL等。</h4>
							<p>后端主要负责如何实现网站的业务需求和功能，处理前端发送的请求，通过代码实现相应的业务逻辑和功能，并且与数据库进行相应数据交互。</p>
						</div>
						<img
							src="${pageContext.request.contextPath }/css/public/images/2-4.png"
							alt="infor" class="infor" />
					</div>
				</div>

			</div>
		</div>
	</div>




	<div class="footer beijing">
		<div class="footer-left">
			<h3>联系方式：</h3>
			<p>邮箱：894517069@qq.com</p>
			<p>邮箱：1557134371@qq.com</p>
			<p>地址：安阳工学院-计算机科学与信息工程学院-信息技术实验室604</p>
		</div>
		<div class="footer-right">
			<h3>友情链接：</h3>
			<p>
				<a href="http://jwgl.ayit.edu.cn/">安阳工学院官网</a>
			</p>
			<p>
				<a href="http://jwc.ayit.edu.cn/">安阳工学院教务处</a>
			</p>
			<p>地址：安阳工学院-计算机科学与信息工程学院-信息技术实验室</p>
		</div>
		<div class="yuanzi">
			<p>@安阳工学院信息技术实验室</p>
		</div>
	</div>



	<!--jQuery (necessary for Bootstrap's JavaScript plugins)-->
	<script
		src="${pageContext.request.contextPath }/js/jquery/dist/jquery.min.js"></script>
	<!--Include all compiled plugins (below), or include individual files as needed-->
	<script
		src="${pageContext.request.contextPath }/css/bootstrap/dist/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/csssource/javascript/department.js"></script>
</body>
</html>