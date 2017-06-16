package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AirMonitorData {
    private String id;

    private String airid;

    private Date time;

    private BigDecimal factorid;

    private BigDecimal factornd;

    private BigDecimal factorpfl;

    private BigDecimal factorFlag;

    private BigDecimal auditstate;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirid() {
        return airid;
    }

    public void setAirid(String airid) {
        this.airid = airid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getFactorid() {
        return factorid;
    }

    public void setFactorid(BigDecimal factorid) {
        this.factorid = factorid;
    }

    public BigDecimal getFactornd() {
        return factornd;
    }

    public void setFactornd(BigDecimal factornd) {
        this.factornd = factornd;
    }

    public BigDecimal getFactorpfl() {
        return factorpfl;
    }

    public void setFactorpfl(BigDecimal factorpfl) {
        this.factorpfl = factorpfl;
    }

    public BigDecimal getFactorFlag() {
        return factorFlag;
    }

    public void setFactorFlag(BigDecimal factorFlag) {
        this.factorFlag = factorFlag;
    }

    public BigDecimal getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(BigDecimal auditstate) {
        this.auditstate = auditstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}