/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-15 01:51:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../Styles/style.css\">\n");
      out.write("    <title>Tarpaulin - Your Joined Communities</title>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"studentHomeBody\">\n");
      out.write("    <script src=\"../Scripts/userTypeLocalStorage.js\"></script>\n");
      out.write("    <script src=\"../Scripts/userTypeLocalStorageAuthPageCheck.js\"></script>\n");
      out.write("    <script src=\"../Scripts/header.js\"></script>\n");
      out.write("\n");
      out.write("    <img class=\"openNavbar\" src=\"../Images/menu.svg\">\n");
      out.write("\n");
      out.write("    <script src=\"../Scripts/loadSidebar.js\"></script>\n");
      out.write("\n");
      out.write("    <section class=\"mainContainer profile\">\n");
      out.write("        <div class=\"top\">\n");
      out.write("            <img draggable=\"false\" class=\"profileIcon\" src=\"../Images/user-solid-circle.svg\">\n");
      out.write("            <div>\n");
      out.write("                <p>Your Profile</p>\n");
      out.write("                <p>View or update your account information</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"profileSettings\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>Username</p>\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" value=\"aUser\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>First Name</p>\n");
      out.write("                <input type=\"text\" placeholder=\"First\" value=\"First\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>Last Name</p>\n");
      out.write("                <input type=\"text\" placeholder=\"Last\" value=\"Last\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>Email</p>\n");
      out.write("                <input type=\"text\" placeholder=\"Email\" value=\"your.email.csbsju.edu\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>Password</p>\n");
      out.write("                <img class=\"passwordToggleIcon\" src=\"../Images/eye.png\" onclick=\"\n");
      out.write("                    let input = document.getElementById('password');\n");
      out.write("                    \n");
      out.write("                    if(input.type == 'password') {\n");
      out.write("                        this.src = '../Images/view.png';\n");
      out.write("                        input.type = 'text';\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        this.src = '../Images/eye.png';\n");
      out.write("                        input.type = 'password';\n");
      out.write("                    }\n");
      out.write("                \">\n");
      out.write("                <input type=\"password\" id=\"password\" placeholder=\"password\" value=\"password12345\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script src=\"../Scripts/navbarToggle.js\"></script>\n");
      out.write("\n");
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
