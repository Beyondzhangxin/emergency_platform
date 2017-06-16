package com.aiidc.sps.ep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiidc.sps.ep.entity.EmailServer;
import com.aiidc.sps.ep.mapper.EmailServerMapper;

@Service
public class RwEmailServerService {
	
	@Autowired
	private EmailServerMapper emailServerMapper;
	
	public void save(EmailServer emailServer){
		emailServerMapper.insert(emailServer);
	}
	
	public long getId(){
		return emailServerMapper.getIdForEmailServer();
	}
}
