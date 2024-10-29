package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HugongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HugongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HugongxinxiView;


/**
 * 护工信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface HugongxinxiService extends IService<HugongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HugongxinxiVO> selectListVO(Wrapper<HugongxinxiEntity> wrapper);
   	
   	HugongxinxiVO selectVO(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
   	
   	List<HugongxinxiView> selectListView(Wrapper<HugongxinxiEntity> wrapper);
   	
   	HugongxinxiView selectView(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HugongxinxiEntity> wrapper);
   	
}

