package com.dao;

import com.entity.FeiyongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongleixingVO;
import com.entity.view.FeiyongleixingView;


/**
 * 费用类型
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface FeiyongleixingDao extends BaseMapper<FeiyongleixingEntity> {
	
	List<FeiyongleixingVO> selectListVO(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
	
	FeiyongleixingVO selectVO(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
	
	List<FeiyongleixingView> selectListView(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);

	List<FeiyongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
	
	FeiyongleixingView selectView(@Param("ew") Wrapper<FeiyongleixingEntity> wrapper);
	
}
