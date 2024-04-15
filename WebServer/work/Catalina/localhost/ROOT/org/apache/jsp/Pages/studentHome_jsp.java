/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
<<<<<<< Updated upstream
 * Generated at: 2024-04-15 04:12:00 UTC
=======
 * Generated at: 2024-04-15 04:14:17 UTC
>>>>>>> Stashed changes
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class studentHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< Updated upstream
    _jspx_dependants.put("/Pages/../userAuth.jsp", Long.valueOf(1713153126677L));
=======
    _jspx_dependants.put("/Pages/../userAuth.jsp", Long.valueOf(1713153587649L));
>>>>>>> Stashed changes
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../Styles/style.css\">\n");
      out.write("    <title>Tarpaulin - Student Home</title>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"studentHomeBody\">\n");
      out.write("    <script src=\"../Scripts/userTypeLocalStorage.js\"></script>\n");
      out.write("    <script src=\"../Scripts/userTypeLocalStorageAuthPageCheck.js\"></script>\n");
      out.write("    <script src=\"../Scripts/headerLoggedIn.js\"></script>\n");
      out.write("\n");
      out.write("    <img class=\"openNavbar\" src=\"../Images/menu.svg\">\n");
      out.write("    \n");
      out.write("    <script src=\"../Scripts/loadSidebar.js\"></script>\n");
      out.write("\n");
      out.write("    <section class=\"mainContainerLeft\">\n");
      out.write("      \n");
      out.write("      <div class=\"studentWelcome title\">\n");
      out.write("        <p>Welcome back, </p>\n");
      out.write("\n");
      out.write("        ");

        String username = "username";

        try{
          username = (String) session.getAttribute("username");
        }
        catch(Exception E) {
          username = "username";
        }
        
      out.write("\n");
      out.write("        <p id=");
      out.print(username);
      out.write('>');
      out.print(username);
      out.write("</p>\n");
      out.write("        \n");
      out.write("        <p>!</p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <section class=\"studentHomeMainContainer\">\n");
      out.write("\n");
      out.write("        <div class=\"listContainer\">\n");
      out.write("\n");
      out.write("          <p class=\"bigTitle\">My Courses</p>\n");
      out.write("\n");
      out.write("          <div class=\"list coursesList\">\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <div>\n");
      out.write("                <a href=\"courseView.jsp\" class=\"name\">Sample Course</a>\n");
      out.write("                <p>by</p>\n");
      out.write("                <p class=\"instructorName\">Instructor name</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Current lecture:</p>\n");
      out.write("                <a href=\"courseView.jsp\">Some Learning Thing</a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Last test:</p>\n");
      out.write("                <a href=\"courseView.jsp\">Test 1</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <div>\n");
      out.write("                <a href=\"studentHome.jsp\" class=\"name\">Another Course</a>\n");
      out.write("                <p>by</p>\n");
      out.write("                <p class=\"instructorName\">Instructor name</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Current lecture:</p>\n");
      out.write("                <p>You have not started a lecture yet.</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Last test:</p>\n");
      out.write("                <p>You have not taken a test yet.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <div>\n");
      out.write("                <a href=\"studentHome.jsp\" class=\"name\">A Course</a>\n");
      out.write("                <p>by</p>\n");
      out.write("                <p class=\"instructorName\">Instructor name</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Current lecture:</p>\n");
      out.write("                <a href=\"studentHome.jsp\">Some Lecture Here</a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div>\n");
      out.write("                <p>Last test:</p>\n");
      out.write("                <a href=\"studentHome.jsp\">A Random Test Part 3</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"listContainer\">\n");
      out.write("\n");
      out.write("          <p class=\"bigTitle communityNameTitle\">My Communitites</p>\n");
      out.write("  \n");
      out.write("          <div class=\"list communitiesList\">\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <a href=\"communityView.jsp\" class=\"name\">Some Community</a>\n");
      out.write("                <div>\n");
      out.write("                  <p>2</p>\n");
      out.write("                  <p>students</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <a href=\"communityView.jsp\" class=\"name\">Random Community</a>\n");
      out.write("                <div>\n");
      out.write("                  <p>34</p>\n");
      out.write("                  <p>students</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"preview\">\n");
      out.write("              <a href=\"communityView.jsp\" class=\"name\">Another Community</a>\n");
      out.write("                <div>\n");
      out.write("                  <p>21</p>\n");
      out.write("                  <p>students</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
