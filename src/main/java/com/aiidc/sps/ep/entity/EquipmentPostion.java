/*** 
*<p>Title: EquipmentPostion</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月12日
*/
package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;

/**
 * @author joyu
 * @date 2017年6月12日
 */
public class EquipmentPostion {
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EquipmentPostion [id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", lat=" + this.lat
				+ ", lng=" + this.lng + "]";
	}

	private String id;    //设备id

    private String name;   //设备名称

    private Integer type;   //设备类型
    
	private BigDecimal lat;  //纬度

    private BigDecimal lng; //经度
    private Integer positonOrder;  //前端需要的图层顺序
    private Integer ENTID;    // 企业编号
    /**
	 * @return the positonOrder
	 */
	public Integer getPositonOrder() {
		return this.positonOrder;
	}

	/**
	 * @param positonOrder the positonOrder to set
	 */
	public void setPositonOrder(Integer positonOrder) {
		this.positonOrder = positonOrder;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the lat
	 */
	public BigDecimal getLat() {
		return this.lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	/**
	 * @return the lng
	 */
	public BigDecimal getLng() {
		return this.lng;
	}

	/**
	 * @param lng the lng to set
	 */
	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public Integer getENTID() {
		return ENTID;
	}

	public void setENTID(Integer eNTID) {
		this.ENTID = eNTID;
	}


}
