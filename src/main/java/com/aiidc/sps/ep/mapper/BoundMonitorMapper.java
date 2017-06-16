package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.BoundMonitor;

public interface BoundMonitorMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoundMonitor record);

    int insertSelective(BoundMonitor record);

    BoundMonitor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BoundMonitor record);

    int updateByPrimaryKey(BoundMonitor record);
}