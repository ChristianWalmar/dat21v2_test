package com.example.cwdemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("hejhej")
    public String hejHej(){
        return "hej";
    }

    @GetMapping("/greet")
    public String greet(){
       return "hello";
    }

}
