package com.dao;

import com.entity.HugongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HugongxinxiVO;
import com.entity.view.HugongxinxiView;


/**
 * 护工信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface HugongxinxiDao extends BaseMapper<HugongxinxiEntity> {
	
	List<HugongxinxiVO> selectListVO(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
	
	HugongxinxiVO selectVO(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
	
	List<HugongxinxiView> selectListView(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);

	List<HugongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
	
	HugongxinxiView selectView(@Param("ew") Wrapper<HugongxinxiEntity> wrapper);
	
}
