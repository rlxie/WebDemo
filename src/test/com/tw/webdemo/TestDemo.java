package com.tw.webdemo;

import com.tw.webdemo.Demo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

/**
 * Created by rlxie on 8/4/16.
 */
public class TestDemo {

    private Demo demo;

    @Before
    public void setUp(){
        demo = new Demo();
    }

    @Test
    public void TestSayHi(){
        Assert.assertEquals("Hi,ray", demo.sayHi("ray"));
    }
}
