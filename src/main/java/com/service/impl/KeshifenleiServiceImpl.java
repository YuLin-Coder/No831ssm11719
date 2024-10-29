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


import com.dao.KeshifenleiDao;
import com.entity.KeshifenleiEntity;
import com.service.KeshifenleiService;
import com.entity.vo.KeshifenleiVO;
import com.entity.view.KeshifenleiView;

@Service("keshifenleiService")
public class KeshifenleiServiceImpl extends ServiceImpl<KeshifenleiDao, KeshifenleiEntity> implements KeshifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshifenleiEntity> page = this.selectPage(
                new Query<KeshifenleiEntity>(params).getPage(),
                new EntityWrapper<KeshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshifenleiEntity> wrapper) {
		  Page<KeshifenleiView> page =new Query<KeshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshifenleiVO> selectListVO(Wrapper<KeshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshifenleiVO selectVO(Wrapper<KeshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshifenleiView> selectListView(Wrapper<KeshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshifenleiView selectView(Wrapper<KeshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
