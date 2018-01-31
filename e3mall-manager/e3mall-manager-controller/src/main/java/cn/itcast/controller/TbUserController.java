package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.domain.TbUser;
import cn.itcast.service.TbUserService;

@RestController
public class TbUserController {

	@Autowired
	private TbUserService tbUserService;
	
	@RequestMapping("/list/{id}")
	public TbUser findById(@PathVariable Long id){
		TbUser tbUser = tbUserService.findById(id);
		return tbUser;
	}
}
