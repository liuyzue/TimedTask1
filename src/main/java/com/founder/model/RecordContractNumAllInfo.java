package com.founder.model;

/**
 * RECORD_CONTRACT_NUM_ALL_INFO
 *
 * @author F
 */
public class RecordContractNumAllInfo {
    // 主键
    private int rid;
    // 总随访人数
    private int followUp;
    // 总建档人数
    private int recordNum;
    // 总签约人数
    private int contract;
    // 总随访人次
    private int followUpSecond;

    private String createDate;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getFollowUp() {
        return followUp;
    }

    public void setFollowUp(int followUp) {
        this.followUp = followUp;
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

    public int getFollowUpSecond() {
        return followUpSecond;
    }

    public void setFollowUpSecond(int followUpSecond) {
        this.followUpSecond = followUpSecond;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
