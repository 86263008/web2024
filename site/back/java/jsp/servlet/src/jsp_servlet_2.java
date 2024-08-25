import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// 扩展 HttpServlet 类
public class HelloWorld extends HttpServlet {
  public void service(ServletRequest request,
      ServletResponse response)
      throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.write("<html>\r\n");
    out.write("  <head>\r\n");
    out.write("    <title>MyJsp.jsp</title>\r\n");
    out.write("  </head>\r\n");
    out.write("  <body>\r\n");
    out.write(" This is my JSP page. <br>\r\n");
    out.write("  </body>\r\n");
    out.write("</html>\r\n");
  }
}
