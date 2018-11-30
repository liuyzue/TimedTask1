package com.founder.service;

import com.founder.mapper.RecordContractNumAllInfoMapper;
import com.founder.model.RecordContractNumAllInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("RecordContractNumAllInfo")
public class RecordContractNumAllInfoService {

    @Autowired
    RecordContractNumAllInfoMapper rcm;

    SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm");

    public void updateRecordContractNumAllInfo(){

        int followUp=rcm.findFollowUpNum();
        int recordNum=rcm.findRecordNum();
        int contract=rcm.findContractNum();
        String create=sd.format(new Date());
        int followUpSecond=rcm.findFollowUpSecondDI()+rcm.findFollowUpSecondHYPE();

        RecordContractNumAllInfo rc=new RecordContractNumAllInfo(followUp,recordNum,contract,followUpSecond);
        rc.setCreateDate(create);
        System.out.println("总随访人数为："+rc.getFollowUp()+",总建档人数："+rc.getRecordNum()+"，总签约人数："+rc.getContract()+",总随访人次"+rc.getFollowUpSecond()
        +",时间："+rc.getCreateDate());

        rcm.updateRecord(rc);

    }

}
