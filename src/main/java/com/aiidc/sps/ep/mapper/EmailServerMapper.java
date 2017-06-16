package com.aiidc.sps.ep.mapper;

import com.aiidc.sps.ep.entity.EmailServer;

public interface EmailServerMapper {
    public long insert(EmailServer record);
    
    public long getIdForEmailServer();
}