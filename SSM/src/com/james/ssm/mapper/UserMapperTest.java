package com.james.ssm.mapper;


import java.util.ArrayList;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.james.ssm.po.User;
import com.james.ssm.po.UserCustom;
import com.james.ssm.po.UserQueryVo;



public class UserMapperTest {
	private ApplicationContext ac;
	
	
	
	@Before
	public void setUp() {
		ac=new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
	}
	
	
	@Test
	public void testSelectById() {
		
		
		UserMapper mapper=(UserMapper) ac.getBean("userMapper");
		User user = mapper.selectById(16);
		System.out.println(user.getUsername());
	}
	
	@Test
	public void testFindUserList() {
		UserMapper mapper=(UserMapper) ac.getBean("userMapper");
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		userCustom.setUsername("张大明");
		userCustom.setSex("1");
		userQueryVo.setUserCustom(userCustom);
		List<UserCustom> userCustoms = mapper.findUserList(userQueryVo);
		for(UserCustom u:userCustoms) {
			System.out.println(u.getUsername());
		}
	}
	
	@Test
	public void testfindUserListCount() {
		UserMapper mapper=(UserMapper) ac.getBean("userMapper");
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		userCustom.setUsername("张二明");

		userQueryVo.setUserCustom(userCustom);
		int count = mapper.findUserListCount(userQueryVo);
		System.out.println(count);
	}
	
	@Test
	public void testfindUserListbyOr() {
		UserMapper mapper=(UserMapper) ac.getBean("userMapper");
		UserQueryVo userQueryVo=new UserQueryVo();
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(16);
		ids.add(22);
		ids.add(24);
		ids.add(25);
		userQueryVo.setIds(ids);
		List<UserCustom> count = mapper.findUserListbyOr(userQueryVo);
		System.out.println(count);	
		
	}
	
	
	
	@Test
	public void testFindUserByIdCache2() {
		
		
	}
}
