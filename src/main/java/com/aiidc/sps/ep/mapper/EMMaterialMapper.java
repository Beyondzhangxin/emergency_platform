package com.aiidc.sps.ep.mapper;


import java.util.List;

import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;

public interface EMMaterialMapper {
  

	EquipmentPostion selectByPrimaryKey(String id);
    
    List<EquipmentPostion> selectByParam(EquipmentPositionParam epp);
    
    int selectCount(EquipmentPositionParam epp);

  
    
    
}