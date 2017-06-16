package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.RainwaterMonitorDataHour;

public interface RainwaterMonitorDataHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(RainwaterMonitorDataHour record);

    int insertSelective(RainwaterMonitorDataHour record);

    RainwaterMonitorDataHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RainwaterMonitorDataHour record);

    int updateByPrimaryKey(RainwaterMonitorDataHour record);
}