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


import com.dao.DiscusshugongxinxiDao;
import com.entity.DiscusshugongxinxiEntity;
import com.service.DiscusshugongxinxiService;
import com.entity.vo.DiscusshugongxinxiVO;
import com.entity.view.DiscusshugongxinxiView;

@Service("discusshugongxinxiService")
public class DiscusshugongxinxiServiceImpl extends ServiceImpl<DiscusshugongxinxiDao, DiscusshugongxinxiEntity> implements DiscusshugongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshugongxinxiEntity> page = this.selectPage(
                new Query<DiscusshugongxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusshugongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshugongxinxiEntity> wrapper) {
		  Page<DiscusshugongxinxiView> page =new Query<DiscusshugongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshugongxinxiVO> selectListVO(Wrapper<DiscusshugongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshugongxinxiVO selectVO(Wrapper<DiscusshugongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshugongxinxiView> selectListView(Wrapper<DiscusshugongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshugongxinxiView selectView(Wrapper<DiscusshugongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
