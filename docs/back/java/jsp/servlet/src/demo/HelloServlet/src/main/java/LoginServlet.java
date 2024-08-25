
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public LoginServlet() {
  }

  //--8<-- [start:doGet]
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String user_name = request.getParameter("user_name");
    String password = request.getParameter("password");
    if ("xust".equals(user_name) && "666".equals(password)) {
      RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
      dispatcher.forward(request, response);
    } else {
      response.sendRedirect("fail.jsp");
    }
  }
  //--8<-- [end:doGet]

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }

}
