package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;

public class BoundConfiguration {
	//检测因子唯一编号
    private String id;

    //因子名称
    private String name;

    //标准值最小值
    private BigDecimal lat;

    //标准值最大值
    private BigDecimal lng;

    //备注描述
    private String remark;
    
    //类别：厂界/周界1	污水排口2  雨水排口3  废气排口4
    private int type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

   
}