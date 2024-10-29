package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HugongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HugongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HugongView;


/**
 * 护工
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface HugongService extends IService<HugongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HugongVO> selectListVO(Wrapper<HugongEntity> wrapper);
   	
   	HugongVO selectVO(@Param("ew") Wrapper<HugongEntity> wrapper);
   	
   	List<HugongView> selectListView(Wrapper<HugongEntity> wrapper);
   	
   	HugongView selectView(@Param("ew") Wrapper<HugongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HugongEntity> wrapper);
   	
}

