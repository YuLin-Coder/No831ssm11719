package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HugongyuyueDao;
import com.entity.HugongyuyueEntity;
import com.service.HugongyuyueService;
import com.entity.vo.HugongyuyueVO;
import com.entity.view.HugongyuyueView;

@Service("hugongyuyueService")
public class HugongyuyueServiceImpl extends ServiceImpl<HugongyuyueDao, HugongyuyueEntity> implements HugongyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HugongyuyueEntity> page = this.selectPage(
                new Query<HugongyuyueEntity>(params).getPage(),
                new EntityWrapper<HugongyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HugongyuyueEntity> wrapper) {
		  Page<HugongyuyueView> page =new Query<HugongyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HugongyuyueVO> selectListVO(Wrapper<HugongyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HugongyuyueVO selectVO(Wrapper<HugongyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HugongyuyueView> selectListView(Wrapper<HugongyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HugongyuyueView selectView(Wrapper<HugongyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
