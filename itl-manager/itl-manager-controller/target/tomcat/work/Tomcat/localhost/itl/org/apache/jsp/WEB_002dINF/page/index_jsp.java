/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-23 13:34:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>信息技术实验室</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<!--公用样式表-->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/public/style/common.css\" />\r\n");
      out.write("\r\n");
      out.write("<!--個人樣式表-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/source/style/index.css\">\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t      <script src=\"https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("\t      <script src=\"https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\t  <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"huidaodingbu\">\r\n");
      out.write("\t\t<a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/0.1.png\" /></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"lunbo phone-3\">\r\n");
      out.write("\t\t<div class=\"header-1\">\r\n");
      out.write("\t\t\t<div class=\"left-header\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/3.png\" /> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\">Information Technology Lab</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"right-header\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/index\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/department\">部门介绍</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/about\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/join\">加入我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/user/login\">后台管理</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div><!--  -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"wenzi-1\">信息技术实验室</div>\r\n");
      out.write("\t\t<div class=\"wenzi-2\">What are you waiting for a chance</div>\r\n");
      out.write("\t\t<div class=\"wenzi-3\">we are waiting for you</div>\r\n");
      out.write("\t\t<div class=\"wenzi-4\">\r\n");
      out.write("\t\t\t<a href=\"/itl/join\">加入我们</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）指标 -->\r\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）项目 -->\r\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/2.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/1.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Second slide\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）导航 -->\r\n");
      out.write("\t\t\t<a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t</a> <a class=\"carousel-control right\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\tdata-slide=\"next\"> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default phone-4 \">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<img class=\"navbar-brand\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/3.png\" /> <a\r\n");
      out.write("\t\t\t\t\tclass=\"navbar-brand nav-wenzi\" href=\"#\">Information Technology\r\n");
      out.write("\t\t\t\t\tLab</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\"\r\n");
      out.write("\t\t\t\tid=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/index\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/department\">部门介绍</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/about\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/join\">加入我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/itl/user/login\">后台管理</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.container-fluid -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"lunbo phone-2\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"wenzi-1\">信息技术实验室</div>\r\n");
      out.write("\t\t<div class=\"wenzi-2\">What are you waiting for a chance</div>\r\n");
      out.write("\t\t<div class=\"wenzi-3\">we are waiting for you</div>\r\n");
      out.write("\t\t<div class=\"wenzi-4\">\r\n");
      out.write("\t\t\t<a href=\"/itl/join\">加入我们</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"myCarousel1\" class=\"carousel slide\">\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）指标 -->\r\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel1\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel1\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）项目 -->\r\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/1-1_01.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/1-2_01.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Second slide\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 轮播（Carousel）导航 -->\r\n");
      out.write("\t\t\t<a class=\"carousel-control left\" href=\"#myCarousel1\"\r\n");
      out.write("\t\t\t\tdata-slide=\"prev\"> </a> <a class=\"carousel-control right\"\r\n");
      out.write("\t\t\t\thref=\"#myCarousel1\" data-slide=\"next\"> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"center\">\r\n");
      out.write("\t\t<img id=\"image-left\" class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/4.png\" /> <img\r\n");
      out.write("\t\t\tid=\"image-right\" class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/5.png\" />\r\n");
      out.write("\t\t<p>每位实验员都有自己的一台电脑和电脑桌。</p>\r\n");
      out.write("\t\t<p>同学们随时可以在这里自主学习所加入部门的相关内容。</p>\r\n");
      out.write("\t\t<p>遇到不懂的问题时，</p>\r\n");
      out.write("\t\t<p>还有优秀的学长学姐为你解答疑惑。</p>\r\n");
      out.write("\t\t<p>也会有我们在外实习或工作的学长学姐们和我们一起交流面试和工作经验。</p>\r\n");
      out.write("\t\t<p>不出校门也能了解外面的世界。</p>\r\n");
      out.write("\t\t<img id=\"image-left\" class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/6.png\" /> <img\r\n");
      out.write("\t\t\tid=\"image-right\" class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/7.png\" />\r\n");
      out.write("\t\t<p>本实验室主要研究网站的设计、建立、运维。</p>\r\n");
      out.write("\t\t<p>你可以在此学习到的技术有UI、html、java web、数据库等。</p>\r\n");
      out.write("\t\t<p>这对于同学们的就业问题会提供很大的帮助。</p>\r\n");
      out.write("\t\t<p>同时，我们的负责老师还会有项目让同学们练习。</p>\r\n");
      out.write("\t\t<p>以此增强同学们的项目实战能力。</p>\r\n");
      out.write("\t\t<p>企业缺少的是有项目经验的人，</p>\r\n");
      out.write("\t\t<p>在这里，将有真实的项目给你练习，</p>\r\n");
      out.write("\t\t<p>让你在找工作时比别人更胜一筹。</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"we\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ul id=\"we-ul\" class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t<li class=\"sss\"><a href=\"#sheji\" data-toggle=\"tab\">设计部</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"sss\"><a href=\"#qianduan\" data-toggle=\"tab\">前端部</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"sss\"><a href=\"#houtai\" data-toggle=\"tab\">后端部</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"sss\"><a href=\"#shujuku\" data-toggle=\"tab\">数据库</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div id=\"sheji\" class=\"tab-pane in active fade \">\r\n");
      out.write("\t\t\t\t<div id=\"two\" class=\"we-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/8.png\" /> <span>设计部</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">设计工具：</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/9.png\" /> <span>Photoshop、UI、Coreldraw</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">负责方向：</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/10.png\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"we-content-1\">负责网站项目的版式、风格设计。进行广告专题设计。以用户为中心的理念，对页面优化，改善用户体验。</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"qianduan\" class=\"tab-pane fade \">\r\n");
      out.write("\t\t\t\t<div id=\"two\" class=\"we-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/8.png\" /> <span>前端部</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">设计工具</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/9.png\" /> <span>Html、CSS、JavaScript、JQuery</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">负责方向：</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/10.png\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"we-content-1\">负责页面的布局及网站结构的排布，实现一些与用户实时交互的特效，构建响应式页面，使网页适应多种平台，改善用户体验。</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"houtai\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t\t\t<div id=\"two\" class=\"we-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/8.png\" /> <span>后端部</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">设计工具</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/9.png\" /> <span>Eclipse、MySQL、Tomcat</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">负责方向：</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/10.png\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"we-content-1\">后端主要负责如何实现网站的业务需求和功能，处理前端发送的请求，通过代码实现相应的业务逻辑和功能，并且与数据库进行相应数据交互。</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"shujuku\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t\t\t<div id=\"two\" class=\"we-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/8.png\" /> <span>数据库部</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">设计工具</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/9.png\" /> <span>Oracle、Mysql、Sql\r\n");
      out.write("\t\t\t\t\t\t\tserver</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"phone-1\">负责方向：</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/10.png\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"we-content-1\">数据库主要是负责设计表结构，设计SQL语句，对数据进行增、删、改、查，并使其高效率处理数据。</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"center-1\">\r\n");
      out.write("\t\t<img class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/11.png\" />\r\n");
      out.write("\t\t<div class=\"center-img\">\r\n");
      out.write("\t\t\t<p class=\"center-img-p\">青春是挽不回的水，转眼消失在指尖</p>\r\n");
      out.write("\t\t\t<p>用力的浪费，再用力的后悔</p>\r\n");
      out.write("\t\t\t<p>不要沉溺与过去，接受新的生活</p>\r\n");
      out.write("\t\t\t<p>新的自己，新的团队</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"join.jsp\">加入我们</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>梦想即刻启程!</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"center-2\">\r\n");
      out.write("\t\t<img class=\"img-responsive\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/1-3_02.png\" />\r\n");
      out.write("\t\t<div class=\"center-img\">\r\n");
      out.write("\t\t\t<p class=\"center-img-p\">青春是挽不回的水，转眼消失在指尖</p>\r\n");
      out.write("\t\t\t<p>用力的浪费，再用力的后悔</p>\r\n");
      out.write("\t\t\t<p>不要沉溺与过去，接受新的生活</p>\r\n");
      out.write("\t\t\t<p>新的自己，新的团队</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"/itl/join\">加入我们</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>梦想即刻启程!</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"foot\" class=\"footer beijing\">\r\n");
      out.write("\t\t<div class=\"footer-left\">\r\n");
      out.write("\t\t\t<h3>联系方式：</h3>\r\n");
      out.write("\t\t\t<p>邮箱：894517069@qq.com</p>\r\n");
      out.write("\t\t\t<p>邮箱：1557134371@qq.com</p>\r\n");
      out.write("\t\t\t<p>地址：安阳工学院-计算机科学与信息工程学院-信息技术实验室604</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-right\">\r\n");
      out.write("\t\t\t<h3>友情链接：</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"http://jwgl.ayit.edu.cn/\">安阳工学院官网</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"http://jwc.ayit.edu.cn/\">安阳工学院教务处</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>地址：安阳工学院-计算机科学与信息工程学院-信息技术实验室</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"yuanzi\">\r\n");
      out.write("\t\t\t<p>@安阳工学院信息技术实验室</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!--jQuery (necessary for Bootstrap's JavaScript plugins)-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\t<!--Include all compiled plugins (below), or include individual files as needed-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/source/javascript/index.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
