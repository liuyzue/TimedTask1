package com.founder.mapper;

import com.founder.model.ContractTeamInfo;

import java.util.List;


/**
 * ContractTeamInfoMapper，映射SQL语句的接口，无逻辑实现
 */
public interface ContractTeamInfoMapper {

    List<ContractTeamInfo> findAll();


}