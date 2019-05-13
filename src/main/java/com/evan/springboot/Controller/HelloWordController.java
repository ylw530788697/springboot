package com.evan.springboot.Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "helloWorld";
    }
}
