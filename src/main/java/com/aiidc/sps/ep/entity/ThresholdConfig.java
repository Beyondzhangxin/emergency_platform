package com.aiidc.sps.ep.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

public class ThresholdConfig implements Serializable{

	private static final long serialVersionUID = 1351290222014969014L;

	//检测因子唯一编号
    private String id;

    //因子名称
    @NotNull(message="因子名称不能为空")
    @NotEmpty(message="因子名称不能为空")
    private String name;

    //标准值最小值
    @NotNull(message="一级报警值不能为空")
    private BigDecimal min;

    //标准值最大值
    @NotNull(message="二级报警值不能为空")
    private BigDecimal max;

    //数据单位
    @NotNull(message="数据单位不能为空")
    @NotEmpty(message="数据单位不能为空")
    private String unit;

    //备注说明
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

	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	@Override
	public String toString() {
		return "ThresholdConfig [id=" + id + ", name=" + name + ", min=" + min + ", max=" + max + ", unit=" + unit
				+ ", remark=" + remark + ", type=" + type + "]";
	}

}
