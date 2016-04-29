package com.epam.spring.core.loggers;

import java.io.File;

/**
 * Created by Maksym_Mazurkevych on 4/7/2016.
 */
public class FileEventLogger implements EventLogger {

    public FileEventLogger(File filename) {
        this.filename = filename;
    }

    File filename;

    public void logEvent(Event event) {
    }

}
