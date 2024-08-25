<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <p>
  <h2 align="center">request的Headers信息</h2>
  </p>
  <p align="left">
    request的method:<%=request.getMethod()%><br> request的URI：<%=request.getRequestURI()%><br>
    request的Protocol：<%=request.getProtocol()%><br>
  </p>
  <table border="2">
    <th bgcolor="#FF6600">request header</th>
    <th bgcolor="#FF6600">request values</th>
    <%
    Enumeration headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
      String headName = (String) headerNames.nextElement();
      out.println("<tr><td>" + headName);
      out.println("<td>" + request.getHeader(headName));
    }
    %>
  </table>
</body>

</html>

