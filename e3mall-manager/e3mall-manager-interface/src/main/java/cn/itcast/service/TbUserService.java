package cn.itcast.service;

import cn.itcast.domain.TbUser;

public interface TbUserService {
	//根据id查询user对象
	public TbUser findById(Long id);
}
