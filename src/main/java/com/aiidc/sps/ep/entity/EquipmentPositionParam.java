/*** 
*<p>Title: EquipmentPositionParam</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月15日
*/
package com.aiidc.sps.ep.entity;

/**
 * @author joyu
 * @date 2017年6月15日
 */
public class EquipmentPositionParam {
	
	private Integer type;
	private Integer start;
	private Integer end;
	private String name;
	private Integer page;
	private Integer rows;
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
	 * @return the page
	 */
	public Integer getStart() {
		return this.start;
	}
	/**
	 * @param page the page to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}
	/**
	 * @return the rows
	 */
	public Integer getEnd() {
		return this.end;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setEnd(Integer end) {
		this.end = end;
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

}
