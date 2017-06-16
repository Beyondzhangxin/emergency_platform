package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.SewageMonitorDataHour;

public interface SewageMonitorDataHourMapper {
    int deleteByPrimaryKey(String id);

    int insert(SewageMonitorDataHour record);

    int insertSelective(SewageMonitorDataHour record);

    SewageMonitorDataHour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SewageMonitorDataHour record);

    int updateByPrimaryKey(SewageMonitorDataHour record);
}