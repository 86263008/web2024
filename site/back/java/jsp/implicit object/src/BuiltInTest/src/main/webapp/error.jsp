<%@ page isErrorPage="true" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>错误页面</title>
</head>
<body>
  <h1>发生错误</h1>
  <p>
    错误类型:
    <%=exception.getClass().getName()%></p>
  <p>
    错误信息:
    <%=exception.getMessage()%></p>
</body>
</html>