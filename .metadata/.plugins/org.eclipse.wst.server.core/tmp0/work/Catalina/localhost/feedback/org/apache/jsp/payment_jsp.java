/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-23 17:58:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Payment Form</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("        	background-image: url(\"css/paybackground.jpg\");\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-color: #D6EAF8;\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("            margin: 150px auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("        h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"], input[type=\"number\"], input[type=\"date\"], input[type=\"text\"] {\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("         \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f0f0f0;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("            margin-top: 100px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        /* Header and Navigation Bar Styles */\r\n");
      out.write("        .header {\r\n");
      out.write("            background-color: #f1f1f1;\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            font-size: 50px;\r\n");
      out.write("            height: 170px;\r\n");
      out.write("            background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(css/header.jpg);\r\n");
      out.write("            color: white;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: space-evenly;\r\n");
      out.write("            color: #f5f5f5;\r\n");
      out.write("            text-shadow: 1px 1px 1px #919191, 1px 2px 1px #919191, 1px 3px 1px\r\n");
      out.write("                #919191, 1px 4px 1px #919191, 1px 5px 1px #919191, 1px 6px 1px #919191,\r\n");
      out.write("                1px 7px 1px #919191, 1px 8px 1px #919191, 1px 9px 1px #919191, 1px\r\n");
      out.write("                10px 1px #919191, 1px 18px 6px rgba(16, 16, 16, 0.4), 1px 22px 10px\r\n");
      out.write("                rgba(16, 16, 16, 0.2), 1px 25px 35px rgba(16, 16, 16, 0.2), 1px 30px\r\n");
      out.write("                60px rgba(16, 16, 16, 0.4);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .topnav {\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            background-color: #011719;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .topnav a {\r\n");
      out.write("            float: right;\r\n");
      out.write("            display: block;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            padding: 14px 18px;\r\n");
      out.write("            margin: 5px 20px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .topnav a:hover {\r\n");
      out.write("            background-color: #5A5A5A;\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        /* Style footer */\r\n");
      out.write("        footer {\r\n");
      out.write("            margin-top: 15%;\r\n");
      out.write("            padding: 25px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background-color: rgb(2,0,36);\r\n");
      out.write("			background-color: linear-gradient(180deg, rgba(2,0,36,1) 33%, rgba(4,4,75,1) 65%, rgba(8,37,164,1) 93%, rgba(0,212,255,1) 93%);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer img {\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer p {\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footcon {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: space-around;\r\n");
      out.write("            justify-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <img class=\"imge\" src=\"css/logo.png\" width=\"200px\" height=\"100px\">\r\n");
      out.write("        <h2>Dreamscape</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"topnav\">\r\n");
      out.write("        <a href=\"#\">Profile</a>\r\n");
      out.write("        <a href=\"#\">Feedback</a>\r\n");
      out.write("        <a href=\"#\">Link</a>\r\n");
      out.write("        <a href=\"#\">packages</a>\r\n");
      out.write("        <a href=\"#\">Home</a>\r\n");
      out.write("    </div>\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>Payment Form</h2>\r\n");
      out.write("        <form id=\"payment-form\">\r\n");
      out.write("            <label for=\"name\">Name on Card</label>\r\n");
      out.write("            <input type=\"text\" id=\"name\" placeholder=\"John Doe\" required>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"card-number\">Card Number</label>\r\n");
      out.write("            <input type=\"text\" id=\"card-number\" placeholder=\"1234 5678 9012 3456\" required>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"expiry\">Expiration Date</label>\r\n");
      out.write("            <input type=\"text\" id=\"expiry\" placeholder=\"MM/YY\" required>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"cvv\">CVV</label>\r\n");
      out.write("            <input type=\"number\" id=\"cvv\" placeholder=\"123\" required>\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"submit\" value=\"Submit Payment\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        document.getElementById(\"payment-form\").addEventListener(\"submit\", function (e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            // Handle form submission, e.g., send payment data to your server for processing.\r\n");
      out.write("            // You would typically use a secure payment gateway for this.\r\n");
      out.write("            alert(\"Payment submitted.\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <h2>Dreamscape <br>--------------------</h2>\r\n");
      out.write("        <p>We are here to make your dreams come true.</p>\r\n");
      out.write("        <div class=\"footcon\">\r\n");
      out.write("            <img class=\"image\" src=\"css/email.jpg\" width=\"60px\" height=\"60px\">\r\n");
      out.write("            <h3>dreamscap223@gmail.com</h3>\r\n");
      out.write("            <img class=\"image\" src=\"css/insta.jpg\" width=\"60px\" height=\"60px\">\r\n");
      out.write("            <h3>Dreamscape</h3>\r\n");
      out.write("            <img class=\"image\" src=\"css/fb.jpg\" width=\"60px\" height=\"60px\">\r\n");
      out.write("            <h3>Dreamscape</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
