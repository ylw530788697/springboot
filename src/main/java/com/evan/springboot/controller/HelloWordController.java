package com.evan.springboot.controller;



import com.evan.springboot.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/test")
    @ResponseBody
    public Integer test(){
        redisUtil.get("hehe");
        return (Integer) redisUtil.get("hehe");
    }

}
