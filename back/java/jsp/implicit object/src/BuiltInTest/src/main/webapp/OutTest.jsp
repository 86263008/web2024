<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>

	<!-- --8<-- [start:out] -->
	<%
	out.println("<table border='1'>");
	out.println("<tr>");
	out.println("<th bgcolor='#FF6600'>类型</td>");
	out.println("<th bgcolor='#FF6600'>输出内容</td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>逻辑值</td>");
	out.println("<td>");
	out.print(true);//输出true
	out.println("</td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>字符值</td>");
	out.println("<td>");
	out.println('c');
	out.println("</td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>整数值</td>");
	out.println("<td>");
	out.println(34);
	%>
	<!-- --8<-- [end:out] -->
</body>

</html>

