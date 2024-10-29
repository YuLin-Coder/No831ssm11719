package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshugongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshugongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshugongxinxiView;


/**
 * 护工信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface DiscusshugongxinxiService extends IService<DiscusshugongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshugongxinxiVO> selectListVO(Wrapper<DiscusshugongxinxiEntity> wrapper);
   	
   	DiscusshugongxinxiVO selectVO(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
   	
   	List<DiscusshugongxinxiView> selectListView(Wrapper<DiscusshugongxinxiEntity> wrapper);
   	
   	DiscusshugongxinxiView selectView(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshugongxinxiEntity> wrapper);
   	
}

