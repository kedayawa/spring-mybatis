package cn.yq.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.yq.spring.entity.User;
import cn.yq.spring.service.UserService;

public class UserTest extends BaseTest{
	
	@Autowired
	private UserService userService;

	@Test
	public void saveTest(){
		User user = new User();
		user.setId("557");
		user.setName("557");
		userService.save(user);
	}
}
