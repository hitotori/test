/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-04-01 01:25:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class battle1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.37.jar", Long.valueOf(1552875316692L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-nakajima/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/testgame/WEB-INF/lib/struts2-core-2.3.37.jar!/META-INF/struts-tags.tld", Long.valueOf(1546144326000L));
  }

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\">\r\n");
      out.write("<meta name=\"descrption\" content=\"\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/testgame/WebContent/css/Style.css\">\r\n");
      out.write("<link rel=\"img\" type=\"image/png\" href=\"/testgame/img\">\r\n");
      out.write("<link href=\"http://kuneoresearch.com/wp-content/themes/stinger5verkuneo/font/PixelMplus10-Regular.ttf'\">\r\n");
      out.write("<title>UserHome</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@font-face {\r\n");
      out.write("\tfont-family: PixelMplus10-Regular;\r\n");
      out.write("\tsrc: url('http://kuneoresearch.com/wp-content/themes/stinger5verkuneo/font/PixelMplus10-Regular.ttf') format(\"truetype\");\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family:'PixelMplus10-Regular','MS Gothic',;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("\tbackground: -webkit-linear-gradient(top, gray, black);\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmin-height: 600px;\r\n");
      out.write("\theight: auto !important;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.rightup {\r\n");
      out.write("\tborder-radius: 50px;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".status {\r\n");
      out.write("\twidth: 60%;\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("/* \tborder: lightgray 2px solid; */\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".command {\r\n");
      out.write("float:left;\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("\tborder: white 2px solid;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tmargin-left:20%;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("}\r\n");
      out.write(".commandbox{\r\n");
      out.write("width:100%;\r\n");
      out.write("height:100%;\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("}\r\n");
      out.write(".command2{\r\n");
      out.write("width:100%;\r\n");
      out.write("/* border:white 1px solid; */\r\n");
      out.write("}\r\n");
      out.write(".log {\r\n");
      out.write("float:left;\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tborder: white 2px solid;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".chara{\r\n");
      out.write("color:white;\r\n");
      out.write("border:white 2px solid;\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("height:100%;\r\n");
      out.write("width:25%;\r\n");
      out.write("table-layout:fixed;\r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".chara2{\r\n");
      out.write("color:white;\r\n");
      out.write("border:white 2px solid;\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("height:100%;\r\n");
      out.write("width:25%;\r\n");
      out.write("table-layout:fixed;\r\n");
      out.write("float:right;\r\n");
      out.write("}\r\n");
      out.write("tr{\r\n");
      out.write("/* border:white 1px solid; */\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write("/* border:white 1px solid; */\r\n");
      out.write("}\r\n");
      out.write("/* legend{ */\r\n");
      out.write("/* color:white; */\r\n");
      out.write("/* float:left; */\r\n");
      out.write("/* padding-left:20%; */\r\n");
      out.write("/* } */\r\n");
      out.write("/* h3{ */\r\n");
      out.write("/* color:white; */\r\n");
      out.write("/* } */\r\n");
      out.write("img{\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("#footer{\r\n");
      out.write("clear:both;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\"></div>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div class=\"status\">\r\n");
      out.write("<!-- \t\t<fieldset> -->\r\n");
      out.write("<!-- \t\t <legend>名前</legend> -->\r\n");
      out.write("<!-- \t\t <legend>仲間はいない</legend> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t <h3>Lv:〇</h3><br> -->\r\n");
      out.write("<!-- \t\t <h3>HP:〇</h3><br> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t</fieldset> -->\r\n");
      out.write("\t\t\t<table class=\"chara\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Name:</td>\r\n");
      out.write("\t\t\t\t\t<td>値</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Lv:</td>\r\n");
      out.write("\t\t\t\t\t<td>値</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>HP:</td>\r\n");
      out.write("\t\t\t\t\t<td>値</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t\t//偽用 -->\r\n");
      out.write("\t\t\t<table class=\"chara\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>仲間はいない</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"chara2\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>仲間はいない:</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"chara2\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>仲間はいない</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t\t<td>…</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<img src=\"img/toy_slime_suraimu.png\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"command\">\r\n");
      out.write("\t\t<table class=\"commandbox\">\r\n");
      out.write("\t\t<tr class=\"command1\"><td class=\"command2\">ここに選択肢</td></tr>\r\n");
      out.write("\t\t<tr class=\"command1\"><td class=\"command2\">command</td></tr>\r\n");
      out.write("\t\t<tr class=\"command1\"><td class=\"command2\">またはログ</td></tr>\r\n");
      out.write("\t\t<tr class=\"command1\"><td class=\"command2\">log</td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"log\">ヌフイム</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\"></div>\r\n");
      out.write("</body>\r\n");
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
