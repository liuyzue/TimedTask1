package com.founder.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


public class mainTest {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("Spring-mybatis.xml");
        Cron sh= (Cron) context.getBean("TimedTask");

        sh.cron();*/
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(sd.format(new Date()).getClass().toString());
    }
}
