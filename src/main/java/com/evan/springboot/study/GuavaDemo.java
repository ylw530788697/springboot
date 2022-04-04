package com.evan.springboot.study;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/03/28 21:14
 */
public class GuavaDemo {
    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String,Object> cache= CacheBuilder.newBuilder().
                build(new CacheLoader<String, Object>() {
            @Override
            public Object load(String s) throws Exception {
                return "test.guava.cache";
            }
        });
        Object evan = get("evan",cache);
        Object o = cache.get("0");
        System.out.println(evan);
        System.out.println(o);
    }

    public static Object get(String key,LoadingCache cache) throws ExecutionException {
        Object testdddddd = cache.get(key, new Callable() {
            @Override
            public Object call() throws Exception {
                cache.put(key, "testdddddd");
                return "testdddddd";
            }
        });
        return testdddddd;
    }

    public static void initCache(LoadingCache cache){
        //cache.get()
    }
}
