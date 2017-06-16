package com.aiidc.sps.ep.mapper;

import java.util.List;

import com.aiidc.sps.ep.entity.AirConfiguration;
import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;

public interface AirConfigurationMapper {
    int deleteByPrimaryKey(String id);

    int insert(AirConfiguration record);

    int insertSelective(AirConfiguration record);

    AirConfiguration selectByPrimaryKey(String id);
    
    List<EquipmentPostion> selectByParam(EquipmentPositionParam epp);
    
    int selectCount(EquipmentPositionParam epp);

    int updateByPrimaryKeySelective(AirConfiguration record);

    int updateByPrimaryKey(AirConfiguration record);
}