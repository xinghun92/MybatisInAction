package com.umetrip.mybatis.MybatisInAction.interfaces;


import java.util.List;

import com.umetrip.mybatis.MybatisInAction.model.Article;
import com.umetrip.mybatis.MybatisInAction.model.User;

/**  

 * Copyright © 2016 王思杰. All rights reserved.

 *

 * @Title: IUserOperation.java

 * @Prject: MybatisInAction

 * @Package: com.umetrip.mybatis.MybatisInAction.interfaces

 * @Description: TODO

 * @author: 王思杰  

 * @date: 2016年6月28日 下午1:05:05

 * @version: V1.0  

 */
public interface IUserOperation {
//	列出所有用户
	public List<User> selectAll();
//	根据id查找用户
	public User selectUserByID(int id);
//	根据用户名查找用户，支持通配符
	public List<User> selectUsersByName(String name);
//	添加用户
	public void addUser(User user);
//	更新指定id用户信息
	public void updateUserById(User user);
//	删除指定id的用户的信息
	public void deleteUserById(int id);
	
//	联表查询，获得指定id用户的article
	public List<Article> getUserArticles(int userid);
}
