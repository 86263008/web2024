package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//--8<-- [start:hi]
@RestController
public class Hi1Controller{
  @GetMapping("/hello1")
  public ModelAndView hi1(){
    ModelAndView modelAndView = new ModelAndView("hi1");
    modelAndView.addObject("message", "Hello, Freemarker!");
    
    return modelAndView;
  }
}
//--8<-- [end:hi]
