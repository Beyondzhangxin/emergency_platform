package com.aiidc.sps.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aiidc.base.ActionInfo;
import com.aiidc.base.ControllerInfo;

@Controller
@RequestMapping("eser_warning")
@ControllerInfo(order=10,value="预警报警页面")
public class EserWarningController {

	@RequestMapping("list")
	@ActionInfo(name="预警报警列表页",access=06,index=0)
	public ModelAndView list()
	throws Exception
	{
		ModelAndView m = new ModelAndView();
		m.setViewName("eser_warning/list");
		return m;
	}
}
