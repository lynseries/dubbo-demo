package com.gupaoedu.practice.dubbo;

import com.alibaba.dubbo.container.Main;
import com.gupaoedu.practice.dubbo.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Main.main(args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-client.xml"});
        IHelloService service = (IHelloService) context.getBean("gpHelloService");
        System.out.println(service.sayHello("liu mu mu"));
    }
}
