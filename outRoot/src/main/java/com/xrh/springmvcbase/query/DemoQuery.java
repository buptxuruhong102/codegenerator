/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */

package com.xrh.springmvcbase.query;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

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


public class DemoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 名称 */
	private java.lang.String name;
	/** 年龄 */
	private java.lang.Integer age;
	/** c1 */
	private java.lang.String name2;
	/** c2 */
	private java.lang.String c2;
	/** c3 */
	private java.lang.String c3;
	/** c4 */
	private java.lang.String c4;
	/** 名称2 */
	private java.lang.String c5;
	/** c6 */
	private java.lang.String c6;
	/** c7 */
	private java.lang.String c7;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.Integer getAge() {
		return this.age;
	}
	
	public void setAge(java.lang.Integer value) {
		this.age = value;
	}
	
	public java.lang.String getName2() {
		return this.name2;
	}
	
	public void setName2(java.lang.String value) {
		this.name2 = value;
	}
	
	public java.lang.String getC2() {
		return this.c2;
	}
	
	public void setC2(java.lang.String value) {
		this.c2 = value;
	}
	
	public java.lang.String getC3() {
		return this.c3;
	}
	
	public void setC3(java.lang.String value) {
		this.c3 = value;
	}
	
	public java.lang.String getC4() {
		return this.c4;
	}
	
	public void setC4(java.lang.String value) {
		this.c4 = value;
	}
	
	public java.lang.String getC5() {
		return this.c5;
	}
	
	public void setC5(java.lang.String value) {
		this.c5 = value;
	}
	
	public java.lang.String getC6() {
		return this.c6;
	}
	
	public void setC6(java.lang.String value) {
		this.c6 = value;
	}
	
	public java.lang.String getC7() {
		return this.c7;
	}
	
	public void setC7(java.lang.String value) {
		this.c7 = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

