package com.aiidc.sps.ep.controller;

import java.util.List;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aiidc.base.ActionInfo;
import com.aiidc.base.AiidcException;
import com.aiidc.base.ControllerInfo;
import com.aiidc.base.ControllerUtils;
import com.aiidc.sps.ep.entity.FinalStaticValues;
import com.aiidc.sps.ep.entity.ThresholdConfig;
import com.aiidc.sps.ep.entity.ThresholdConfigForCheck;
import com.aiidc.sps.ep.services.ThresholdConfigService;

@Controller
@RequestMapping("threshold_sewage")
@ControllerInfo(order=10,value="污水排口-报警阀值设置")
public class ThresholdSewageController {
	@Autowired
	private ThresholdConfigService thresholdService;
	
	@RequestMapping("list")
	@ActionInfo(name="污水排口列表页",access=06,index=0)
	public String list()
	throws Exception
	{
		return "threshold_sewage/list";
	}
	
	@RequestMapping("table")
	@ActionInfo(name="污水排口数据列表",access=06,index=1)
	public ModelAndView table(ThresholdConfigForCheck thresholdConfigForCheck)
	throws Exception
	{
		thresholdConfigForCheck.setType(FinalStaticValues.WUSHUIPAIKOU);	
		if(thresholdConfigForCheck.getPage()==null){
			thresholdConfigForCheck.setPage(1);
		}
		if(thresholdConfigForCheck.getRows()==null){
			thresholdConfigForCheck.setRows(10);
		}
		if("" ==thresholdConfigForCheck.getName()){
			thresholdConfigForCheck.setName(null);
		}
		ModelAndView m = new ModelAndView();
		m.getModel().put("thresholdList", thresholdService.findThresholdConfig(thresholdConfigForCheck));
		m.getModel().put("total", thresholdService.getTotal(thresholdConfigForCheck));
		m.setViewName("threshold_sewage/table");
		return m;
	}
	
	@RequestMapping("detail")
	@ActionInfo(name="污水排口详情页",access=06,index=2)
	public ModelAndView detail(String id){
		if(null == id || id.isEmpty()){
			ModelAndView m = new ModelAndView();
			m.setViewName("threshold_sewage/detail");
			return m;
		}else{
			ThresholdConfigForCheck thresholdConfigForCheck = new ThresholdConfigForCheck();
			thresholdConfigForCheck.setId(id);
			thresholdConfigForCheck.setType(FinalStaticValues.WUSHUIPAIKOU);
			ModelAndView m = new ModelAndView();
			m.getModel().put("threshold", thresholdService.findThresholdById(thresholdConfigForCheck));
			m.setViewName("threshold_sewage/detail");
			return m;
		}
	}
	
	@ActionInfo(name="编辑和保存-污水排口",access=06,index=3)
	@RequestMapping(value="save",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String saveOrUpdate(@ModelAttribute @Valid ThresholdConfig thresholdConfig,Errors error){
		if(error.hasErrors()){
			JSONObject json = ControllerUtils.buildFailureJson(new AiidcException("DTVY001", new String[]{"请检查输入项。"}));
			List<FieldError> list = error.getFieldErrors();
			for(FieldError fieldError : list){
				json.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return json.toString();
		}
		thresholdConfig.setType(FinalStaticValues.WUSHUIPAIKOU);
		String id =thresholdService.saveOrUpdate(thresholdConfig);
		JSONObject json =ControllerUtils.buildSuccessJson();
		json.put("saveId", id);
		return json.toString();
	}
	
	@ActionInfo(name="删除-污水排口",access=06,index=4)
	@RequestMapping(value="deleteThreshold",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String deleteThreshold(@RequestParam List<String> thresholds)
	throws Exception
	{
		for(String threshold : thresholds){
			ThresholdConfig thresholdConfig = new ThresholdConfig();
			thresholdConfig.setType(FinalStaticValues.WUSHUIPAIKOU);
			thresholdConfig.setId(threshold);
			thresholdService.delete(thresholdConfig);
		}
		return ControllerUtils.buildSuccessJson().toString();
	}
}
