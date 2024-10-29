package com.entity.view;

import com.entity.KeshifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科室分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("keshifenlei")
public class KeshifenleiView  extends KeshifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeshifenleiView(){
	}
 
 	public KeshifenleiView(KeshifenleiEntity keshifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, keshifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
