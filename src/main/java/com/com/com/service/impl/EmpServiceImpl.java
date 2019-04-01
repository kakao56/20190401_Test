package com.com.com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.com.com.dao.EmpDao;
import com.com.com.emp.util.PageUtil;
import com.com.com.service.EmpService;

@Service("service")
public class EmpServiceImpl implements EmpService{

	@Resource(name = "dao")
	private EmpDao empDao;
	private int nowPage, totalCount, pagePerSize=10, pagePerBlock=5;

	@Override
	public ModelAndView getList(Map<String, Object> map, ModelAndView mv) {
		
		List<Map<String, Map<String, Object>>> list = null;
		
		if(map.get("nowPage") != null) {
			nowPage = Integer.parseInt(map.get("nowPage").toString());
		}else {
			nowPage = 1;
		}
			
		totalCount = empDao.getTotalCount(map);
		
		if(totalCount == 0) {
			mv.setViewName("searchList");
			return mv;
		}
		
		PageUtil page = new PageUtil(nowPage, totalCount, pagePerSize, pagePerBlock);
		
		map.put("begin",page.getBegin());
		map.put("end", page.getEnd());
		
		list = empDao.getList(map);
		
		mv.addObject("pageCode",page.getPageCode());
		mv.addObject("list", list);
		mv.setViewName("searchList");
		
		return mv;
	}

}
