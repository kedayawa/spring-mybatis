package cn.yq.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yq.spring.dao.UserMapper;
import cn.yq.spring.entity.User;
import cn.yq.spring.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	public void save(User user) {
		userMapper.Save(user);		
	}
	
	
	
	

}
