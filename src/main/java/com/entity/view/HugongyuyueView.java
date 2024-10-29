package com.entity.view;

import com.entity.HugongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护工预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("hugongyuyue")
public class HugongyuyueView  extends HugongyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HugongyuyueView(){
	}
 
 	public HugongyuyueView(HugongyuyueEntity hugongyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, hugongyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
