package com.dao;

import com.entity.FeiyongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongxinxiVO;
import com.entity.view.FeiyongxinxiView;


/**
 * 费用信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface FeiyongxinxiDao extends BaseMapper<FeiyongxinxiEntity> {
	
	List<FeiyongxinxiVO> selectListVO(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
	
	FeiyongxinxiVO selectVO(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
	
	List<FeiyongxinxiView> selectListView(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);

	List<FeiyongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
	
	FeiyongxinxiView selectView(@Param("ew") Wrapper<FeiyongxinxiEntity> wrapper);
	
}
