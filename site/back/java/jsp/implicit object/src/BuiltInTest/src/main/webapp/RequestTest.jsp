<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>

	<!-- --8<-- [start:requestHandler] -->
	<%
	out.println("<h4>hello " + request.getParameter("username") + "</h4>");
	out.println("<h4>Your password : " + request.getParameter("password") + "</h4>");
	out.println("<br>request.getMethod()：");
	out.println(request.getMethod()); //返回请求的方法；

	out.println("<br>request.getParameterNames():");
	Enumeration enumdata = request.getParameterNames(); //返回参数名的枚举；
	while (enumdata.hasMoreElements()) {
		String s = (String) enumdata.nextElement(); //返回参数名
		out.println("参数" + s + "=" + request.getParameter(s) + " ;");//输出参数名和对应的参数值
	}
	%>
	<!-- --8<-- [end:requestHandler] -->
</body>

</html>