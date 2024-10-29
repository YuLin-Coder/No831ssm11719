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
 * 住院信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("zhuyuanxinxi")
public class ZhuyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuyuanxinxiEntity() {
		
	}
	
	public ZhuyuanxinxiEntity(T t) {
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
	 * 所属科室
	 */
					
	private String suoshukeshi;
	
	/**
	 * 床位号
	 */
					
	private Integer chuangweihao;
	
	/**
	 * 主治医生
	 */
					
	private String zhuzhiyisheng;
	
	/**
	 * 病历
	 */
					
	private String bingli;
	
	/**
	 * 住院日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhuyuanriqi;
	
	/**
	 * 住院操作员
	 */
					
	private String zhuyuancaozuoyuan;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：所属科室
	 */
	public void setSuoshukeshi(String suoshukeshi) {
		this.suoshukeshi = suoshukeshi;
	}
	/**
	 * 获取：所属科室
	 */
	public String getSuoshukeshi() {
		return suoshukeshi;
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
	 * 设置：主治医生
	 */
	public void setZhuzhiyisheng(String zhuzhiyisheng) {
		this.zhuzhiyisheng = zhuzhiyisheng;
	}
	/**
	 * 获取：主治医生
	 */
	public String getZhuzhiyisheng() {
		return zhuzhiyisheng;
	}
	/**
	 * 设置：病历
	 */
	public void setBingli(String bingli) {
		this.bingli = bingli;
	}
	/**
	 * 获取：病历
	 */
	public String getBingli() {
		return bingli;
	}
	/**
	 * 设置：住院日期
	 */
	public void setZhuyuanriqi(Date zhuyuanriqi) {
		this.zhuyuanriqi = zhuyuanriqi;
	}
	/**
	 * 获取：住院日期
	 */
	public Date getZhuyuanriqi() {
		return zhuyuanriqi;
	}
	/**
	 * 设置：住院操作员
	 */
	public void setZhuyuancaozuoyuan(String zhuyuancaozuoyuan) {
		this.zhuyuancaozuoyuan = zhuyuancaozuoyuan;
	}
	/**
	 * 获取：住院操作员
	 */
	public String getZhuyuancaozuoyuan() {
		return zhuyuancaozuoyuan;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
