<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>长方体计算</title>
</head>

<body>
  <!-- --8<-- [start:cal] -->
  <jsp:useBean id="cuboid1" scope="page" class="beans.CuboidBean" />
  <jsp:setProperty name="cuboid1" property="*" />
  <%
  if (cuboid1.isCuboid()) {
    out.println("CuboidBean的应用一<br>");
    out.println("长=" + cuboid1.getLength());
    out.println("宽=" + cuboid1.getWidth());
    out.println("高=" + cuboid1.getHeight());
    out.println("周长：" + cuboid1.getPerimeter());
    out.println("面积:" + cuboid1.getArea());
    out.println("体积：" + cuboid1.getVolume());
  }
  %>

  <jsp:useBean id="cuboid2" scope="page" class="beans.CuboidBean">
    <jsp:setProperty name="cuboid2" property="width" value="23" />
    <jsp:setProperty name="cuboid2" property="height" />
    <jsp:setProperty name="cuboid2" property="length" />
  </jsp:useBean>
  <%
  if (cuboid2.isCuboid()) {
    out.println("<br><hr>CuboidBean的应用二<br>");
    out.println("长=" + cuboid2.getLength());
    out.println("宽=" + cuboid2.getWidth());
    out.println("高=" + cuboid2.getHeight());
  }
  %>

  <jsp:useBean id="cuboid3" scope="page" class="beans.CuboidBean">
    <jsp:setProperty name="cuboid3" property="width"
      value="<%=cuboid2.getHeight()%>" />
    <jsp:setProperty name="cuboid3" property="height"
      value="<%=cuboid2.getLength()%>" />
    <jsp:setProperty name="cuboid3" property="length"
      value="<%=cuboid2.getWidth()%>" />
  </jsp:useBean>
  <%
  if (cuboid3.isCuboid()) {
    out.println("<br><hr>CuboidBean的应用三->修改CuboidBean的长宽高<br>");
    out.println("长=" + cuboid3.getLength());
    out.println("宽=" + cuboid3.getWidth());
    out.println("高=" + cuboid3.getHeight());
  }
  %>
  <!-- --8<-- [start:cal] -->
</body>

</html>