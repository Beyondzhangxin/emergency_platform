package com.aiidc.sps.ep.mapper;

import java.util.List;

import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;
import com.aiidc.sps.ep.entity.SewageConfiguration;

public interface SewageConfigurationMapper {
    int deleteByPrimaryKey(String id);

    int insert(SewageConfiguration record);

    int insertSelective(SewageConfiguration record);

    SewageConfiguration selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SewageConfiguration record);

    int updateByPrimaryKey(SewageConfiguration record);

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	List<EquipmentPostion> selectByParam(EquipmentPositionParam epp);

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	int selectCount(EquipmentPositionParam epp);
}