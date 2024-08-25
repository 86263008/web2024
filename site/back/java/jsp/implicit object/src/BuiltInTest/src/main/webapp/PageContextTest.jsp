<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
  <!-- --8<-- [start:page] -->
  <%
  pageContext.setAttribute("name", new String("陈轶"));
  pageContext.setAttribute("userId", new String("chan_yee"));
  %>
  <table align="center" border="2">
    <tr>
      <th bgcolor="#FF6600">参数</th>
      <th bgcolor="#FF6600">值</th>
    </tr>
    <tr>
      <td>姓名</td>
      <td><%=pageContext.getAttribute("name")%></td>
    </tr>
    <tr>
      <td>用户号</td>
      <td><%=pageContext.getAttribute("userId")%></td>
    </tr>
  </table>
  <!-- --8<-- [end:page] -->
</body>

</html>

