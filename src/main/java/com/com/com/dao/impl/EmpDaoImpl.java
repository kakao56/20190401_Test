package com.com.com.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.com.dao.EmpDao;

@Repository("dao")
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<Map<String, Map<String, Object>>> getList(Map<String, Object> map) {
		return sst.selectList("mapper.getList",map);
	}
}
