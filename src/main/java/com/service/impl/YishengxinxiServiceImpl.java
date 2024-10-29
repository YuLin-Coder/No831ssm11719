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


import com.dao.YishengxinxiDao;
import com.entity.YishengxinxiEntity;
import com.service.YishengxinxiService;
import com.entity.vo.YishengxinxiVO;
import com.entity.view.YishengxinxiView;

@Service("yishengxinxiService")
public class YishengxinxiServiceImpl extends ServiceImpl<YishengxinxiDao, YishengxinxiEntity> implements YishengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengxinxiEntity> page = this.selectPage(
                new Query<YishengxinxiEntity>(params).getPage(),
                new EntityWrapper<YishengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengxinxiEntity> wrapper) {
		  Page<YishengxinxiView> page =new Query<YishengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengxinxiVO> selectListVO(Wrapper<YishengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengxinxiVO selectVO(Wrapper<YishengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengxinxiView> selectListView(Wrapper<YishengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengxinxiView selectView(Wrapper<YishengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
