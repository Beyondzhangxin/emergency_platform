package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.AlertInfo;

public interface AlertInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AlertInfo record);

    int insertSelective(AlertInfo record);

    AlertInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AlertInfo record);

    int updateByPrimaryKey(AlertInfo record);
}