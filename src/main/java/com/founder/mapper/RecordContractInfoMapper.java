package com.founder.mapper;

import com.founder.model.RecordContractInfo;

import java.util.List;


/**
 * RecordContractInfoMapper，映射SQL语句的接口，无逻辑实现
 */
public interface RecordContractInfoMapper {

    List<RecordContractInfo> findAll();

    int findRecordNum();

    int findContract();

    void updateCord(RecordContractInfo cord);
}