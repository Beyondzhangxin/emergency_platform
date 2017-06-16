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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aiidc.base.ActionInfo;
import com.aiidc.base.AiidcException;
import com.aiidc.base.ControllerInfo;
import com.aiidc.base.ControllerUtils;
import com.aiidc.sps.ep.entity.EmailServer;
import com.aiidc.sps.ep.services.RwEmailServerService;
import com.aiidc.sps.ep.utility.SendEmailUtil;

@Controller
@RequestMapping("rw_email_server")
@ControllerInfo(order=10,value="服务器-报警推送设置")
public class RwEmailServerController {

	@Autowired
	private RwEmailServerService emailServerService;
	
	@RequestMapping("list")
	@ActionInfo(name="服务器列表页",access=06,index=0)
	public ModelAndView list(){
		ModelAndView m=new ModelAndView();
		m.setViewName("rw_email_server/list");
		return m;
	}
	
	@ActionInfo(name="保存服务器",access=06,index=3)
	@RequestMapping(value="save",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String save(@ModelAttribute @Valid EmailServer emailServer,Errors error) 
	throws Exception
	{
		if(error.hasErrors()){
			JSONObject json = ControllerUtils.buildFailureJson(new AiidcException("DTVY001", new String[]{"请检查输入项。"}));
			List<FieldError> list = error.getFieldErrors();
			for(FieldError fieldError : list){
				json.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return json.toString();
		}
		String[] to = {emailServer.getEmail()};
		String subject="测试邮件。。。";
		String content="测试使用javaEmail发送邮件。。。";
		boolean flag =SendEmailUtil.sendTextEmail(emailServer.getEmailServer(), emailServer.getEmail(), emailServer.getEmailPassword(),to, subject, content);
		if(flag){
			emailServerService.save(emailServer);
			JSONObject jsonSuc = ControllerUtils.buildSuccessJson();
			return jsonSuc.toString();
		}else{
			JSONObject jsonFail = ControllerUtils.buildFailureJson(new AiidcException("DTVY002"));
			return jsonFail.toString();
		}
	}
}
