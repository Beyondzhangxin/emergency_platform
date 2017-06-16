package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.InfoType;

public interface InfoTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(InfoType record);

    int insertSelective(InfoType record);

    InfoType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InfoType record);

    int updateByPrimaryKey(InfoType record);
}