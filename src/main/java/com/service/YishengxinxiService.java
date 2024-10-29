package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengxinxiView;


/**
 * 医生信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface YishengxinxiService extends IService<YishengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengxinxiVO> selectListVO(Wrapper<YishengxinxiEntity> wrapper);
   	
   	YishengxinxiVO selectVO(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
   	
   	List<YishengxinxiView> selectListView(Wrapper<YishengxinxiEntity> wrapper);
   	
   	YishengxinxiView selectView(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengxinxiEntity> wrapper);
   	
}

