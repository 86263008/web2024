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
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  if (username == null)
    username = "";
  if (password == null)
    password = "";

  if (username.equals("chen yi") && password.equals("123456")) {
    //验证用户信息
    session.setAttribute("username", "chen yi");
    response.sendRedirect("Welcome.jsp");//进入欢迎页面
  } else {
    response.sendRedirect("Login.html");//进入登陆页面
  }
  %>
  <!-- --8<-- [end:login] -->
</body>

</html>

