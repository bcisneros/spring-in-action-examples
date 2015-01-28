package com.springinaction;

import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Stage;
import com.springinaction.springidol.Ticket;
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

        System.out.println("Getting the Stage instance from Singleton Pattern");
        Stage theStage = (Stage) context.getBean("theStage");
        Stage sameStage = (Stage) context.getBean("theStage");

        System.out.println("Both Stages are the same object? " + (theStage == sameStage));

        System.out.println("Getting Ticket objects");
        Ticket ticketOne = (Ticket) context.getBean("ticket");
        Ticket ticketTwo = (Ticket) context.getBean("ticket");

        System.out.println("Prototype scope get a new instace from tickets? " + (ticketOne != ticketTwo));

        performer = (Performer) context.getBean("kenny");
        performer.perform();

        performer = (Performer) context.getBean("kenny2");
        performer.perform();

        performer = (Performer) context.getBean("hank");
        performer.perform();

        performer = (Performer) context.getBean("hank2");
        performer.perform();

        performer = (Performer) context.getBean("hank3");
        performer.perform();

        performer = (Performer) context.getBean("kenny3");
        performer.perform();

        performer = (Performer) context.getBean("kenny4");
        performer.perform();
    }
}
