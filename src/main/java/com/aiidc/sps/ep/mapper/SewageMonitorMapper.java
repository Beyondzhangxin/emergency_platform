package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.SewageMonitor;

public interface SewageMonitorMapper {
    int deleteByPrimaryKey(String id);

    int insert(SewageMonitor record);

    int insertSelective(SewageMonitor record);

    SewageMonitor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SewageMonitor record);

    int updateByPrimaryKey(SewageMonitor record);
}