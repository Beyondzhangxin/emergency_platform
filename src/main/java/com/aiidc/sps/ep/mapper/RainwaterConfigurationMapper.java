package com.aiidc.sps.ep.mapper;

import java.util.List;

import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;
import com.aiidc.sps.ep.entity.RainwaterConfiguration;

public interface RainwaterConfigurationMapper {
    int deleteByPrimaryKey(String id);

    int insert(RainwaterConfiguration record);

    int insertSelective(RainwaterConfiguration record);

    RainwaterConfiguration selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RainwaterConfiguration record);

    int updateByPrimaryKey(RainwaterConfiguration record);

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	List<EquipmentPostion> selectByParam(EquipmentPositionParam epp);
	
	 int selectCount(EquipmentPositionParam epp);
}