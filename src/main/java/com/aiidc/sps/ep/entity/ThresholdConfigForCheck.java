package com.aiidc.sps.ep.entity;

import java.io.Serializable;

public class ThresholdConfigForCheck implements Serializable{

	private static final long serialVersionUID = -6834244481905215324L;

	private Integer page;
	
	private Integer rows;
	
	//类别：厂界/周界1	污水排口2  雨水排口3  废气排口4
	private int type;
	
	private int start;
	
	private int end;
	
	private String name;
	
	//报警设置： 未设置1  已设置2
	private int reportSet;
	
	private String id;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReportSet() {
		return reportSet;
	}

	public void setReportSet(int reportSet) {
		this.reportSet = reportSet;
	}
	
	

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ThresholdConfigForCheck [page=" + page + ", rows=" + rows + ", type=" + type + ", start=" + start
				+ ", end=" + end + ", name=" + name + ", reportSet=" + reportSet + ", id=" + id + "]";
	}
	
}
