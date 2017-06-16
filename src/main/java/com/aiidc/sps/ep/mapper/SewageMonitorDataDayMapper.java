package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.SewageMonitorDataDay;

public interface SewageMonitorDataDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(SewageMonitorDataDay record);

    int insertSelective(SewageMonitorDataDay record);

    SewageMonitorDataDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SewageMonitorDataDay record);

    int updateByPrimaryKey(SewageMonitorDataDay record);
}