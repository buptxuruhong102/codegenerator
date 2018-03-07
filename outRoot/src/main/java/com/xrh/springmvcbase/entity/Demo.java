/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2018
 */

package com.xrh.springmvcbase.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

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


public class Demo extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Demo";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_AGE = "年龄";
	public static final String ALIAS_NAME2 = "c1";
	public static final String ALIAS_C2 = "c2";
	public static final String ALIAS_C3 = "c3";
	public static final String ALIAS_C4 = "c4";
	public static final String ALIAS_C5 = "名称2";
	public static final String ALIAS_C6 = "c6";
	public static final String ALIAS_C7 = "c7";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */ 	
	private java.lang.Integer id;
    /**
     * 名称       db_column: name 
     */ 	
	private java.lang.String name;
    /**
     * 年龄       db_column: age 
     */ 	
	private java.lang.Integer age;
    /**
     * c1       db_column: name2 
     */ 	
	private java.lang.String name2;
    /**
     * c2       db_column: c2 
     */ 	
	private java.lang.String c2;
    /**
     * c3       db_column: c3 
     */ 	
	private java.lang.String c3;
    /**
     * c4       db_column: c4 
     */ 	
	private java.lang.String c4;
    /**
     * 名称2       db_column: c5 
     */ 	
	private java.lang.String c5;
    /**
     * c6       db_column: c6 
     */ 	
	private java.lang.String c6;
    /**
     * c7       db_column: c7 
     */ 	
	private java.lang.String c7;
	//columns END
	
	//注意： spring_jdbc的MetadataCreateUtils.fromTable(Entity.class) 可以读取JPA annotation的标注信息
	//现支持 @Id,@Column,@Table标注

	public Demo(){
	}

	public Demo(
		java.lang.Integer id
	){
		this.id = id;
	}

	@Id
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
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("Age",getAge())
			.append("Name2",getName2())
			.append("C2",getC2())
			.append("C3",getC3())
			.append("C4",getC4())
			.append("C5",getC5())
			.append("C6",getC6())
			.append("C7",getC7())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Demo == false) return false;
		if(this == obj) return true;
		Demo other = (Demo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

