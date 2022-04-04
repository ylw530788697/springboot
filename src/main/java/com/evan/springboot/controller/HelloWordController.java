package com.evan.springboot.controller;



import com.alibaba.fastjson.JSONObject;
import com.evan.springboot.model.User;
import com.evan.springboot.redis.RedisUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    @ApiOperation(value = "", notes = "", httpMethod = "GET")
    public String hello(){

        return "helloWorld";
    }

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/test")
    @ApiOperation(value = "核心课程模块-核心课程查询列表", notes = "", httpMethod = "GET")
    public Integer test(){
        redisUtil.get("hehe");
        return (Integer) redisUtil.get("hehe");
    }


    @GetMapping("/demo")
    @ApiOperation(value = "测试", notes = "", httpMethod = "GET")
    public String demo(){
        User user = new User();
        user.setName("evan");
        user.setAge(19);
        user.setId(1);
        return JSONObject.toJSONString(user);
    }



}
