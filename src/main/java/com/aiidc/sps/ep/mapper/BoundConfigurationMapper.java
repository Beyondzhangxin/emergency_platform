package com.aiidc.sps.ep.mapper;


import java.util.List;

import com.aiidc.sps.ep.entity.BoundConfiguration;
import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;

public interface BoundConfigurationMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoundConfiguration record);

    int insertSelective(BoundConfiguration record);

    BoundConfiguration selectByPrimaryKey(String id);
    
    List<EquipmentPostion> selectByParam(EquipmentPositionParam epp);
    
    int selectCount(EquipmentPositionParam epp);

    int updateByPrimaryKeySelective(BoundConfiguration record);

    int updateByPrimaryKey(BoundConfiguration record);
    
    
}