package com.entity.view;

import com.entity.FeiyongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 费用类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("feiyongleixing")
public class FeiyongleixingView  extends FeiyongleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiyongleixingView(){
	}
 
 	public FeiyongleixingView(FeiyongleixingEntity feiyongleixingEntity){
 	try {
			BeanUtils.copyProperties(this, feiyongleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
