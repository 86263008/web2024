package com.example.demo;

@Controller // 将UserController变成一个Handler
@RequestMapping("/user") // 指定控制器映射的URL
public class UserController {

  @RequestMapping(value = "/register") // 处理方法对应的URL，相对于类的URL
  public String register() {
    return "user/register"; // 返回逻辑视图名
  }
}
