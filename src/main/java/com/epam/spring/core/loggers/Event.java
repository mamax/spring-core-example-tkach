package com.epam.spring.core.loggers;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Maksym_Mazurkevych on 4/6/2016.
 */
public class Event {

    DateFormat df;
    Date date;
    int id;

    public Event(Date date) {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    String msg;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "df=" + df.format(date) +
                ", date=" + date +
                ", id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
