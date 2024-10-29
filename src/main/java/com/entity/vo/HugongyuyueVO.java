package com.entity.vo;

import com.entity.HugongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 护工预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public class HugongyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 护工编号
	 */
	
	private String hugongbianhao;
		
	/**
	 * 护工姓名
	 */
	
	private String hugongxingming;
		
	/**
	 * 服务价格
	 */
	
	private Integer fuwujiage;
		
	/**
	 * 服务天数
	 */
	
	private Integer fuwutianshu;
		
	/**
	 * 总金额
	 */
	
	private String zongjine;
		
	/**
	 * 预约日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：护工编号
	 */
	 
	public void setHugongbianhao(String hugongbianhao) {
		this.hugongbianhao = hugongbianhao;
	}
	
	/**
	 * 获取：护工编号
	 */
	public String getHugongbianhao() {
		return hugongbianhao;
	}
				
	
	/**
	 * 设置：护工姓名
	 */
	 
	public void setHugongxingming(String hugongxingming) {
		this.hugongxingming = hugongxingming;
	}
	
	/**
	 * 获取：护工姓名
	 */
	public String getHugongxingming() {
		return hugongxingming;
	}
				
	
	/**
	 * 设置：服务价格
	 */
	 
	public void setFuwujiage(Integer fuwujiage) {
		this.fuwujiage = fuwujiage;
	}
	
	/**
	 * 获取：服务价格
	 */
	public Integer getFuwujiage() {
		return fuwujiage;
	}
				
	
	/**
	 * 设置：服务天数
	 */
	 
	public void setFuwutianshu(Integer fuwutianshu) {
		this.fuwutianshu = fuwutianshu;
	}
	
	/**
	 * 获取：服务天数
	 */
	public Integer getFuwutianshu() {
		return fuwutianshu;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：预约日期
	 */
	 
	public void setYuyueriqi(Date yuyueriqi) {
		this.yuyueriqi = yuyueriqi;
	}
	
	/**
	 * 获取：预约日期
	 */
	public Date getYuyueriqi() {
		return yuyueriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
