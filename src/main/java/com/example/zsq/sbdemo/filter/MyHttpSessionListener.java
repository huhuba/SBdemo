package com.example.zsq.sbdemo.filter;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener   implements HttpSessionListener {
public static  int online=0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("MyHttpSessionListener.sessionCreated.创建");
        online++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("MyHttpSessionListener.sessionDestroyed.销毁");
        online--;
    }
}
