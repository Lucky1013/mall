package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.domain.TbItem;
import cn.itcast.domain.TbItemExample;
import cn.itcast.mapper.TbItemMapper;
import cn.itcast.service.TbItemService;
import cn.itcast.utlis.PageResult;
@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public PageResult findItemListByPage(Integer page, Integer rows) {
		TbItemExample example = new TbItemExample();
		//设置分页
		PageHelper.startPage(page, rows);
		//分页查询
		List<TbItem> list = tbItemMapper.selectByExample(example);
		//获取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		//封装分页结果
		PageResult pageResult = new PageResult();
		//总条数
		pageResult.setTotal(pageInfo.getTotal());
		//信息总记录数
		pageResult.setRows(list);
		
		return pageResult;
	}

}
