package com.yulintu.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by qianjiajia on 2016/11/24.
 */

/**
 * CDPlayerTest使用了SPring的ingJUnit4ClassRunner，
 * 以便在测试开始的时候自动创建Spring的应用上下文。
 * 注解ContextConfiguration会告诉他需要在CDPlayerTest中加载配置。
 * 因为CDPlayerTest类中包含了@ComponentScan，
 * 因此最终的应用上下文应该包含CompactDisc bean。
 *
 * 为了证明这一点，在测试代码中有一个CompactDisc类型的属性，
 * 并且这个属性带有@Autowired注解，以便于CompactDisc bean注入到测试代码之中
 *
 * 最后有一个简单的测试方法断言cd属性不为null。
 * 如果它不为null的话，就意味着Spring会发现CompactDisc类，
 * 自动在Spring上下文中将其创建为bean并将其注入到测试代码之中。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    //@Rule
    //public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        //assertEquals(
        //        "Playing Sgt. Pepper's Lonely Hearts Club Band"+
        //                "by The Beatles\n",log.getLog()
        //);
    }
}
