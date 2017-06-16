/*** 
*<p>Title: JsonToBeanMapper</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月14日
*/
package com.aiidc.sps.ep.mapper;

import java.util.HashMap;
import java.util.Map;


/**
 * @author joyu
 * @date 2017年6月14日
 */
public class JSONToBeanConfig {
	
	public static Map<String,String> getEquipmentPositionMapper()
	{
		Map<String, String > h = new HashMap<String, String>(){
			private static final long serialVersionUID = 1L;
		{
			put("id","id");
			put("name","name");
			put("type", "type");
			put("lat", "LAT");
			put("lng", "LNG");
		}};
		return h;
	}
	
}
