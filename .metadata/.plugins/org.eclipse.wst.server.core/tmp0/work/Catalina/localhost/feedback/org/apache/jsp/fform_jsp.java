/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-24 07:02:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Feedback Form</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	font-family: \"Times New Roman\", serif;\r\n");
      out.write("	background-image: url(\"feedback.jpg\");\r\n");
      out.write("	background-attachment: fixed;\r\n");
      out.write("	background-position: center;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	width: 100vw;\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*header*/\r\n");
      out.write(".header {\r\n");
      out.write("	padding: 10px 15px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background: rgb(172 187 189 / 80%);\r\n");
      out.write("	box-shadow: inset 2px 3px 5px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	font-size: 50px;\r\n");
      out.write("	height: 150px;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	color: #f5f5f5;\r\n");
      out.write("	text-shadow: 1px 1px 1px #919191, 1px 2px 1px #919191, 1px 3px 1px\r\n");
      out.write("		#919191, 1px 4px 1px #919191, 1px 5px 1px #919191, 1px 6px 1px #919191,\r\n");
      out.write("		1px 7px 1px #919191, 1px 8px 1px #919191, 1px 9px 1px #919191, 1px\r\n");
      out.write("		10px 1px #919191, 1px 18px 6px rgba(16, 16, 16, 0.4), 1px 22px 10px\r\n");
      out.write("		rgba(16, 16, 16, 0.2), 1px 25px 35px rgba(16, 16, 16, 0.2), 1px 30px\r\n");
      out.write("		60px rgba(16, 16, 16, 0.4);\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imge {\r\n");
      out.write("	padding: 5px 5px;\r\n");
      out.write("	margin-left: 30px;\r\n");
      out.write("	margin-right: 50px;\r\n");
      out.write("	width:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* navigation bar */\r\n");
      out.write(".topnav {\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("/*  topnav links style */\r\n");
      out.write(".topnav a {\r\n");
      out.write("	float: right;\r\n");
      out.write("	display: block;\r\n");
      out.write("	color: #011719;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	padding: 14px 18px;\r\n");
      out.write("	margin: 5px 20px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change color on hover */\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("	background-color: #072326;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* topic styel*/\r\n");
      out.write("h1 {\r\n");
      out.write("	font-family: Times New Roman;\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("	font-size: 45px;\r\n");
      out.write("	padding-top: 50px;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	text-transform: capitalize;\r\n");
      out.write("	color: #f5f5f5;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".maincon {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	max-width: 470px;\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("	padding: 25px;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	height: 800px;\r\n");
      out.write("	background: rgb(160 206 210/ 80%);\r\n");
      out.write("	box-shadow: inset 2px 3px 5px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label, input, textarea {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	width: 450px;\r\n");
      out.write("	padding-top: 3px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input, textarea {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("	padding-bottom: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("	background-color: #12467e;\r\n");
      out.write("	color: #ffffff;\r\n");
      out.write("	border: none;\r\n");
      out.write("	padding: 15px 20px;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	cursor: default;\r\n");
      out.write("	text-align: center !important;\r\n");
      out.write("	margin-top: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("	background-color: #0d2f5a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the footer */\r\n");
      out.write("footer {\r\n");
      out.write("	height: 170px;\r\n");
      out.write("text-align: center;\r\n");
      out.write("	color: white;\r\n");
      out.write("	background-color: #777;\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("	padding-top: 15px;\r\n");
      out.write("	padding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer img {\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer p {\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footcon {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: space-around;\r\n");
      out.write("	justify-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("		<img class=\"imge\" src=\"css/logo.png\" width=\"100px\" height=\"100px\">\r\n");
      out.write("		<h2>Dreamscape</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"topnav\">\r\n");
      out.write("		 <a href=\"fform.jsp\">feedback</a><a href=\"EventGallery.jsp\">Gallery</a>\r\n");
      out.write("			<a href=\"EventRequestForm.jsp\">let's chat</a> <a href=\"packageaccount.jsp\">Package</a> <a href=\"home.jsp\">Home</a>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"maincon\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("			<p\r\n");
      out.write("				style=\"text-align: center; color: blue; font-size: 35px; text-shadow: 2px 1px 1px #060606\">Feedback\r\n");
      out.write("				Form</p>\r\n");
      out.write("\r\n");
      out.write("			<form action=\"fbservlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("				<label for=\"name\">ID:(FBXXX)</label> <input type=\"text\" id=\"id\"\r\n");
      out.write("					name=\"id\" required /> <label for=\"name\">Name:</label> <input\r\n");
      out.write("					type=\"text\" id=\"name\" name=\"name\" required /> <label for=\"event\">Event:</label>\r\n");
      out.write("				<input type=\"text\" id=\"event\" name=\"event\" required /> <label\r\n");
      out.write("					for=\"message\">Feedback:</label> <input type=\"text\"\r\n");
      out.write("					style=\"height: 100px;\" name=\"feedback\" required /> <label\r\n");
      out.write("					for=\"rating\">Rating:(very satisfy, good,not bad,bad)</label> <input type=\"text\" id=\"rating\"\r\n");
      out.write("					name=\"rating\" required />\r\n");
      out.write("\r\n");
      out.write("				<div style=\"display: flex; justify-content: center\">\r\n");
      out.write("					<button type=\"submit\" style=\"margin-right: 20px\">Submit</button>\r\n");
      out.write("\r\n");
      out.write("					<button type=\"reset\">Reset</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<footer>\r\n");
      out.write("			<h2>\r\n");
      out.write("				D r e a m s c a p e <br />--------------------\r\n");
      out.write("			</h2>\r\n");
      out.write("\r\n");
      out.write("			<p>we here to make your dreams come true.</p>\r\n");
      out.write("			<div class=\"footcon\">\r\n");
      out.write("				<img class=\"image\" src=\"mail.jpg\" width=\"60px\" height=\"60px\" />\r\n");
      out.write("				<h3>dreamscap223@gmail.com</h3>\r\n");
      out.write("				<img class=\"image\" src=\"inster.jpg\" width=\"60px\" height=\"60px\" />\r\n");
      out.write("				<h3>Dreamscape</h3>\r\n");
      out.write("				<img class=\"image\" src=\"fb.png\" width=\"60px\" height=\"60px\" />\r\n");
      out.write("				<h3>Dreamscape</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("		</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
