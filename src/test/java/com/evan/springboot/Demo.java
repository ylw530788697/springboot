package com.evan.springboot;

import com.evan.springboot.study.DemoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/19 21:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { DemoConfig.class })
public class Demo {
    @Test
    public void demoTest() {

        // Empty test; we just want the context to load

    }
}
