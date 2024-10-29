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


import com.dao.ChuyuanguanliDao;
import com.entity.ChuyuanguanliEntity;
import com.service.ChuyuanguanliService;
import com.entity.vo.ChuyuanguanliVO;
import com.entity.view.ChuyuanguanliView;

@Service("chuyuanguanliService")
public class ChuyuanguanliServiceImpl extends ServiceImpl<ChuyuanguanliDao, ChuyuanguanliEntity> implements ChuyuanguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuyuanguanliEntity> page = this.selectPage(
                new Query<ChuyuanguanliEntity>(params).getPage(),
                new EntityWrapper<ChuyuanguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuyuanguanliEntity> wrapper) {
		  Page<ChuyuanguanliView> page =new Query<ChuyuanguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuyuanguanliVO> selectListVO(Wrapper<ChuyuanguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuyuanguanliVO selectVO(Wrapper<ChuyuanguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuyuanguanliView> selectListView(Wrapper<ChuyuanguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuyuanguanliView selectView(Wrapper<ChuyuanguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
