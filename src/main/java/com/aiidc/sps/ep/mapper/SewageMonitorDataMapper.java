package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.SewageMonitorData;

public interface SewageMonitorDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(SewageMonitorData record);

    int insertSelective(SewageMonitorData record);

    SewageMonitorData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SewageMonitorData record);

    int updateByPrimaryKey(SewageMonitorData record);
}