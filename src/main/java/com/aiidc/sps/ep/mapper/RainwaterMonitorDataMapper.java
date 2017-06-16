package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.RainwaterMonitorData;

public interface RainwaterMonitorDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(RainwaterMonitorData record);

    int insertSelective(RainwaterMonitorData record);

    RainwaterMonitorData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RainwaterMonitorData record);

    int updateByPrimaryKey(RainwaterMonitorData record);
}