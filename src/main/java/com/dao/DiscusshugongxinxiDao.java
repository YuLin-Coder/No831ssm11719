package com.dao;

import com.entity.DiscusshugongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshugongxinxiVO;
import com.entity.view.DiscusshugongxinxiView;


/**
 * 护工信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface DiscusshugongxinxiDao extends BaseMapper<DiscusshugongxinxiEntity> {
	
	List<DiscusshugongxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
	
	DiscusshugongxinxiVO selectVO(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
	
	List<DiscusshugongxinxiView> selectListView(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);

	List<DiscusshugongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
	
	DiscusshugongxinxiView selectView(@Param("ew") Wrapper<DiscusshugongxinxiEntity> wrapper);
	
}
