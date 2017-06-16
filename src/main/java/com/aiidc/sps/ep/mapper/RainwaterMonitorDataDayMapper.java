package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.RainwaterMonitorDataDay;

public interface RainwaterMonitorDataDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(RainwaterMonitorDataDay record);

    int insertSelective(RainwaterMonitorDataDay record);

    RainwaterMonitorDataDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RainwaterMonitorDataDay record);

    int updateByPrimaryKey(RainwaterMonitorDataDay record);
}