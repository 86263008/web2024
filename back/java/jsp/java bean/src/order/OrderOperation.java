import java.sql.*;

public class OrderOperation {
  public int saveOrder(Order order) {
    int result = 0;
    try {
      Class.forName("org.sqlite.JDBC");
      Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");
      String strSql = "insert into BookOrder(username,zipcode,phone,"
          + "creditcard,total) values(?,?,?,?,?)";
      PreparedStatement pStatement = con.prepareStatement(strSql);
      pStatement.setString(1, order.getUserName());
      // 设置其它的参数值
      result = pStatement.executeUpdate();
    } catch (SQLException sqlE) {
      sqlE.printStackTrace();
    }
    return result;
  }
}
