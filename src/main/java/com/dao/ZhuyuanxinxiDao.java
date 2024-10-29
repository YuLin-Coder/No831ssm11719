package com.dao;

import com.entity.ZhuyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuyuanxinxiVO;
import com.entity.view.ZhuyuanxinxiView;


/**
 * 住院信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface ZhuyuanxinxiDao extends BaseMapper<ZhuyuanxinxiEntity> {
	
	List<ZhuyuanxinxiVO> selectListVO(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
	
	ZhuyuanxinxiVO selectVO(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
	
	List<ZhuyuanxinxiView> selectListView(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);

	List<ZhuyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
	
	ZhuyuanxinxiView selectView(@Param("ew") Wrapper<ZhuyuanxinxiEntity> wrapper);
	
}
