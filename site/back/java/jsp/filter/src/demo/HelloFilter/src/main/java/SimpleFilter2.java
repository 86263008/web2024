
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/*")
public class SimpleFilter2 extends HttpFilter implements Filter {
  private FilterConfig filterConfig;

  public SimpleFilter2() {
    super();
  }

  public void init(FilterConfig fConfig) throws ServletException {
    this.filterConfig = fConfig;
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    try {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      out.append("<p style='color: red;'>SimpleFilter2检查中...</p>");
      chain.doFilter(request, response);
      out.append("<p style='color: red;'>SimpleFilter2检查完成!</p>");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void destroy() {
  }
}
