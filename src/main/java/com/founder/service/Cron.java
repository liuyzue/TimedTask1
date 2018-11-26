package com.founder.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Cron {
    private static final Logger logger = LoggerFactory.getLogger(Cron.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void cron() {
        System.out.println("定时任务进行中.........");

    }
}
