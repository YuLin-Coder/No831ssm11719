package com.dao;

import com.entity.YishengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengxinxiVO;
import com.entity.view.YishengxinxiView;


/**
 * 医生信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface YishengxinxiDao extends BaseMapper<YishengxinxiEntity> {
	
	List<YishengxinxiVO> selectListVO(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
	
	YishengxinxiVO selectVO(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
	
	List<YishengxinxiView> selectListView(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);

	List<YishengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
	
	YishengxinxiView selectView(@Param("ew") Wrapper<YishengxinxiEntity> wrapper);
	
}
