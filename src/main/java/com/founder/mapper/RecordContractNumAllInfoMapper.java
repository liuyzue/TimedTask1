package com.founder.mapper;

import com.founder.model.RecordContractNumAllInfo;

import java.util.List;


/**
 * RecordContractNumAllInfoMapper，映射SQL语句的接口，无逻辑实现
 */
public interface RecordContractNumAllInfoMapper {

    List<RecordContractNumAllInfo> findAll();

    int findFollowUpNum();

    int findRecordNum();

    int findContractNum();

    int findFollowUpSecondDI();

    int findFollowUpSecondHYPE();

    void updateRecord(RecordContractNumAllInfo ra);


}