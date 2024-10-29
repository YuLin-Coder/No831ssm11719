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


import com.dao.ZhuyuanxinxiDao;
import com.entity.ZhuyuanxinxiEntity;
import com.service.ZhuyuanxinxiService;
import com.entity.vo.ZhuyuanxinxiVO;
import com.entity.view.ZhuyuanxinxiView;

@Service("zhuyuanxinxiService")
public class ZhuyuanxinxiServiceImpl extends ServiceImpl<ZhuyuanxinxiDao, ZhuyuanxinxiEntity> implements ZhuyuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuyuanxinxiEntity> page = this.selectPage(
                new Query<ZhuyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuyuanxinxiEntity> wrapper) {
		  Page<ZhuyuanxinxiView> page =new Query<ZhuyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuyuanxinxiVO> selectListVO(Wrapper<ZhuyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuyuanxinxiVO selectVO(Wrapper<ZhuyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuyuanxinxiView> selectListView(Wrapper<ZhuyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuyuanxinxiView selectView(Wrapper<ZhuyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
