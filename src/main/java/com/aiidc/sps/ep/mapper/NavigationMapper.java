package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.Navigation;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface NavigationMapper{
		
	public List<Navigation> getRootNavigationList();
	public List<Navigation> getNavigationListByParent(int pid);
}
