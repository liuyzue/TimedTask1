package com.founder.model;

/**
 * CONTRACT_TEAM_INFO
 *
 * @author F
 */
public class ContractTeamInfo {
    // 主键
    private int rid;
    // 团队名称
    private String team_name;
    // 团队人数
    private int peopleNum;
    // 团队排名
    private int teamNo;
    private String createDate;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
