package com.founder.mapper;

import com.founder.model.RecordContractBypeopleInfo;

import java.util.List;


/**
 * RecordContractBypeopleInfoMapper，映射SQL语句的接口，无逻辑实现
 */
public interface RecordContractBypeopleInfoMapper {

    List<RecordContractBypeopleInfo> findAll();

    String findPtype();

    String findPtypeno();

    String findjdPnumbersPTRQ();

    String findjdPnumbersGXY();

    String findjdPnumbersTNB();

    String findjdPnumbersLNR();

    String findjdPnumbersET();

    String findjdPnumbersYCF();

    String findjdPnumbersJSB();

    String findjdPnumbersJHB();

    String findjdPnumbersPKRK();

    String findjdPnumbersJSTK();

    String findjdPnumbersCJR();

    String findcyPnumbersPTRQ();

    String findcyPnumbersGXY();

    String findcyPnumbersTNB();

    String findcyPnumbersLNR();

    String findcyPnumbersET();

    String findcyPnumbersYCF();

    String findcyPnumbersJSB();

    String findcyPnumbersJHB();

    String findcyPnumbersPKRK();

    String findcyPnumbersJSTK();

    String findcyPnumbersCJR();

    String findFlag();

    String findCreateDate();

    void updateCard(RecordContractBypeopleInfo recordContractBypeopleInfo);

}