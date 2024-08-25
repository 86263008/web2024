<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <!-- --8<-- [start:bye] -->
  <%
  String username = (String) session.getAttribute("username");
  out.println("Session ID:" + session.getId());//输出会话编号
  session.invalidate();//注销会话。 
  if (username != null) {
    out.println(username + "再见!欢迎再来!");
  }
  %>
  <!-- --8<-- [end:bye] -->
</body>

</html>