package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AirMonitorData;

public interface AirMonitorDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(AirMonitorData record);

    int insertSelective(AirMonitorData record);

    AirMonitorData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AirMonitorData record);

    int updateByPrimaryKey(AirMonitorData record);
}