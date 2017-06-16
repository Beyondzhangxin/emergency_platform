package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;

public class AirConfiguration {
    private String id;

    private String name;

    private Long entid;

    private BigDecimal lat;

    private BigDecimal lng;

    private String sname;

    private String fkPrcode;

    private String fkFccode;

    private String fkBwcode;

    private String fkAfcode;

    private String portno;

    private String portpos;

    private BigDecimal porth;

    private BigDecimal pirad;

    private Long fintistc;

    private String porttype;

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

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getFkPrcode() {
        return fkPrcode;
    }

    public void setFkPrcode(String fkPrcode) {
        this.fkPrcode = fkPrcode;
    }

    public String getFkFccode() {
        return fkFccode;
    }

    public void setFkFccode(String fkFccode) {
        this.fkFccode = fkFccode;
    }

    public String getFkBwcode() {
        return fkBwcode;
    }

    public void setFkBwcode(String fkBwcode) {
        this.fkBwcode = fkBwcode;
    }

    public String getFkAfcode() {
        return fkAfcode;
    }

    public void setFkAfcode(String fkAfcode) {
        this.fkAfcode = fkAfcode;
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

    public BigDecimal getPorth() {
        return porth;
    }

    public void setPorth(BigDecimal porth) {
        this.porth = porth;
    }

    public BigDecimal getPirad() {
        return pirad;
    }

    public void setPirad(BigDecimal pirad) {
        this.pirad = pirad;
    }

    public Long getFintistc() {
        return fintistc;
    }

    public void setFintistc(Long fintistc) {
        this.fintistc = fintistc;
    }

    public String getPorttype() {
        return porttype;
    }

    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }
}