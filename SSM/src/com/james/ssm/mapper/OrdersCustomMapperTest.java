package com.james.ssm.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.james.ssm.po.Orders;
import com.james.ssm.po.OrdersCustom;
import com.james.ssm.po.User;



public class OrdersCustomMapperTest {
	SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() {
		String resource = "mybatis-config.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindOrdersUser() {

		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrdersCustomMapper mapper=sqlSession.getMapper(OrdersCustomMapper.class);
		List<OrdersCustom> ou = mapper.findOrdersUser();
		for(OrdersCustom ordersCustom:ou) {
			System.out.println(ordersCustom.getUsername());
		}
		
	}
	
	@Test
	public void testOrdersUserResultMap() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrdersCustomMapper mapper = sqlSession.getMapper(OrdersCustomMapper.class);
		List<Orders> ou = mapper.findOrderUserByresultMap();
		for(Orders orders:ou) {
			System.out.println(orders.getId());
		}
	}
	@Test/*Ò»¶Ô¶à*/
	public void testOrderUserDetailResultMap() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrdersCustomMapper mapper = sqlSession.getMapper(OrdersCustomMapper.class);
		List<Orders> ou = mapper.findOrderUserOrderDetailByresultMapO2M();
		for(Orders orders:ou) {
			System.out.println(orders.getId());
		}
	}
	@Test
	public void testfindUserAndItemsByM2MresultMap() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrdersCustomMapper mapper = sqlSession.getMapper(OrdersCustomMapper.class);
		List<User> users = mapper.findUserAndItemsByM2M();
		for(User u:users) {
			System.out.println(u.getUsername());
		}
	}
	
	@Test/*lazyloading*/
	public void testfindOrderLazyUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrdersCustomMapper mapper = sqlSession.getMapper(OrdersCustomMapper.class);
		List<Orders> ou = mapper.findOrderLazyUser();
		for(Orders o:ou) {
			System.out.println("ORDER ID:"+o.getId());
			System.out.println("UserName:"+o.getUser().getUsername());
		}
	}
}
