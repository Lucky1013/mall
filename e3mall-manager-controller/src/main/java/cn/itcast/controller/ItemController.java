package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.service.TbItemService;
import cn.itcast.utlis.PageResult;

@RestController
public class ItemController {

	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("/item/list")
	public PageResult findItemListByPage(@RequestParam(defaultValue="1") Integer page, 
			@RequestParam(defaultValue="20")Integer rows){
		PageResult result = tbItemService.findItemListByPage(page, rows);
		return result;
	}
}
