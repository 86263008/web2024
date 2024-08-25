<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <!-- --8<-- [start:config] -->
  <%
  int org = 0;
  int count = 0;
  try {
    org = Integer.parseInt(config.getInitParameter("counter"));
  } catch (Exception e) {
  }
  try {
    count = Integer.parseInt(application.getAttribute("config_counter").toString());
  } catch (Exception e) {
  }
  if (count < org)
    count = org;
  out.println("此页面已经访问了" + count + "次");
  count++;
  application.setAttribute("config_counter", new Integer(count));
  %>
  <!-- --8<-- [end:config] -->
</body>

</html>

