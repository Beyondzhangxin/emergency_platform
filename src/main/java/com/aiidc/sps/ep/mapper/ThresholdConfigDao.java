package com.aiidc.sps.ep.mapper;

import java.util.List;

import com.aiidc.sps.ep.entity.ThresholdConfig;
import com.aiidc.sps.ep.entity.ThresholdConfigForCheck;

public interface ThresholdConfigDao {
	public List<ThresholdConfig> findThresholdConfig(ThresholdConfigForCheck thresholdConfigForCheck);
	
	public int getTotal(ThresholdConfigForCheck thresholdConfigForCheck);
	
	public ThresholdConfig findThresholdById(ThresholdConfigForCheck thresholdConfigForCheck);
	
	public void save(ThresholdConfig thresholdConfig);
	
	public void update(ThresholdConfig thresholdConfig);
	
	public void delete(ThresholdConfig thresholdConfig);
	
}
