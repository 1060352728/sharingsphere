package com.lk.sharding_sphere.mapper;

import com.lk.sharding_sphere.entity.KpiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KpiInfoMapper {
    void insertKpiInfo(KpiInfo kpiInfo);

    void insertKpiInfos(@Param("kpiInfos") List<KpiInfo> kpiInfos);
}
