package com.aiidc.sps.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aiidc.base.ActionInfo;
import com.aiidc.base.ControllerInfo;

@Controller
@RequestMapping("rw_subscriber")
@ControllerInfo(order=10,value="订阅列表-报警推送设置")
public class RwSubscriberController {
	
	@RequestMapping("list")
	@ActionInfo(name="订阅列表页",access=06,index=0)
	public String list(){
		return "rw_subscriber/list";
	}
	
	@RequestMapping("table")
	@ActionInfo(name="订阅数据页",access=06,index=0)
	public ModelAndView table(){
		ModelAndView m = new ModelAndView();
		m.getModel().put("subscribers", "");
		m.getModel().put("total", 10);
		m.setViewName("rw_subscriber/table");
		return m;
	}
	
	
}
