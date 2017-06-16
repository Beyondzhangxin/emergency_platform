package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AirMonitor;

public interface AirMonitorMapper {
    int deleteByPrimaryKey(String id);

    int insert(AirMonitor record);

    int insertSelective(AirMonitor record);

    AirMonitor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AirMonitor record);

    int updateByPrimaryKey(AirMonitor record);
}