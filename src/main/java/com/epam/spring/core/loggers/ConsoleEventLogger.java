package com.epam.spring.core.loggers;

/**
 * Created by Maksym_Mazurkevych on 4/5/2016.
 */
public class ConsoleEventLogger implements EventLogger{

    public void logEvent(Event event) {
         event.toString();
        System.out.println("Event is done");
    }
}
