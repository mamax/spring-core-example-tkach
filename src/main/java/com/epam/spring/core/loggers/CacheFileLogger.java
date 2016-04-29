//package com.epam.spring;
//
//import java.io.File;
//import java.util.List;
//
///**
// * Created by Maksym_Mazurkevych on 4/7/2016.
// */
//public class CacheFileLogger extends FileEventLogger {
//
//    public CacheFileLogger(File filename) {
//        super(filename);
//    }
//
//    int cacheSize;
//
//    List<Event> cache;
//
//    public void logEvent(){
//        cache.add(event);
//
//        if(cache.size()==cacheSize){
//            writeEventsFromCache();
//            cache.clear();
//        }
//    }
//
//    private void writeEventsFromCache() {
//
//    }
//
//
//}
