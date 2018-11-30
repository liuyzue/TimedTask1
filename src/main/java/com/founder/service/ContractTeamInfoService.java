package com.founder.service;

import com.founder.mapper.ContractTeamInfoMapper;
import com.founder.model.ContractTeamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class ContractTeamInfoService {
    private static final HashMap<String,String> ORGAN=new HashMap<String,String>(){{
        put("420805323","回龙山中心卫生院");
        put("420805374","贾庙乡卫生院");
        put("420808380","杜皮乡卫生院");
        put("420805307","淋山河中心卫生院");
        put("420850298","上巴河中心卫生院");
        put("420805403","王家坊移民乡卫生院");
        put("673669710","团风镇卫生院");
        put("420805331","方高坪镇卫生院");
        put("42080534X","总路咀中心卫生院");
        put("420805366","溢流河卫生院");
        put("420805358","但店中心卫生院");
        put("420805315","马曹庙镇卫生院");
        put("557020375","团风社区卫生服务中心");
    }};

    @Autowired
    ContractTeamInfoMapper contractTeamInfoMapper;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");


    void updateContractTeamInfo(){
        List<ContractTeamInfo> signTeamVo =contractTeamInfoMapper.findByCode();

        for (ContractTeamInfo svo :signTeamVo) {
            svo.setTeam_name(ORGAN.get(svo.getTeam_name()));
            svo.setTeamNo(signTeamVo.indexOf(svo)+1);
            svo.setCreateDate(sdf.format(new Date()));
        }

        for (ContractTeamInfo vo:signTeamVo){
            contractTeamInfoMapper.updateRecord(vo);
            System.out.println(vo.getTeamNo()+" is success!");
        }


    }
}
