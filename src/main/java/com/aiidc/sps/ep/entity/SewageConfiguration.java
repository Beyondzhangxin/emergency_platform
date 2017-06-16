package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;

public class SewageConfiguration {
    private String id;

    private String name;

    private Long entid;

    private BigDecimal lat;

    private BigDecimal lng;

    private String fkPdcode;

    private String fkPrcode;

    private String fkAbcode;

    private String fkWfcode;

    private String fbitdc;

    private String fkDccode;

    private String portno;

    private String portpos;

    private BigDecimal wryjlsyzxjl;

    private String remark;

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

    public Long getEntid() {
        return entid;
    }

    public void setEntid(Long entid) {
        this.entid = entid;
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

    public String getFkPdcode() {
        return fkPdcode;
    }

    public void setFkPdcode(String fkPdcode) {
        this.fkPdcode = fkPdcode;
    }

    public String getFkPrcode() {
        return fkPrcode;
    }

    public void setFkPrcode(String fkPrcode) {
        this.fkPrcode = fkPrcode;
    }

    public String getFkAbcode() {
        return fkAbcode;
    }

    public void setFkAbcode(String fkAbcode) {
        this.fkAbcode = fkAbcode;
    }

    public String getFkWfcode() {
        return fkWfcode;
    }

    public void setFkWfcode(String fkWfcode) {
        this.fkWfcode = fkWfcode;
    }

    public String getFbitdc() {
        return fbitdc;
    }

    public void setFbitdc(String fbitdc) {
        this.fbitdc = fbitdc;
    }

    public String getFkDccode() {
        return fkDccode;
    }

    public void setFkDccode(String fkDccode) {
        this.fkDccode = fkDccode;
    }

    public String getPortno() {
        return portno;
    }

    public void setPortno(String portno) {
        this.portno = portno;
    }

    public String getPortpos() {
        return portpos;
    }

    public void setPortpos(String portpos) {
        this.portpos = portpos;
    }

    public BigDecimal getWryjlsyzxjl() {
        return wryjlsyzxjl;
    }

    public void setWryjlsyzxjl(BigDecimal wryjlsyzxjl) {
        this.wryjlsyzxjl = wryjlsyzxjl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}