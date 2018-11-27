package com.founder.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("TimedTask")
public class Cron {

    private static final Logger logger = LoggerFactory.getLogger(Cron.class);

    @Autowired
    RecordContractInfoService rc;

    @Scheduled(cron = "0/5 * * * * ?")
    public void cron() {
        rc.sumNum();

    }
}
