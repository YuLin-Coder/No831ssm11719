package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuyuanguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuyuanguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuyuanguanliView;


/**
 * 出院管理
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface ChuyuanguanliService extends IService<ChuyuanguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuyuanguanliVO> selectListVO(Wrapper<ChuyuanguanliEntity> wrapper);
   	
   	ChuyuanguanliVO selectVO(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
   	
   	List<ChuyuanguanliView> selectListView(Wrapper<ChuyuanguanliEntity> wrapper);
   	
   	ChuyuanguanliView selectView(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuyuanguanliEntity> wrapper);
   	
}

