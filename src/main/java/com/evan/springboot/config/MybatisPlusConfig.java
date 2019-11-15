package com.evan.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author evanYang
 * @version 1.0
 * @date 11/14/2019 11:58
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.evan.springboot.mapper")
public class MybatisPlusConfig {
    /***
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
