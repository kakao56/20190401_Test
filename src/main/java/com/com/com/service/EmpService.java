package com.com.com.service;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public interface EmpService {

	ModelAndView getList(Map<String, Object> map, ModelAndView mv);

}
