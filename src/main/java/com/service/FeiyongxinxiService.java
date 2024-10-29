package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongxinxiView;


/**
 * 费用信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface FeiyongxinxiService extends IService<FeiyongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongxinxiVO> selectListVO(Wrapper<FeiyongxinxiEntity> wrapper);
   	
   	FeiyongxinxiVO selectVO(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
   	
   	List<FeiyongxinxiView> selectListView(Wrapper<FeiyongxinxiEntity> wrapper);
   	
   	FeiyongxinxiView selectView(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongxinxiEntity> wrapper);
   	
}

