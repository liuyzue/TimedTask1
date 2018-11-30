package com.founder.model;

/**
 * RECORD_CONTRACT_BYPEOPLE_INFO
 *
 * @author F
 */
public class RecordContractByPeopleInfo {
    // 主键
    private int rid;
    // 人群类型
    private String ptype;
    // 人群类型编码
    private int ptypecode;
    // 数量，根据flag的不同为签约\建档数量
    private int pnumbers;
    // 1为建档，2为签约
    private int flag;
    private String createDate;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public int getPtypecode() {
        return ptypecode;
    }

    public void setPtypecode(int ptypecode) {
        this.ptypecode = ptypecode;
    }

    public int getPnumbers() {
        return pnumbers;
    }

    public void setPnumbers(int pnumbers) {
        this.pnumbers = pnumbers;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
