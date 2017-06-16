package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.RainwaterMonitor;

public interface RainwaterMonitorMapper {
    int deleteByPrimaryKey(String id);

    int insert(RainwaterMonitor record);

    int insertSelective(RainwaterMonitor record);

    RainwaterMonitor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RainwaterMonitor record);

    int updateByPrimaryKey(RainwaterMonitor record);
}