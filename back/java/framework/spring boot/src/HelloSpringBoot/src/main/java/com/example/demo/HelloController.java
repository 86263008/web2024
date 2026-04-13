package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// --8<-- [start:hello]
@RestController
public class HelloController{
  @RequestMapping("/hello")
  public String hello(){
      return "Hello Spring Boot！";
  }
}
// --8<-- [end:hello]
