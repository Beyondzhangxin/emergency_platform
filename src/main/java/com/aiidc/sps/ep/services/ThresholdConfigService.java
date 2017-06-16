package com.aiidc.sps.ep.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiidc.sps.ep.entity.ThresholdConfig;
import com.aiidc.sps.ep.entity.ThresholdConfigForCheck;
import com.aiidc.sps.ep.mapper.ThresholdConfigDao;

@Service
public class ThresholdConfigService {
	
	@Autowired
	private ThresholdConfigDao thresholdDao;
	
	public List<ThresholdConfig> findThresholdConfig(ThresholdConfigForCheck thresholdConfigForCheck)
	{
		thresholdConfigForCheck.setStart((thresholdConfigForCheck.getPage()-1)*thresholdConfigForCheck.getRows()+1);
		thresholdConfigForCheck.setEnd(thresholdConfigForCheck.getPage()*thresholdConfigForCheck.getRows());
		return thresholdDao.findThresholdConfig(thresholdConfigForCheck);
	}
	
	public int getTotal(ThresholdConfigForCheck thresholdConfigForCheck){
		return thresholdDao.getTotal(thresholdConfigForCheck);
	}
	
	public ThresholdConfig findThresholdById(ThresholdConfigForCheck thresholdConfigForCheck){
		return thresholdDao.findThresholdById(thresholdConfigForCheck);
	}
	
	public String saveOrUpdate(ThresholdConfig thresholdConfig){
		String id =thresholdConfig.getId();
		if(null ==id  || id.isEmpty()){
			id=UUID.randomUUID().toString();
			thresholdConfig.setId(id);
			thresholdDao.save(thresholdConfig);
		}else{
			thresholdDao.update(thresholdConfig);
		}
		return id;
	}
	
	public void delete(ThresholdConfig thresholdConfig){
		thresholdDao.delete(thresholdConfig);
	}
}
