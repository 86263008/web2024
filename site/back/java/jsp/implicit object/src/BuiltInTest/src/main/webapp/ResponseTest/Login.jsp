<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>

  <!-- --8<-- [start:login] -->
  <%
  String name = request.getParameter("username");
  if (name == null)
    response.sendRedirect("Login.html");
  else if (name.equals("chenyi"))
    response.sendRedirect("Welcome.jsp");
  else
    throw new Exception("未注册用户！");
  %>
  <!-- --8<-- [end:login] -->
</body>

</html>

