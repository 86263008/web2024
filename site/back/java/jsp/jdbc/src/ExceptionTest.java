import java.sql.SQLException;

public class ExceptionTest {
  /**
   * fooBar
   */
  public void foobar() throws SQLException {
    throw new SQLException("刚引发了一个 SQLException");
  }

  //--8<-- [start:TestException]
  public void TestException() {
    try {
      foobar();
    } catch (SQLException ex) {
      System.out.println("已捕获一个 SQLException 异常!");
      System.out.println("消息: " + ex.getMessage());
      System.out.println("错误代码: " + ex.getErrorCode());
    }
  }
  //--8<-- [end:TestException]

  public static void main(String[] args) {
    ExceptionTest o = new ExceptionTest();
    o.TestException();
  }
}
