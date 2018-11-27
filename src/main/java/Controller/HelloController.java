package Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
