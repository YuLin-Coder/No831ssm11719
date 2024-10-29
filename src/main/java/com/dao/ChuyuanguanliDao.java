package com.dao;

import com.entity.ChuyuanguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuyuanguanliVO;
import com.entity.view.ChuyuanguanliView;


/**
 * 出院管理
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface ChuyuanguanliDao extends BaseMapper<ChuyuanguanliEntity> {
	
	List<ChuyuanguanliVO> selectListVO(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
	
	ChuyuanguanliVO selectVO(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
	
	List<ChuyuanguanliView> selectListView(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);

	List<ChuyuanguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
	
	ChuyuanguanliView selectView(@Param("ew") Wrapper<ChuyuanguanliEntity> wrapper);
	
}
