<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="utf-8">
    <title>Insert title here</title>
  </head>

  <body>
    <!-- --8<-- [start:input] -->
    <form action="Cal.jsp" method="post">
      <table border="1">
        <caption>输入长方体的长、宽、高</caption>
        <tr>
          <td>长度</td>
          <td><input type="text" name="length" /></td>
        </tr>
        <tr>
          <td>宽度</td>
          <td><input type="text" name="width" /></td>
        </tr>
        <tr>
          <td>高度</td>
          <td><input type="text" name="height" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="提交" /></td>
        </tr>
      </table>
    </form>
    <!-- --8<-- [start:input] -->
  </body>

  </html>