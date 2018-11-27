package com.qccsalumni.project_blog.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component("helloController")
public class HelloController {

    @GetMapping("/")
    String getHello(){
        return "Hello World";
    }

    @GetMapping("/index")
    String index(){
        return "index";
    }
}
