package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.BoundMonitorDataDay;

public interface BoundMonitorDataDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoundMonitorDataDay record);

    int insertSelective(BoundMonitorDataDay record);

    BoundMonitorDataDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BoundMonitorDataDay record);

    int updateByPrimaryKey(BoundMonitorDataDay record);
}