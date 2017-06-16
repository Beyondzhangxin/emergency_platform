package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.BoundMonitorData;

public interface BoundMonitorDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoundMonitorData record);

    int insertSelective(BoundMonitorData record);

    BoundMonitorData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BoundMonitorData record);

    int updateByPrimaryKey(BoundMonitorData record);
}