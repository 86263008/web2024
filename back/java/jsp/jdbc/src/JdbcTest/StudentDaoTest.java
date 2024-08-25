package xust.stu.demo;

public class StudentDaoTest {
  public static void main(String[] args) {
    StudentDao dao = new StudentDao();
    dao.init();
    dao.create();
    dao.readAll();
    dao.update();
    dao.delete("X1");
    dao.readAll();
  }
}

