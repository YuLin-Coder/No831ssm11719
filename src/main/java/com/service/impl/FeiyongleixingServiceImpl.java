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


import com.dao.FeiyongleixingDao;
import com.entity.FeiyongleixingEntity;
import com.service.FeiyongleixingService;
import com.entity.vo.FeiyongleixingVO;
import com.entity.view.FeiyongleixingView;

@Service("feiyongleixingService")
public class FeiyongleixingServiceImpl extends ServiceImpl<FeiyongleixingDao, FeiyongleixingEntity> implements FeiyongleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongleixingEntity> page = this.selectPage(
                new Query<FeiyongleixingEntity>(params).getPage(),
                new EntityWrapper<FeiyongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongleixingEntity> wrapper) {
		  Page<FeiyongleixingView> page =new Query<FeiyongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongleixingVO> selectListVO(Wrapper<FeiyongleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongleixingVO selectVO(Wrapper<FeiyongleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongleixingView> selectListView(Wrapper<FeiyongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongleixingView selectView(Wrapper<FeiyongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
