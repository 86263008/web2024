package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//--8<-- [start:hi]
@Controller
public class Hi2Controller{
  @RequestMapping("/hello2")
  public String hi2(Model model){
	ArrayList<String> messages = new ArrayList<String>();
    messages.add("Hello 1!");
    messages.add("Hello 2!");
    messages.add("Hello 3!");
    model.addAttribute("messages", messages);
    
    return "hi2";
  }
}
//--8<-- [end:hi]
