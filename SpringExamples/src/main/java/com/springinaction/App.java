package com.springinaction;

import com.springinaction.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        System.out.println("A juggler instance");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();

        System.out.println("A poetic juggler instance");
        performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
    }
}
