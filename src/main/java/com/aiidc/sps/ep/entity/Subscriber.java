package com.aiidc.sps.ep.entity;

import java.util.Date;

public class Subscriber {
    private Long id;

    private String subscriber;

    private Short infoType;

    private String email;

    private String mobilPhone;

    private Date changeTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public Short getInfoType() {
        return infoType;
    }

    public void setInfoType(Short infoType) {
        this.infoType = infoType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilPhone() {
        return mobilPhone;
    }

    public void setMobilPhone(String mobilPhone) {
        this.mobilPhone = mobilPhone;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}