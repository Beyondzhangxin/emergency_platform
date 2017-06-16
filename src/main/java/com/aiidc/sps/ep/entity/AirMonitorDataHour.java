package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AirMonitorDataHour {
    private String id;

    private Date time;

    private String factorid;

    private String airid;

    private BigDecimal ndavgvalue;

    private BigDecimal ndminvalue;

    private Date ndmintime;

    private BigDecimal ndmaxvalue;

    private Date ndmaxtime;

    private BigDecimal pflavgvalue;

    private BigDecimal pflminvalue;

    private Date pflmintime;

    private BigDecimal pflmaxvalue;

    private Date pflmaxtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFactorid() {
        return factorid;
    }

    public void setFactorid(String factorid) {
        this.factorid = factorid;
    }

    public String getAirid() {
        return airid;
    }

    public void setAirid(String airid) {
        this.airid = airid;
    }

    public BigDecimal getNdavgvalue() {
        return ndavgvalue;
    }

    public void setNdavgvalue(BigDecimal ndavgvalue) {
        this.ndavgvalue = ndavgvalue;
    }

    public BigDecimal getNdminvalue() {
        return ndminvalue;
    }

    public void setNdminvalue(BigDecimal ndminvalue) {
        this.ndminvalue = ndminvalue;
    }

    public Date getNdmintime() {
        return ndmintime;
    }

    public void setNdmintime(Date ndmintime) {
        this.ndmintime = ndmintime;
    }

    public BigDecimal getNdmaxvalue() {
        return ndmaxvalue;
    }

    public void setNdmaxvalue(BigDecimal ndmaxvalue) {
        this.ndmaxvalue = ndmaxvalue;
    }

    public Date getNdmaxtime() {
        return ndmaxtime;
    }

    public void setNdmaxtime(Date ndmaxtime) {
        this.ndmaxtime = ndmaxtime;
    }

    public BigDecimal getPflavgvalue() {
        return pflavgvalue;
    }

    public void setPflavgvalue(BigDecimal pflavgvalue) {
        this.pflavgvalue = pflavgvalue;
    }

    public BigDecimal getPflminvalue() {
        return pflminvalue;
    }

    public void setPflminvalue(BigDecimal pflminvalue) {
        this.pflminvalue = pflminvalue;
    }

    public Date getPflmintime() {
        return pflmintime;
    }

    public void setPflmintime(Date pflmintime) {
        this.pflmintime = pflmintime;
    }

    public BigDecimal getPflmaxvalue() {
        return pflmaxvalue;
    }

    public void setPflmaxvalue(BigDecimal pflmaxvalue) {
        this.pflmaxvalue = pflmaxvalue;
    }

    public Date getPflmaxtime() {
        return pflmaxtime;
    }

    public void setPflmaxtime(Date pflmaxtime) {
        this.pflmaxtime = pflmaxtime;
    }
}