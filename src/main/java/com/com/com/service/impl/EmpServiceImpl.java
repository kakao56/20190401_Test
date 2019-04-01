package com.com.com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.com.com.dao.EmpDao;
import com.com.com.service.EmpService;

@Service("service")
public class EmpServiceImpl implements EmpService{

	@Resource(name = "dao")
	private EmpDao empDao;

	@Override
	public ModelAndView getList(Map<String, Object> map, ModelAndView mv) {
		List<Map<String, Map<String, Object>>> list = null;
		
		list = empDao.getList(map);
		
		mv.addObject("list", list);
		mv.setViewName("searchList");
		
		return mv;
	}

}
