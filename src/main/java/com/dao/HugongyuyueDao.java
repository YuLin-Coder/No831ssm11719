package com.dao;

import com.entity.HugongyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HugongyuyueVO;
import com.entity.view.HugongyuyueView;


/**
 * 护工预约
 * 
 * @author 
 * @email 
 * @date 2021-03-26 11:15:45
 */
public interface HugongyuyueDao extends BaseMapper<HugongyuyueEntity> {
	
	List<HugongyuyueVO> selectListVO(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
	
	HugongyuyueVO selectVO(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
	
	List<HugongyuyueView> selectListView(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);

	List<HugongyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
	
	HugongyuyueView selectView(@Param("ew") Wrapper<HugongyuyueEntity> wrapper);
	
}
