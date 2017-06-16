/*** 
*<p>Title: EquipmentPositionService</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月12日
*/
package com.aiidc.sps.ep.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiidc.sps.ep.entity.AirMonitor;
import com.aiidc.sps.ep.entity.EquipmentPositionParam;
import com.aiidc.sps.ep.entity.EquipmentPostion;
import com.aiidc.sps.ep.mapper.AirConfigurationMapper;
import com.aiidc.sps.ep.mapper.BoundConfigurationMapper;
import com.aiidc.sps.ep.mapper.EMMaterialMapper;
import com.aiidc.sps.ep.mapper.EmergencyTeamMapper;
import com.aiidc.sps.ep.mapper.RainwaterConfigurationMapper;
import com.aiidc.sps.ep.mapper.SewageConfigurationMapper;
import com.aiidc.sps.ep.utility.HttpRESTClient;
import com.aiidc.sps.ep.utility.JSONMapper;

/**
 * @author joyu
 * @date 2017年6月12日
 */

@Service
public class EquipmentPositionService {

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @return
	 */
	public static int PERIMETER = 2;  //周界
	public static int FACTORY_BOUND = 1; //厂界
	public static int MATERIAL = 1;    //物质
	public static int EQUIPMENT = 2;  //装备
	
	@Autowired
	private BoundConfigurationMapper boundConfigurationMapper;
	@Autowired
	private AirConfigurationMapper airConfigurationMapper;
	@Autowired
	private RainwaterConfigurationMapper rainwaterConfigurationMapper;
	@Autowired
	private SewageConfigurationMapper sewageConfigurationMapper;
	@Autowired
	private EMMaterialMapper emMaterialMapper;
	@Autowired
	private EmergencyTeamMapper emergencyTeamMapper;
	
	public List<EquipmentPostion> getBoundPosition(EquipmentPositionParam epp) {

		List<EquipmentPostion>  eps = boundConfigurationMapper.selectByParam(epp);
		return eps;
		//return jsonString;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getAirPosition(EquipmentPositionParam epp) {
		
		List<EquipmentPostion>  eps = airConfigurationMapper.selectByParam(epp);
		return eps;
/*		String resourcePath = "AirPosition/search";
		String jsonString = HttpRESTClient.springRestClient(HttpRESTClient.SERVER_URL, resourcePath);
		return jsonString;*/
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getRainwaterPosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = rainwaterConfigurationMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getSewagePosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = sewageConfigurationMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getMaterialPosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = emMaterialMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getHazardPosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = sewageConfigurationMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param rows 
	 * @param pageNum 
	 * @return
	 */
	public List<EquipmentPostion> getEPENTPosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = sewageConfigurationMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param pageNum
	 * @param rows
	 * @return
	 */
	public List<EquipmentPostion> getEmergencyTeamPosition(EquipmentPositionParam epp) {
		List<EquipmentPostion>  eps = emergencyTeamMapper.selectByParam(epp);
		return eps;
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getBoundCount(EquipmentPositionParam epp) {
		return boundConfigurationMapper.selectCount(epp);
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getAirCount(EquipmentPositionParam epp) {
		return airConfigurationMapper.selectCount(epp);
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getRainwaterCount(EquipmentPositionParam epp) {
		return rainwaterConfigurationMapper.selectCount(epp);
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getSewageCount(EquipmentPositionParam epp) {
		return sewageConfigurationMapper.selectCount(epp);
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getMaterialCount(EquipmentPositionParam epp) {
		return emMaterialMapper.selectCount(epp);
	}

	/**
	 * <p>Description: </p>
	 * @author joyu
	 * @param epp
	 * @return
	 */
	public int getEmergencyTeamCount(EquipmentPositionParam epp) {
		return emergencyTeamMapper.selectCount(epp);
	}
	
}
