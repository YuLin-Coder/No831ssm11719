package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 出院管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("chuyuanguanli")
public class ChuyuanguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChuyuanguanliEntity() {
		
	}
	
	public ChuyuanguanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病人姓名
	 */
					
	private String bingrenxingming;
	
	/**
	 * 所属病区
	 */
					
	private String suoshubingqu;
	
	/**
	 * 床位号
	 */
					
	private Integer chuangweihao;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病人姓名
	 */
	public void setBingrenxingming(String bingrenxingming) {
		this.bingrenxingming = bingrenxingming;
	}
	/**
	 * 获取：病人姓名
	 */
	public String getBingrenxingming() {
		return bingrenxingming;
	}
	/**
	 * 设置：所属病区
	 */
	public void setSuoshubingqu(String suoshubingqu) {
		this.suoshubingqu = suoshubingqu;
	}
	/**
	 * 获取：所属病区
	 */
	public String getSuoshubingqu() {
		return suoshubingqu;
	}
	/**
	 * 设置：床位号
	 */
	public void setChuangweihao(Integer chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	/**
	 * 获取：床位号
	 */
	public Integer getChuangweihao() {
		return chuangweihao;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
