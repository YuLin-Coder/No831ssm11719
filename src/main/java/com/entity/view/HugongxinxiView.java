package com.entity.view;

import com.entity.HugongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护工信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("hugongxinxi")
public class HugongxinxiView  extends HugongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HugongxinxiView(){
	}
 
 	public HugongxinxiView(HugongxinxiEntity hugongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, hugongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
