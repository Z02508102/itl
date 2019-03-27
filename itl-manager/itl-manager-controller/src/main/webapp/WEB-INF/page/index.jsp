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
<!--公用样式表-->
<link
	href="${pageContext.request.contextPath}/css/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/public/style/common.css" />

<!--個人樣式表-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/source/style/index.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	  <![endif]-->
	  
</head>


<body>
	<div class="huidaodingbu">
		<a href="#"><img src="${pageContext.request.contextPath}/images/0.1.png" /></a>
	</div>
	<div class="lunbo phone-3">
		<div class="header-1">
			<div class="left-header">
				<img src="${pageContext.request.contextPath}/images/3.png" /> <a
					href="#">Information Technology Lab</a>
			</div>
			<div class="right-header">
				<ul>
					<li><a href="/itl/index">首页</a></li>
					<li><a href="/itl/department">部门介绍</a></li>
					<li><a href="/itl/about">关于我们</a></li>
					<li><a href="/itl/item/getItem">加入我们</a></li>
					<li><a href="/itl/user/login">后台管理</a></li>
				</ul>
			</div><!--  -->
		</div>
		<div class="wenzi-1">信息技术实验室</div>
		<div class="wenzi-2">What are you waiting for a chance</div>
		<div class="wenzi-3">we are waiting for you</div>
		<div class="wenzi-4">
			<a href="/itl/join">加入我们</a>
		</div>
		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="${pageContext.request.contextPath}/images/2.png"
						alt="First slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/1.png"
						alt="Second slide">
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">
			</a> <a class="carousel-control right" href="#myCarousel"
				data-slide="next"> </a>
		</div>
	</div>

	<nav class="navbar navbar-default phone-4 ">
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
					src="${pageContext.request.contextPath}/images/3.png" /> <a
					class="navbar-brand nav-wenzi" href="#">Information Technology
					Lab</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/itl/index">首页</a></li>
					<li><a href="/itl/department">部门介绍</a></li>
					<li><a href="/itl/about">关于我们</a></li>
					<li><a href="/itl/join">加入我们</a></li>
					<li><a href="/itl/user/login">后台管理</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div class="lunbo phone-2">

		<div class="wenzi-1">信息技术实验室</div>
		<div class="wenzi-2">What are you waiting for a chance</div>
		<div class="wenzi-3">we are waiting for you</div>
		<div class="wenzi-4">
			<a href="/itl/join">加入我们</a>
		</div>
		<div id="myCarousel1" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel1" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel1" data-slide-to="1"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="${pageContext.request.contextPath}/images/1-1_01.png"
						alt="First slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/1-2_01.png"
						alt="Second slide">
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel1"
				data-slide="prev"> </a> <a class="carousel-control right"
				href="#myCarousel1" data-slide="next"> </a>
		</div>
	</div>


	<div class="center">
		<img id="image-left" class="img-responsive"
			src="${pageContext.request.contextPath}/images/4.png" /> <img
			id="image-right" class="img-responsive"
			src="${pageContext.request.contextPath}/images/5.png" />
		<p>每位实验员都有自己的一台电脑和电脑桌。</p>
		<p>同学们随时可以在这里自主学习所加入部门的相关内容。</p>
		<p>遇到不懂的问题时，</p>
		<p>还有优秀的学长学姐为你解答疑惑。</p>
		<p>也会有我们在外实习或工作的学长学姐们和我们一起交流面试和工作经验。</p>
		<p>不出校门也能了解外面的世界。</p>
		<img id="image-left" class="img-responsive"
			src="${pageContext.request.contextPath}/images/6.png" /> <img
			id="image-right" class="img-responsive"
			src="${pageContext.request.contextPath}/images/7.png" />
		<p>本实验室主要研究网站的设计、建立、运维。</p>
		<p>你可以在此学习到的技术有UI、html、java web、数据库等。</p>
		<p>这对于同学们的就业问题会提供很大的帮助。</p>
		<p>同时，我们的负责老师还会有项目让同学们练习。</p>
		<p>以此增强同学们的项目实战能力。</p>
		<p>企业缺少的是有项目经验的人，</p>
		<p>在这里，将有真实的项目给你练习，</p>
		<p>让你在找工作时比别人更胜一筹。</p>
	</div>

	<div class="we">
		<div class="container">
			<ul id="we-ul" class="nav nav-tabs">
				<li class="sss"><a href="#sheji" data-toggle="tab">设计部</a></li>
				<li class="sss"><a href="#qianduan" data-toggle="tab">前端部</a></li>
				<li class="sss"><a href="#houtai" data-toggle="tab">后端部</a></li>
				<li class="sss"><a href="#shujuku" data-toggle="tab">数据库</a></li>
			</ul>
			<div id="sheji" class="tab-pane in active fade ">
				<div id="two" class="we-content">
					<div class="phone">
						<img src="${pageContext.request.contextPath}/images/8.png" /> <span>设计部</span>
					</div>
					<div class="phone-1">设计工具：</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/9.png" /> <span>Photoshop、UI、Coreldraw</span>
					</div>
					<div class="phone-1">负责方向：</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/10.png" /> <span
							class="we-content-1">负责网站项目的版式、风格设计。进行广告专题设计。以用户为中心的理念，对页面优化，改善用户体验。</span>
					</div>
				</div>
			</div>
			<div id="qianduan" class="tab-pane fade ">
				<div id="two" class="we-content">
					<div class="phone">
						<img src="${pageContext.request.contextPath}/images/8.png" /> <span>前端部</span>
					</div>
					<div class="phone-1">设计工具</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/9.png" /> <span>Html、CSS、JavaScript、JQuery</span>
					</div>
					<div class="phone-1">负责方向：</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/10.png" /> <span
							class="we-content-1">负责页面的布局及网站结构的排布，实现一些与用户实时交互的特效，构建响应式页面，使网页适应多种平台，改善用户体验。</span>
					</div>
				</div>
			</div>
			<div id="houtai" class="tab-pane fade">
				<div id="two" class="we-content">
					<div class="phone">
						<img src="${pageContext.request.contextPath}/images/8.png" /> <span>后端部</span>
					</div>
					<div class="phone-1">设计工具</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/9.png" /> <span>Eclipse、MySQL、Tomcat</span>
					</div>
					<div class="phone-1">负责方向：</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/10.png" /> <span
							class="we-content-1">后端主要负责如何实现网站的业务需求和功能，处理前端发送的请求，通过代码实现相应的业务逻辑和功能，并且与数据库进行相应数据交互。</span>
					</div>
				</div>
			</div>
			<div id="shujuku" class="tab-pane fade">
				<div id="two" class="we-content">
					<div class="phone">
						<img src="${pageContext.request.contextPath}/images/8.png" /> <span>数据库部</span>
					</div>
					<div class="phone-1">设计工具</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/9.png" /> <span>Oracle、Mysql、Sql
							server</span>
					</div>
					<div class="phone-1">负责方向：</div>
					<div>
						<img class="phone"
							src="${pageContext.request.contextPath}/images/10.png" /> <span
							class="we-content-1">数据库主要是负责设计表结构，设计SQL语句，对数据进行增、删、改、查，并使其高效率处理数据。</span>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="center-1">
		<img class="img-responsive"
			src="${pageContext.request.contextPath}/images/11.png" />
		<div class="center-img">
			<p class="center-img-p">青春是挽不回的水，转眼消失在指尖</p>
			<p>用力的浪费，再用力的后悔</p>
			<p>不要沉溺与过去，接受新的生活</p>
			<p>新的自己，新的团队</p>
			<p>
				<a href="join.jsp">加入我们</a>
			</p>
			<p>梦想即刻启程!</p>
		</div>
	</div>
	<div class="center-2">
		<img class="img-responsive"
			src="${pageContext.request.contextPath}/images/1-3_02.png" />
		<div class="center-img">
			<p class="center-img-p">青春是挽不回的水，转眼消失在指尖</p>
			<p>用力的浪费，再用力的后悔</p>
			<p>不要沉溺与过去，接受新的生活</p>
			<p>新的自己，新的团队</p>
			<p>
				<a href="/itl/join">加入我们</a>
			</p>
			<p>梦想即刻启程!</p>
		</div>
	</div>
	<div id="foot" class="footer beijing">
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

	<script type="text/javascript">
		
	</script>

	<!--jQuery (necessary for Bootstrap's JavaScript plugins)-->
	<script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
	<!--Include all compiled plugins (below), or include individual files as needed-->
	<script
		src="${pageContext.request.contextPath}/css/bootstrap/dist/js/bootstrap.min.js"></script>

	<script
		src="${pageContext.request.contextPath}/css/source/javascript/index.js"></script>
</body>
</html>