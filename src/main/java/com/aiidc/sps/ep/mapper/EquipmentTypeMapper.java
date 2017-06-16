package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.EquipmentType;

public interface EquipmentTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(EquipmentType record);

    int insertSelective(EquipmentType record);

    EquipmentType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EquipmentType record);

    int updateByPrimaryKey(EquipmentType record);
}