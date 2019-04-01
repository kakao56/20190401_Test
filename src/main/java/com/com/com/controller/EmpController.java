package com.com.com.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.com.com.service.EmpService;

@Controller
public class EmpController {

	@Resource(name="service")
	private EmpService empService;
	
	@RequestMapping("golist")
	public String goList() {
		return "list";
	}
	
	@RequestMapping("searchlist")
	public ModelAndView getList(@RequestParam Map<String, Object> map) {
		
		ModelAndView mv = new ModelAndView();
		
		mv = empService.getList(map,mv);
		
		return mv;
	}
}
