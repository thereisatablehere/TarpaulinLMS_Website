<%
String courseId = request.getParameter("courseId");

session.setAttribute("courseId", courseId);
response.sendRedirect("editCourse.jsp");
%>