<%@page contentType="text/html; charset=GB2312" %>
  <html>

  <head>
    <title>include指令使用示例</title>
  </head>

  <body>
    <center>
      <font color=blue size="7">
        <%@ include file="head.jsp" %>
      </font>
      <hr color="#CC0000">
      <h2>
        <%@ include file="showdate.jsp" %>
      </h2>
    </center>
  </body>

  </html>