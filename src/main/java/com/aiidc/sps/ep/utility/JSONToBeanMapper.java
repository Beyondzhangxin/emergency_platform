/*** 
*<p>Title: JsonToBeanMapper</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月14日
*/
package com.aiidc.sps.ep.utility;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 实际开发过程中jons数据中的字段和java bean属性之间往往对应不上，
 * 为了解决这个问题，特实现这个映射类：

 * @author  joyu
 * @date  2017年6月14日
 */
public class JSONToBeanMapper {
	
	/**
	 * <p>Description: 通过java 反射机制 和Map中存储的json中的属性和java bean 中的属性之间的映射关系
     * 来完成jons数据和java bean 对象 之间的数据 </p>
	 * @author joyu
	 * @param o ： java bean
	 * @param obj ：json 对象
	 * @param mapper  ：java bean 属性 和json对象属性直接的映射关系表
	 * @return
	 */
	public static  Object parseJsonToObject(Object o, JSONObject obj,Map<String,String>mapper) {
		if(o==null || obj==null || mapper==null) return null;
	    try {
	        List<Field> fieldList = new ArrayList<Field>();
	        fieldList.addAll(Arrays.asList(o.getClass().getDeclaredFields()));
	        for (Field field : fieldList) {
	            String name = field.getName();
	            String _name = mapper.get(name);
	            if(_name==null) continue;
	            Object value = obj.get(_name);
	            //if (value != null && !(value instanceof JSONNull)) {
	            if (value != null ) {
	                //使其可以对私有属性复制
	                field.setAccessible(true);
	                if (name.equalsIgnoreCase("Option")) {
	                    JSONArray jArr = (JSONArray) value;
	                    field.set(o, jArr.toString());
	                } else {
	                    String type = field.getType().toString();
	                    if (type.indexOf("Integer") >= 0) {
	                        field.set(o, Integer.valueOf(value.toString()));
	                    } else if (type.indexOf("String") >= 0) {
	                        field.set(o, (String) value);
	                    }else if (type.indexOf("BigDecimal")>=0) {
	                    	BigDecimal bd=new BigDecimal(value.toString());
	                    	//设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入) 
	                    	bd=bd.setScale(6, BigDecimal.ROUND_UNNECESSARY);
	                    	 field.set(o, bd);
	                    }else if (type.indexOf("Date") >= 0) {
	                    	Date date = DateUtil.getDateByString(value.toString(),DateUtil.PATTERN_DEFAULT);
	                        //JSONObject dataObj = (JSONObject) value;
	                        field.set(o, date);
	                    }
	                }
	            }
	        }
	    } catch (SecurityException e) {
	        e.printStackTrace();
	    } catch (IllegalArgumentException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (ParseException e) {
			e.printStackTrace();
		}
	    return o;
	}
}