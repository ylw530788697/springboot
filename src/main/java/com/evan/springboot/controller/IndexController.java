package com.evan.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/05/08 21:02
 */
@RestController
public class IndexController {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/dedecut/stock")
    public String deductStock(){
        String lockKey="product_01";
        String string = UUID.randomUUID().toString();
        Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(lockKey, string, 40, TimeUnit.SECONDS);
        if (!aBoolean){
            return "error_code";
        }
        try {
            Integer stock = (Integer) redisTemplate.opsForValue().get("stock");
            if (stock>0){
                int realStock=stock-1;
                redisTemplate.opsForValue().set("stock",realStock+"");
                System.out.println("扣减成功");
            }else {
                System.out.println("扣减失败，库存不足");
            }
        }finally {
            if (string.equals(redisTemplate.opsForValue().get(lockKey))){
                redisTemplate.delete(lockKey);
            }
        }
        return "end";
    }
}
