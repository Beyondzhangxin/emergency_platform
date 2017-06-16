/*** 
*<p>Title: EquipmentOpsition</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月12日
*/
package com.aiidc.sps.ep.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.base.ActionInfo;
import com.aiidc.base.ControllerInfo;
import com.aiidc.base.ControllerUtils;
import com.aiidc.base.util.BeanUtils;
import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;
import com.aiidc.sps.ep.services.EquipmentPositionService;

/**
 * @author joyu
 * @date 2017年6月12日
 */

@Controller
@RequestMapping("equipmentPosition")
@ControllerInfo(order = 10, value = "设备位置信息")
public class EquipmentPositionController {

	@Autowired
	private EquipmentPositionService equipmentPositionService;

	/**
	 * 
	 * <p>
	 * Description: 获取周界、厂界的位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @param type
	 *            前端传递过来的参数，1：厂界，2：周界
	 * @return json string
	 */
	@RequestMapping(value = "boundPosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String boundPosition(EquipmentPositionParam epp) throws Exception {

		
/*		  epp=new EquipmentPositionParam();
		  //epp.setName(""); 
		  epp.setPage(1);
		 epp.setRows(5);*/
		 
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray ja = BeanUtils.describeToJson(equipmentPositionService.getBoundPosition(epp));
		int count = equipmentPositionService.getBoundCount(epp);
		jo.put("total", count).put("rows", ja);
		return jo.toString();

	}

	/**
	 * 
	 * <p>
	 * Description: 获取废气设备位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping(value = "airPosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String airPosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getAirPosition(epp));
		int count = equipmentPositionService.getAirCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 获取雨水排口监测设备位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping(value = "rainwaterPosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String rainwaterPosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getRainwaterPosition(epp));
		int count = equipmentPositionService.getRainwaterCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 获取污水排口监测设备位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping(value = "sewagePosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String sewagePosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getSewagePosition(epp));
		int count = equipmentPositionService.getSewageCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 获取物资装备的位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @param type
	 *            前端提交的参数 1:物资，2：装备
	 * @return json string
	 */
	@RequestMapping(value = "materialPosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String materialPosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getMaterialPosition(epp));
		int count = equipmentPositionService.getMaterialCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 获取危险源监测设备位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping("hazardPosition")
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String hazardPosition(EquipmentPositionParam epp) throws Exception {

		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getSewagePosition(epp));
		int count = equipmentPositionService.getSewageCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 获取环保企业位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping("EPENTPosition")
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String EPENTPosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getSewagePosition(epp));
		int count = equipmentPositionService.getSewageCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

	/**
	 * 
	 * <p>
	 * Description: 应急队伍位置信息
	 * </p>
	 * 
	 * @author joyu
	 * @return json string
	 */
	@RequestMapping(value = "emergencyTeamPosition", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@ActionInfo(name = "位置信息", access = 06, index = 0)
	public String emergencyTeamPosition(EquipmentPositionParam epp) throws Exception {
		 if(epp.getPage()!=null && epp.getRows()!=null){
			epp.setStart((epp.getPage() - 1) * epp.getRows() + 1);
			epp.setEnd(epp.getPage() * epp.getRows());
		 }
		JSONObject jo = ControllerUtils.buildSuccessJson();
		JSONArray jArray = BeanUtils.describeToJson(equipmentPositionService.getEmergencyTeamPosition(epp));
		int count = equipmentPositionService.getEmergencyTeamCount(epp);
		jo.put("total", count).put("rows", jArray);
		return jo.toString();
	}

}
