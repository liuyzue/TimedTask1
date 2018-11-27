package com.founder.service;

import com.founder.mapper.RecordContractInfoMapper;
import com.founder.model.RecordContractInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("RecordContractInfo")
public class RecordContractInfoService{

    @Autowired
    private RecordContractInfoMapper rc;

    private SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void sumNum(){
        int RecordNum=rc.findRecordNum();
        int Contract=rc.findContract();
        RecordContractInfo rci = new RecordContractInfo(RecordNum,Contract);
        rci.setCreateDate(sd.format(new Date()));
        System.out.println("总建档人数为："+rci.getRecordNum()+",总签约人数："+rci.getContract()+"当前时间为："+rci.getCreateDate());
        rc.updateCord(rci);
    }
}
