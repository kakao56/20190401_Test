package com.com.com.dao;

import java.util.List;
import java.util.Map;

public interface EmpDao {

	List<Map<String, Map<String, Object>>> getList(Map<String, Object> map);

}
