package com.epam.spring;

import com.epam.spring.core.beans.Client;
import com.epam.spring.core.loggers.ConsoleEventLogger;
import com.epam.spring.core.loggers.Event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Maksym_Mazurkevych on 4/5/2016.
 */
public class App {

    Client client;
    ConsoleEventLogger eventLogger;
    Event event;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {

     ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        App app = context.getBean("app", App.class);
        app.eventLogger = new ConsoleEventLogger();
        app.logEvent("Some event for user 11");
        app.logEvent("Some event for user 22");
        app.logEvent("Some event for user 1");
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }

}
