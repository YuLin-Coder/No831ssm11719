package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshifenleiView;


/**
 * 科室分类
 *
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface KeshifenleiService extends IService<KeshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshifenleiVO> selectListVO(Wrapper<KeshifenleiEntity> wrapper);
   	
   	KeshifenleiVO selectVO(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
   	
   	List<KeshifenleiView> selectListView(Wrapper<KeshifenleiEntity> wrapper);
   	
   	KeshifenleiView selectView(@Param("ew") Wrapper<KeshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshifenleiEntity> wrapper);
   	
}

