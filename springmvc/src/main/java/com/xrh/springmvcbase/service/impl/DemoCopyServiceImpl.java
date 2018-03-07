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
public class DemoCopyServiceImpl extends BaseService<DemoCopy,java.lang.Integer> implements IDemoCopyService<DemoCopy,java.lang.Integer>{
	@Autowired
	private IDemoCopyDao demoCopyDao;

	public EntityDao getEntityDao() {
		return this.demoCopyDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(DemoCopyQuery query) {
		return demoCopyDao.findPage(query);
	}
	
}
