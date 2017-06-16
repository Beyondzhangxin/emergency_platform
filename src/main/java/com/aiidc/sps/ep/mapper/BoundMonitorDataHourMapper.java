package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.BoundMonitorDataHour;

public interface BoundMonitorDataHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoundMonitorDataHour record);

    int insertSelective(BoundMonitorDataHour record);

    BoundMonitorDataHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BoundMonitorDataHour record);

    int updateByPrimaryKey(BoundMonitorDataHour record);
}