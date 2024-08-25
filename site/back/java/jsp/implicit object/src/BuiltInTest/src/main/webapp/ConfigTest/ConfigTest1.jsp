<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <table border="2">
    <th bgcolor="#FF6600">参数名</th>
    <th bgcolor="#FF6600">值</th>
    <!-- --8<-- [start:config] -->
    <%
    Enumeration conenum = config.getInitParameterNames();
    while (conenum.hasMoreElements()) {
      String str = (String) conenum.nextElement();
      out.println("<tr><td>" + str + "</td>");
      out.println("<td>" + config.getInitParameter(str) + "</td></tr>");
    }
    %>
    <!-- --8<-- [end:config] -->
  </table>
</body>

</html>

