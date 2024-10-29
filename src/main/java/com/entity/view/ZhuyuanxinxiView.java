package com.entity.view;

import com.entity.ZhuyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 住院信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
@TableName("zhuyuanxinxi")
public class ZhuyuanxinxiView  extends ZhuyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuyuanxinxiView(){
	}
 
 	public ZhuyuanxinxiView(ZhuyuanxinxiEntity zhuyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
