package xust.demo.stu.action;

import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import xust.demo.Result;
import xust.demo.stu.domain.Student;
import xust.demo.stu.service.StudentService;
import xust.demo.stu.service.StudentServiceImpl;

//--8<-- [start:get]
@WebServlet("/demo/Student/Get")
public class StudentGetServlet extends HttpServlet {
  private StudentService _StudentService = new StudentServiceImpl();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    Result res = _StudentService.get(request.getParameter("no"));
    response.setCharacterEncoding("utf-8");
    response.setContentType("application/json");
    response.getWriter().append(String.format("{\"code\":%d, \"message\":\"%s\", \"data\":%s}", res.code, res.message, res.data));
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    doGet(request, response);
  }
}
//--8<-- [end:get]

