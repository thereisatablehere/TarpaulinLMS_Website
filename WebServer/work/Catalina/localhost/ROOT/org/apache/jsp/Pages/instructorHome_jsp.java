/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-18 08:13:07 UTC
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

public final class instructorHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Pages/../dontCacheJSP.jsp", Long.valueOf(1713421242988L));
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
      out.write("\n");

response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0);
//prevents caching at the proxy server

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../Styles/styles.css\">\n");
      out.write("    <title>Tarpaulin - Instructor Home</title>\n");
      out.write("  <link rel=\"icon\" type=\"image/x-icon\" href=\"../Images/Tarpaulin_Logo_Alt_2.png\">\n");
      out.write("</head>\n");
      out.write("  <body class=\"instructorHomeBody\">\n");
      out.write("    <script src=\"../Scripts/headerLoggedIn.js\"></script>\n");
      out.write("\n");
      out.write("    <section class=\"mainContainer\">\n");
      out.write("        \n");
      out.write("        <div class=\"studentWelcome title\">\n");
      out.write("            <p>Welcome back, </p>\n");
      out.write("            \n");
      out.write("            ");

            String username = "username";

            try{
                username = (String) session.getAttribute("username");
            }
            catch(Exception E) {
                username = "username";
            }
            
      out.write("\n");
      out.write("            <p id=\"username\">");
      out.print(username);
      out.write("</p>\n");
      out.write("            <p>!</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button class=\"buttonAccent createCourseButton\" onclick='window.open(\"createCourse.jsp\", \"_self\")'>Create a Course</button>\n");
      out.write("\n");
      out.write("        <section class=\"studentHomeMainContainer instructorMainContainer\">\n");
      out.write("\n");
      out.write("            <div class=\"listContainer\">\n");
      out.write("\n");
      out.write("                <p class=\"bigTitle\">My Created Courses</p>\n");
      out.write("\n");
      out.write("                <!-- confirm delete course popup -->\n");
      out.write("                <form class=\"confirmDeleteCourse\" action=\"deleteCourse_action.jsp\" method=\"post\">\n");
      out.write("                    <p></p>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"courseId\" style=\"display: none;\">\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <button class=\"buttonAccent\" type=\"button\" onclick=hideConfirmDeleteCourse()>No</button>\n");
      out.write("                        <button class=\"buttonNormal\" type=\"submit\" onclick=\"let a = 5;\">Yes</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div class=\"list coursesList\">\n");
      out.write("\n");
      out.write("                    ");

                    String query = 
                    "SELECT * " + "\n" + 
                    "FROM TARP_COURSE " + "\n" + 
                    "WHERE username='" + username + "'";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    
                    ResultSet result = preparedStmt.executeQuery();
                    
                    while(result.next()) {
                        String courseId = result.getString(1);
                    
      out.write("\n");
      out.write("            \n");
      out.write("                        <!-- extra indent because part of SJP while loop above  -->\n");
      out.write("                        <div class=\"instructorCoursePreview\">\n");
      out.write("                            <p class=\"bigDescription\">");
      out.print(courseId);
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <!-- course rating - maybe implement later, but for now don't include -->\n");
      out.write("                            <!--\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <div>\n");
      out.write("                                    <img draggable=\"false\" class=\"star\" src=\"../Images/star-full.svg\">\n");
      out.write("                                    <img draggable=\"false\" class=\"star\" src=\"../Images/star-full.svg\">\n");
      out.write("                                    <img draggable=\"false\" class=\"star\" src=\"../Images/star-full.svg\">\n");
      out.write("                                    <img draggable=\"false\" class=\"star\" src=\"../Images/star-full.svg\">\n");
      out.write("                                    <img class=\"emptyStar\" src=\"../Images/star-full.svg\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>(4.5)</p>\n");
      out.write("                            </div>\n");
      out.write("                            -->\n");
      out.write("\n");
      out.write("                            <!-- get the number of students taking the course -->\n");
      out.write("                            ");

                            String queryInner = 
                            "SELECT username " + "\n" + 
                            // WHY IS ENROLLS SPELLED WITH 2 L'S??? SPELLING FEELS HARD SOMETIMES
                            "FROM TARP_ENROLLS " + "\n" + 
                            "WHERE course_id='" + courseId + "'";
                            PreparedStatement preparedStmtInner = con.prepareStatement(queryInner);
                            
                            ResultSet resultInner = preparedStmtInner.executeQuery();
                            
                            int count = 0;
                            while(resultInner.next()) {
                                ++count;
                            }

                            resultInner.close();
                            preparedStmtInner.close();
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"students\">\n");
      out.write("                                <p>");
      out.print(count);
      out.write("</p>\n");
      out.write("                                <p>students</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"controls\">\n");
      out.write("                                <a href=\"courseView.jsp\">View</a>\n");
      out.write("                                \n");
      out.write("                                <!-- TODO later -->\n");
      out.write("                                <a href=\"editCourse.jsp\">Edit</a>\n");
      out.write("                                \n");
      out.write("                                <!-- TODO later -->\n");
      out.write("                                <a href=\"instructorHome.jsp\">QBoard</a>\n");
      out.write("                                \n");
      out.write("                                <a class=\"delete\" onclick=openDeleteCourseConfirm(this)>Delete</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    ");

                    }

                    result.close();
                    preparedStmt.close();
                    
      out.write("\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- display message if instructor has no courses -->\n");
      out.write("        <script>\n");
      out.write("            let checkLength = document.getElementsByClassName(\"instructorCoursePreview\").length;\n");
      out.write("            let parent = document.getElementsByClassName(\"coursesList\")[0];\n");
      out.write("            \n");
      out.write("            if(checkLength == 0) {\n");
      out.write("                parent.innerHTML = \"<p class='bigDescription'>You have not created a course yet.</p>\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- handle confirm course delete stuff -->\n");
      out.write("    <script>\n");
      out.write("        let ref = document.getElementsByClassName(\"confirmDeleteCourse\")[0];\n");
      out.write("        let courseIdElem = ref.getElementsByTagName(\"p\")[0];\n");
      out.write("        let inputElem = ref.getElementsByTagName(\"input\")[0];\n");
      out.write("\n");
      out.write("        function hideConfirmDeleteCourse() {\n");
      out.write("            ref.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function openDeleteCourseConfirm(elem) {\n");
      out.write("            let courseId = elem.parentNode.parentNode.children[0].innerText;\n");
      out.write("            inputElem.value = courseId;\n");
      out.write("            \n");
      out.write("            courseIdElem.innerText = \"Are you sure you want to delete \" + courseId + \"?\";\n");
      out.write("\n");
      out.write("            ref.style.display = \"flex\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
