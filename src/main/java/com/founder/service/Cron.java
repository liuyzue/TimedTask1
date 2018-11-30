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
    RecordContractInfoService recordContractInfoService;
    @Autowired
    RecordContractNumAllInfoService recordContractNumAllInfoService;
    @Autowired
    ContractTeamInfoService contractTeamInfoService;

    @Scheduled(cron = "0 0/30 * * * ?")
    public void cron() {
        recordContractInfoService.sumNum();
        recordContractNumAllInfoService.updateRecordContractNumAllInfo();
        contractTeamInfoService.updateContractTeamInfo();
    }
}
