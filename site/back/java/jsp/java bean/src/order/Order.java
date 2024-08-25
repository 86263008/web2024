public class Order {
  private String userName; // 用户名
  private String zipcode; // 邮编
  private String phone; // 电话
  private String creditcard; // 信用卡
  private double total; // 总额

  public Order() {
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setCreditcard(String creditcard) {
    this.creditcard = creditcard;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public String getPhone() {
    return phone;
  }

  public String getCreditcard() {
    return creditcard;
  }

  public double getTotal() {
    return total;
  }

  public String getUserName() {
    return userName;
  }
}
