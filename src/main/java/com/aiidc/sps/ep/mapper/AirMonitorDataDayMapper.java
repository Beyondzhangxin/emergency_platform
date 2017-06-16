package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AirMonitorDataDay;

public interface AirMonitorDataDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(AirMonitorDataDay record);

    int insertSelective(AirMonitorDataDay record);

    AirMonitorDataDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AirMonitorDataDay record);

    int updateByPrimaryKey(AirMonitorDataDay record);
}