package com.evan.springboot.study;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/05/20 19:59
 */
public class Cache {
    public  ConcurrentHashMap<String,MyCache> concurrentHashMap;
    private static int size;
    public Cache(int size){
        concurrentHashMap = new ConcurrentHashMap<>(size);
        this.size=size;
    }
    public Object get(String key){
        //非空判断
        if(StringUtils.isBlank(key))
            return null;
        //字典中不存在
        if(concurrentHashMap.isEmpty())
            return null;
        if(!concurrentHashMap.containsKey(key))
            return null;
        MyCache cache = concurrentHashMap.get(key);
        if (cache == null)
            return null;
        //惰性删除，判断缓存是否过期
        long timeoutTime = System.currentTimeMillis() - cache.getWriteTime();

        cache.setHitCount(cache.getHitCount()+1);
        cache.setLastTime(System.currentTimeMillis());
        return cache.getValue();
    }
    public void set(String key, Object value){
        //非空判断
        if(StringUtils.isBlank(key)) return;
        //缓存存在，更新缓存
        if(concurrentHashMap.containsKey(key))
        {
            MyCache cache = concurrentHashMap.get(key);
            cache.setHitCount(cache.getHitCount()+1);
            cache.setWriteTime(System.currentTimeMillis());
            cache.setLastTime(System.currentTimeMillis());
            cache.setValue(value);
            return;
        }
        //创建缓存
        MyCache cache = new MyCache();
        cache.setKey(key);
        cache.setHitCount(1);
        cache.setWriteTime(System.currentTimeMillis());
        cache.setLastTime(System.currentTimeMillis());
        cache.setValue(value);
        //删除最少访问的key
        if (concurrentHashMap.size()>size){
            int min=Integer.MAX_VALUE;
            HashMap<String, String> map = new HashMap<>();
            for (String s : concurrentHashMap.keySet()) {
                MyCache myCache = concurrentHashMap.get(s);
                if (myCache.getHitCount()<min){
                    min=myCache.getHitCount();
                    map.put(String.valueOf(min),s);
                }
            }
            concurrentHashMap.remove(map.get(min));
        }
        concurrentHashMap.put(key,cache);
    }

 
}
class MyCache implements Comparable<MyCache> {

    //缓存键
    private Object key;

    //缓存值
    private Object value;

    //最后访问时间
    private long lastTime;

    //创建时间
    private long writeTime;

    //存活时间
    private long expireTime;

    //命中次数
    private  Integer hitCount;



    @Override
    public int compareTo(MyCache o) {
        return 0;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    public long getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(long writeTime) {
        this.writeTime = writeTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }
}
