<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <!-- --8<-- [start:welcome] -->
  <%
  String username = (String) session.getAttribute("username");
  %>
  <p>欢迎您！<%=username%></p>
  <a href="Bye.jsp">注销</a>
  <!-- --8<-- [end:welcome] -->
</body>

</html>

