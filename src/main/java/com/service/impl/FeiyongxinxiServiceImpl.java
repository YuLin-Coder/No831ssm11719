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


import com.dao.FeiyongxinxiDao;
import com.entity.FeiyongxinxiEntity;
import com.service.FeiyongxinxiService;
import com.entity.vo.FeiyongxinxiVO;
import com.entity.view.FeiyongxinxiView;

@Service("feiyongxinxiService")
public class FeiyongxinxiServiceImpl extends ServiceImpl<FeiyongxinxiDao, FeiyongxinxiEntity> implements FeiyongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongxinxiEntity> page = this.selectPage(
                new Query<FeiyongxinxiEntity>(params).getPage(),
                new EntityWrapper<FeiyongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongxinxiEntity> wrapper) {
		  Page<FeiyongxinxiView> page =new Query<FeiyongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongxinxiVO> selectListVO(Wrapper<FeiyongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongxinxiVO selectVO(Wrapper<FeiyongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongxinxiView> selectListView(Wrapper<FeiyongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongxinxiView selectView(Wrapper<FeiyongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
