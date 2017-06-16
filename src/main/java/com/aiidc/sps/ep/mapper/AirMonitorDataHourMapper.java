package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AirMonitorDataHour;

public interface AirMonitorDataHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(AirMonitorDataHour record);

    int insertSelective(AirMonitorDataHour record);

    AirMonitorDataHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AirMonitorDataHour record);

    int updateByPrimaryKey(AirMonitorDataHour record);
}