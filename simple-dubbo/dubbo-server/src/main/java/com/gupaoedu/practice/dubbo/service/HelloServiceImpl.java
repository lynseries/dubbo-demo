package com.gupaoedu.practice.dubbo.service;

/**
 * Created by liuyanan on 2018-07-07.
 */
public class HelloServiceImpl implements IHelloService{
    @Override
    public String sayHello(String msg) {
        return "Hello,"+msg;
    }
}
