package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.Subscriber;

public interface SubscriberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Subscriber record);

    int insertSelective(Subscriber record);

    Subscriber selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Subscriber record);

    int updateByPrimaryKey(Subscriber record);
}