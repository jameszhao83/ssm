package com.james.ssm.mapper;

import java.util.List;

import com.james.ssm.po.Orders;
import com.james.ssm.po.OrdersCustom;
import com.james.ssm.po.User;


public interface OrdersCustomMapper {
public List<OrdersCustom> findOrdersUser();

public List<Orders> findOrderUserByresultMap();

public List<Orders> findOrderUserOrderDetailByresultMapO2M();
public List<User> findUserAndItemsByM2M();


public List<Orders> findOrderLazyUser();
}
