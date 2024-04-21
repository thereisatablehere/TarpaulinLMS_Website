/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-19 20:57:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import oracle.jdbc.*;
import java.sql.*;
import oracle.jdbc.*;

public final class allGradeReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Pages/../DBconnection.jsp", Long.valueOf(1713324513832L));
    _jspx_dependants.put("/Pages/../userAuth.jsp", Long.valueOf(1713324516145L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(5);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("oracle.jdbc");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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



try {
    int userCheck = (int) session.getAttribute("userType");
    
    if(userCheck != 1 && userCheck != 2) {
        response.sendRedirect("index.jsp");
    }
}
catch(Exception E) {
    response.sendRedirect("index.jsp");
}

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    Connection con = null;

    try {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@//cscioraclerh7srv.ad.csbsju.edu:1521/" +
                                                                "csci.cscioraclerh7srv.ad.csbsju.edu",
                                                                "TEAM06", "TEAM06");
    }
    catch(Exception E) {
        out.println("EXCEPTION encountered");
        out.println(E);
    }

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../Styles/styles.css\">\n");
      out.write("    <title>Tarpaulin - Cumulative Grade Report</title>\n");
      out.write("  <link rel=\"icon\" type=\"image/x-icon\" href=\"../Images/Tarpaulin_Logo_Alt_2.png\">\n");
      out.write("</head>\n");
      out.write("  <body class=\"studentHomeBody\">\n");
      out.write("    <script src=\"../Scripts/headerLoggedIn.js\"></script>\n");
      out.write("\n");
      out.write("    <img class=\"openNavbar\" src=\"../Images/menu.svg\">\n");
      out.write("    \n");
      out.write("    <script src=\"../Scripts/loadSidebar.js\"></script>\n");
      out.write("\n");
      out.write("    <section class=\"mainContainer\">\n");
      out.write("\n");
      out.write("        <p class=\"bigTitle\">Cumulative Grade Report</p>\n");
      out.write("        ");
String username = (String)session.getAttribute("username");
        
        
      out.write("\n");
      out.write("        <section class=\"allGradeReportContainer\">\n");
      out.write("            <div>\n");
      out.write("                <p>Class</p>\n");
      out.write("                <p>Percent Complete</p>\n");
      out.write("            </div>\n");
      out.write("            ");
 String query = "SELECT course_id FROM STUDENT_GRADES_VIEW WHERE username = ?";
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.clearParameters();
            prepStmt.setString(1, username);
            ResultSet result = prepStmt.executeQuery();
            while (result.next()){
              String cname = result.getString(1);
              String innerQuery = "SELECT view_grade(?, ?) FROM dual";
              PreparedStatement prepStmt2 = con.prepareStatement(innerQuery);
              prepStmt2.clearParameters();
              prepStmt2.setString(1, username);
              prepStmt2.setString(2, cname);
              ResultSet result2 = prepStmt2.executeQuery();
              result2.next();
              
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>");
      out.print(cname);
      out.write("</p>\n");
      out.write("                <p>");
      out.print(result2.getInt(1));
      out.write("%</p>\n");
      out.write("            </div>\n");
      out.write("          ");
result2.close();
          prepStmt2.close();}
          result.close();
          prepStmt.close();
          
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script src=\"../Scripts/navbarToggle.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
