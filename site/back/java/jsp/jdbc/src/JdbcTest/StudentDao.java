package xust.stu.demo;

import java.sql.*;

public class StudentDao{
  
  //--8<-- [start:init]
  /**
   * 初始化数据库
   */
  public void init() {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "create table Student(" +
      "no TEXT primary key," +
      "name TEXT not null," +
      "gender TEXT," +
      "age INTEGER," +
      "dept TEXT" +
      ");";

    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
      pstmt = con.prepareStatement(sql);
      pstmt.execute();
      System.out.println("Table created successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }   
  }
  //--8<-- [end:init]


  //--8<-- [start:create]
  /**
   * 创建记录
   */
  public void create() {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "insert into Student (no, name, gender, age, dept)" +
      "values (?, ?, ?, ?, ?)";

    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
        pstmt = con.prepareStatement(sql);
      pstmt.setString(1, "X1");
      pstmt.setString(2, "X1");
      pstmt.setString(3, "X1");
      pstmt.setInt(4, 1);
      pstmt.setString(5, "X1");
      pstmt.executeUpdate();
      System.out.println("Records created successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }  
  }
  //--8<-- [end:create]


  //--8<-- [start:delete]
  /**
   * 删除指定no记录
   */
  public void delete(String no) {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "delete from Student where no = ?;";

    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
      
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, no);
      pstmt.executeUpdate();
      System.out.println("Records delete successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
  //--8<-- [end:delete]


  //--8<-- [start:update]
  /**
   * 修改记录
   */
  public void update() {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "update Student set No = ?, Name = ?, Gender = ?, Age = ?, Dept = ? where no = ?";

    try {        
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, "X1");
      pstmt.setString(2, "X1");
      pstmt.setString(3, "X1");
      pstmt.setInt(4, 1);
      pstmt.setString(5, "X1");
      pstmt.setString(6, "X1");
      pstmt.executeUpdate();
      System.out.println("Records update successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  //--8<-- [end:update]


  //--8<-- [start:read]
  /**
   * 读取指定id记录
   */
  public void read(String no) {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "select * from Student where no = ?";
    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, no);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        System.out.println("No=" + rs.getString("no"));
        System.out.println("Name=" + rs.getString("name"));
        System.out.println("Gender=" + rs.getString("gender"));
        System.out.println("Age=" + rs.getInt("age"));
        System.out.println("Dept=" + rs.getString("dept"));
        System.out.println();
      }
      System.out.println("Record read successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }  
  }
  //--8<-- [end:read]


  //--8<-- [start:readAll]
  /**
   * 读取全部记录
   */
  public void readAll() {
    Connection con = null;
    PreparedStatement pstmt = null;
    String sql = "select * from Student";
    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:demo.db");
      pstmt = con.prepareStatement(sql);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        System.out.println("No=" + rs.getString("no"));
        System.out.println("Name=" + rs.getString("name"));
        System.out.println("Gender=" + rs.getString("gender"));
        System.out.println("Age=" + rs.getInt("age"));
        System.out.println("Dept=" + rs.getString("dept"));
        System.out.println();
      }
      System.out.println("Record read successfully");
      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
  //--8<-- [end:readAll]
}

