<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <!-- --8<-- [start:app] -->
  <%
  int count = 1;
  try {
    count = Integer.parseInt(application.getAttribute("counter").toString());
  } catch (Exception e) {
    out.println("<p align=center>计数器没有发生作用!</p>");
  }
  out.println("<p align=center>自从服务器启动后，此页面已经访问了" + count + "次</p>");
  count++;
  application.setAttribute("counter", count);
  %>
  <!-- --8<-- [end:app] -->
</body>

</html>

