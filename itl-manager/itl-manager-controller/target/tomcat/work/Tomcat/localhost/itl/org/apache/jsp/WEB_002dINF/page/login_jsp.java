/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-05 04:19:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>后台管理</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"Internship Sign In & Sign Up Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t addEventListener(\"load\", function() {\r\n");
      out.write("\t\t setTimeout(hideURLbar, 0);\r\n");
      out.write("\t\t }, false);\r\n");
      out.write("\t function hideURLbar(){\r\n");
      out.write("\t\t window.scrollTo(0,1);\r\n");
      out.write("\t\t } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/source/style/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- <link href=\"source/style/snow.css\" rel=\"stylesheet\" type=\"text/css\" -->\r\n");
      out.write("<!-- \tmedia=\"all\" /> -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/source/style/style.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- //Custom Theme files -->\r\n");
      out.write("<!-- web font -->\r\n");
      out.write("<!--<link href=\"//fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">-->\r\n");
      out.write("\r\n");
      out.write("<!-- //web font -->\r\n");
      out.write("<script>\r\n");
      out.write("\tsetTimeout(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\tdocument.getElementsByTagName('body')[0].style.height = window.innerHeight\r\n");
      out.write("\t\t\t\t\t\t+ 'px';\r\n");
      out.write("\t\t\t}, 20);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"bg\">\r\n");
      out.write("\t\t<div class=\"top-buttons-agileinfo\">\r\n");
      out.write("\t\t\t<a href=\"/itl/index\" class=\"active one\">首页</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h1>管理员登录</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"main-agileits\">\r\n");
      out.write("\t\t\t<!--form-stars-here-->\r\n");
      out.write("\t\t\t<div class=\"form-w3-agile\">\r\n");
      out.write("\t\t\t\t<form action=\"/itl/user/login\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"请输入用户名\" required=\"true\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"请输入密码\" required=\"true\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"submit-w3l\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"登录\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<a style=\"color: red\">");
      out.print(request.getAttribute("error") == null ? "" : request.getAttribute("error"));
      out.write("</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--//form-ends-here-->\r\n");
      out.write("\t\t<!-- copyright -->\r\n");
      out.write("\t\t<div class=\"copyright w3-agile\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t安阳工学院 版权所有©2018</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //copyright -->\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-2.1.4.min.js\"></script>\r\n");
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
