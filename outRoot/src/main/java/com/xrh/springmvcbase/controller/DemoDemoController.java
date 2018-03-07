/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */

package com.xrh.springmvcbase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import com.xrh.springmvcbase.utils.Response;
import com.xrh.springmvcbase.annotation.Menu;

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


@Controller
@RequestMapping(value = "/demoDemo")
@Menu(value = "demoDemo", name = "demoDemo")
public class DemoDemoController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null;
	@Autowired
	private IDemoDemoService<DemoDemo,java.lang.Integer> demoDemoService;

	/**
	 * 首页
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "/demoDemo/demoDemo_index";
	}

	/** 
	 * 执行搜索 
	 **/
	@RequestMapping(value = "/list")
	@ResponseBody
	public Page list(HttpServletRequest request,HttpServletResponse response,DemoDemoQuery query) {
		Page page = this.demoDemoService.findPage(query);

		return page;
	}

	/**
	 * 新增页面初始化
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add")
	public String add(Model model) {
		model.addAttribute("title", "新建用户");
		return "/demoDemo/demoDemo_add";
	}

	/**
	 * 编辑页面初始化
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/edit")
	public String edit(Model model, int id) {
		DemoDemo entity = this.demoDemoService.getById(id);
		model.addAttribute("title", "修改密码");
		model.addAttribute("demoDemo", entity);
		return "/demoDemo/demoDemo_add";
	}

	/**
	 * 新增或修改保存
	 * @param entity
	 * @param request
	 */
	@ResponseBody
	@RequestMapping(value = "/save")
	public Response save(DemoDemo entity, HttpServletRequest request){
		this.demoDemoService.saveOrUpdate(entity);
		return Response.build().success();
	}

	/**
	 * 删除数据
	 * @param id
	 */
	@ResponseBody
	@RequestMapping(value = "/del")
	public Response del(int id){
		try{
			this.demoDemoService.removeById(id);
		}catch (Exception e){
			return Response.build().fail(e);
		}
		return Response.build().success();
	}

}

