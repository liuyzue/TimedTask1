package com.founder.model;

import java.util.Date;

/**
 * 数据表RECORD_CONTRACT_INFO
 *
 * @author F
 */
public class RecordContractInfo {
    // 主键
    private int rid;
    // 已建档人数
    private int recordNum;
    // 已签约人数
    private int contract;
    // 未建档人数
    private int recordNot;
    // 未签约人数
    private int contractNot;
    // 数据创建时间
    private String createDate;

    public RecordContractInfo(){

    }

    public RecordContractInfo(int recordNum, int contract){
        this.contract=contract;
        this.recordNum=recordNum;
        this.recordNot=360000-recordNum;
        this.contractNot=360000-contract;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(int recordNum) {
        this.recordNum = recordNum;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public int getRecordNot() {
        return recordNot;
    }

    public void setRecordNot(int recordNot) {
        this.recordNot = recordNot;
    }

    public int getContractNot() {
        return contractNot;
    }

    public void setContractNot(int contractNot) {
        this.contractNot = contractNot;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
