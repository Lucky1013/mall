package cn.itcast.service;


import cn.itcast.utlis.PageResult;

public interface TbItemService {

	//查询商品列表findItemListByPage
	public PageResult findItemListByPage(Integer page, Integer rows);
}
