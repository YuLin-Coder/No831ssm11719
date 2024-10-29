package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongleixingView;


/**
 * 费用类型
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface FeiyongleixingService extends IService<FeiyongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongleixingVO> selectListVO(Wrapper<FeiyongleixingEntity> wrapper);
   	
   	FeiyongleixingVO selectVO(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
   	
   	List<FeiyongleixingView> selectListView(Wrapper<FeiyongleixingEntity> wrapper);
   	
   	FeiyongleixingView selectView(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongleixingEntity> wrapper);
   	
}

