/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */

package com.xrh.springmvcbase.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import com.xrh.springmvcbase.common.base.*;
import com.xrh.springmvcbase.common.page.*;

import com.xrh.springmvcbase.entity.*;
import com.xrh.springmvcbase.dao.*;
import com.xrh.springmvcbase.service.*;
import com.xrh.springmvcbase.query.*;

/**
 * @author xuruhong
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class DemoDemoServiceImpl extends BaseService<DemoDemo,java.lang.Integer> implements IDemoDemoService<DemoDemo,java.lang.Integer>{
	@Autowired
	private IDemoDemoDao demoDemoDao;

	public EntityDao getEntityDao() {
		return this.demoDemoDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(DemoDemoQuery query) {
		return demoDemoDao.findPage(query);
	}
	
}
