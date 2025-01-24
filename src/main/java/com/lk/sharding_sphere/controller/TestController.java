package com.lk.sharding_sphere.controller;

import com.lk.sharding_sphere.entity.KpiInfo;
import com.lk.sharding_sphere.mapper.KpiInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * 功能描述:  权限测试
 *
 * @date: 2019/1/7 21:19
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private KpiInfoMapper kpiInfoMapper;

    @GetMapping("/insert")
    public void insertKpiInfo() {
        List<KpiInfo> kpiInfos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            KpiInfo kpiInfo = new KpiInfo();
            kpiInfo.setTaskId(i);
            kpiInfo.setNeId(new Random().nextInt(100));
            kpiInfo.setMuId("1000");
            kpiInfo.setMcId("10001");
            kpiInfo.setPeriod(5);
            kpiInfo.setTime("1111");
            kpiInfo.setValue("100");
            kpiInfos.add(kpiInfo);
            // kpiInfoMapper.insertKpiInfo(kpiInfo);
        }
        kpiInfoMapper.insertKpiInfos(kpiInfos);
    }
}
