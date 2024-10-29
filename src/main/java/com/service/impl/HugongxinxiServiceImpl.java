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


import com.dao.HugongxinxiDao;
import com.entity.HugongxinxiEntity;
import com.service.HugongxinxiService;
import com.entity.vo.HugongxinxiVO;
import com.entity.view.HugongxinxiView;

@Service("hugongxinxiService")
public class HugongxinxiServiceImpl extends ServiceImpl<HugongxinxiDao, HugongxinxiEntity> implements HugongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HugongxinxiEntity> page = this.selectPage(
                new Query<HugongxinxiEntity>(params).getPage(),
                new EntityWrapper<HugongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HugongxinxiEntity> wrapper) {
		  Page<HugongxinxiView> page =new Query<HugongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HugongxinxiVO> selectListVO(Wrapper<HugongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HugongxinxiVO selectVO(Wrapper<HugongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HugongxinxiView> selectListView(Wrapper<HugongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HugongxinxiView selectView(Wrapper<HugongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
