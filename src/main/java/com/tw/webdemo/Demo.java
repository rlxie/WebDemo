package com.tw.webdemo;

/**
 * Created by rlxie on 8/4/16.
 */
public class Demo {

    public String sayHi(String name){
        return "Hi," + name;
    }

    public static void main(String[] args){

        Demo d = new Demo();
        System.out.println(d.sayHi("ray"));
    }
}
