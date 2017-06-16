package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RainwaterMonitorData {
    private String id;

    private String rainwaterid;

    private String factorid;

    private Date time;

    private BigDecimal factorvalue;

    private String factorFlag;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRainwaterid() {
        return rainwaterid;
    }

    public void setRainwaterid(String rainwaterid) {
        this.rainwaterid = rainwaterid;
    }

    public String getFactorid() {
        return factorid;
    }

    public void setFactorid(String factorid) {
        this.factorid = factorid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getFactorvalue() {
        return factorvalue;
    }

    public void setFactorvalue(BigDecimal factorvalue) {
        this.factorvalue = factorvalue;
    }

    public String getFactorFlag() {
        return factorFlag;
    }

    public void setFactorFlag(String factorFlag) {
        this.factorFlag = factorFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}