package com.evan.springboot.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/05/08 21:30
 */
@Configuration
public class WebConfig {
    @Bean
    public Redisson redisson(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379").setDatabase(0);
         return (Redisson) Redisson.create(config);
    }
}
