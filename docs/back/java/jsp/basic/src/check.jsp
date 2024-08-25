<%@ page contentType="text/html; charset=utf-8" %>
  <html>

  <body>
    <% String name=request.getParameter("name"); String password=request.getParameter("password");
      if(name.equals("Emma")&& password.equals("123456")) { %>
      <jsp:forward page="welcome.jsp">
        <jsp:param name="yourname" value="<%=name%>" />
      </jsp:forward>
      <% } else { %>
        <jsp:forward page="error.html" />
        <%}%>
  </body>

  </html>