package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HugongyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HugongyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HugongyuyueView;


/**
 * 护工预约
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface HugongyuyueService extends IService<HugongyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HugongyuyueVO> selectListVO(Wrapper<HugongyuyueEntity> wrapper);
   	
   	HugongyuyueVO selectVO(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
   	
   	List<HugongyuyueView> selectListView(Wrapper<HugongyuyueEntity> wrapper);
   	
   	HugongyuyueView selectView(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HugongyuyueEntity> wrapper);
   	
}

