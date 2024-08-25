package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// --8<-- [start:hi]
@RestController
public class HiController{
  @RequestMapping("/hi")
  public String hi(){
      return "Hello Spring Boot！";
  }
}
// --8<-- [start:hi]
