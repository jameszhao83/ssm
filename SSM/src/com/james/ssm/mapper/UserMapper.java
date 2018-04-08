package com.james.ssm.mapper;

import java.util.List;

import com.james.ssm.po.User;
import com.james.ssm.po.UserCustom;
import com.james.ssm.po.UserQueryVo;


public interface UserMapper {
	public User selectById(int id);
	public void insertUser(User user);
	public void deleteUserById(int id);
	public List<User> FindUserByName(String userName);
	public void updateUser(User user);
	public List<UserCustom> findUserList(UserQueryVo userQueryVo);
	public int  findUserListCount(UserQueryVo userQueryVo);
	
	public List<UserCustom> findUserListbyOr(UserQueryVo userQueryVo);
	
}
