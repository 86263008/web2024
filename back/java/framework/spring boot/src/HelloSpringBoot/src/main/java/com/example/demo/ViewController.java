package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// --8<-- [start:hello]
@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("msg", "这是来自后端的数据");
        return "hello"; // 视图名，自动找 templates/hello.html
    }
}
// --8<-- [end:hello]
