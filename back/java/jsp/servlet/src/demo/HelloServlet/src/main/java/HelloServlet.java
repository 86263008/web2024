
// 导入必需的 java 库
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//扩展 HttpServlet 类
public class HelloServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public HelloServlet() {
    // 执行必需的初始化
  }

  public void init(ServletConfig config) throws ServletException {
  }

  public void destroy() {
  }

  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    doGet(request, response);
  }

}
