
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

public class SimpleFilter1 extends HttpFilter implements Filter {
  private FilterConfig filterConfig;

  public SimpleFilter1() {
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
      out.append("<p style='color: blue;'>SimpleFilter1检查中...</p>");
      chain.doFilter(request, response);
      out.append("<p style='color: red;'>SimpleFilter1检查中完成!</p>");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void destroy() {
  }
}
