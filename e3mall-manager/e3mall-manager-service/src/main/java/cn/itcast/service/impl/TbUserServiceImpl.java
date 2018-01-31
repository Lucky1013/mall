package cn.itcast.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.domain.TbUser;
import cn.itcast.mapper.TbUserMapper;
import cn.itcast.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbUserMapper tbUserMapper;
	
	@Override
	public TbUser findById(Long id) {
		// TODO Auto-generated method stub
		return tbUserMapper.selectByPrimaryKey(id);
	}

}
