package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RainwaterMonitorDataDay {
    private String id;

    private Date time;

    private String rainwaterid;

    private String factorid;

    private BigDecimal avgvalue;

    private BigDecimal minvalue;

    private BigDecimal mintime;

    private BigDecimal maxvalue;

    private BigDecimal maxtime;

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

    public BigDecimal getAvgvalue() {
        return avgvalue;
    }

    public void setAvgvalue(BigDecimal avgvalue) {
        this.avgvalue = avgvalue;
    }

    public BigDecimal getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(BigDecimal minvalue) {
        this.minvalue = minvalue;
    }

    public BigDecimal getMintime() {
        return mintime;
    }

    public void setMintime(BigDecimal mintime) {
        this.mintime = mintime;
    }

    public BigDecimal getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(BigDecimal maxvalue) {
        this.maxvalue = maxvalue;
    }

    public BigDecimal getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(BigDecimal maxtime) {
        this.maxtime = maxtime;
    }
}