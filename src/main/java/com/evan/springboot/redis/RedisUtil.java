package com.evan.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author evanYang
 * @version 1.0
 * @date 11/02/2019 11:01
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 普通缓存放入
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     * 96
     */

    public boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 109
     * 普通缓存放入并设置时间
     * 110
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     * 114
     */

    public boolean set(String key, Object value, long time) {

        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            } else {
                set(key, value);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);

    }

}
