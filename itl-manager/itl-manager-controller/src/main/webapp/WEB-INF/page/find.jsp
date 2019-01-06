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
	href="${pageContext.request.contextPath }/css/source/style/join.css" />

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
						<li><a href="/itl/user/login">加入我们</a></li>

					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>

	<div>
		<div class="main"">
			<div class="biaoti">
				<div class="kuang">
					<h1>加入我们</h1>
				</div>
				<p>请认真填写以下报告内容，确保信息真实有效。</p>
			</div>
			<ul class="ul-xinxi">
				<li class="fl">
					<p class="fs19">姓名：</p> <input id="name" type="text" name="#"
					value="张三" />
					<p class="jinggao">正确格式</p>
				</li>
				<li class="fr">
					<p class="fs19">性别：</p> <input id="sex" type="text" name="#"
					value="张三" />
					<p class="jinggao">sss</p>
				</li>
				<li class="fl cb">
					<p class="fs19">专业班级：</p> <input id="zy" type="text" name="#"
					value="张三" />
					<p class="jinggao">sss</p>
				</li>
				<li class="fr">
					<p class="fs19">想要加入的部门：</p> <input id="bm" type="text" name="#"
					value="张三" />
					<p class="jinggao">sss</p>
				</li>
				<li class="fl cb">
					<p class="fs19">学号</p> <input id="xh" type="text" name="#"
					value="张三" />
					<p class="jinggao">sss</p>
				</li>
				<li class="fr">
					<p class="fs19">tel</p> <input id="tel" type="text" name="#"
					value="张三" />
					<p class="jinggao">sss</p>
				</li>
				<li class="fl cb">
					<p class="fs19">专业技能</p> <textarea id="jn">
							
						</textarea>
					<p class="jinggao">sss</p>
				</li>
				<li class="fl cb">
					<p class="fs19">自我能力描述</p> <textarea id="nl">
							
						</textarea>
					<p class="jinggao">sss</p>
				</li>
			</ul>
			<div class="tijiao" id="tijiao">提交</div>
			<!--注意事项-->
			<div class="zhuyishixiang">
				<h2>注意事项</h2>
				<ul>
					<li>1.你必须是安阳工学院计算机科学与信息工程学院大二的在校生</li>
					<li>2.你必须有极强的自我学习能力，能够做到没有人强迫也能自己学习，做个学习的主人</li>
					<li>3.你得有持续的学习热情激励自己不怕困难，同事，做事情要有耐心，遇到困难时不畏惧</li>
					<li>4.你得有C语言或者其他高级程序设计语言基础</li>
					<li>5.对html、css、javascript或者java有了解的优先考虑</li>
					<li>6.有独立做过小项目的优先考虑</li>
				</ul>
				<p>如有以上加分项请在简历上标明清楚</p>
				<p>如对我们实验室感兴趣，请于2107年9月23日(周五)之前提交表格，于2017年9月23日(周五)晚上7点半来本实验室面试
				
				<p>
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
			<p>地址：安阳工学院-计算机科学与信息工程学院-信息技术实验室604</p>
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

	<script>
		var a = document.getElementsByClassName('jinggao');
	</script>

</body>
</html>