package com.umetrip.mybatis.MybatisInAction.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.umetrip.mybatis.MybatisInAction.interfaces.IUserOperation;
import com.umetrip.mybatis.MybatisInAction.model.Article;
import com.umetrip.mybatis.MybatisInAction.model.User;

/**
 * 
 * Copyright © 2016 王思杰. All rights reserved.
 *
 * 
 * 
 * @Title: SpringTest.java
 * 
 * @Prject: MybatisInAction
 * 
 * @Package: com.umetrip.mybatis.MybatisInAction.test
 * 
 * @Description: TODO
 * 
 * @author: 王思杰
 * 
 * @date: 2016年6月28日 下午9:38:17
 * 
 * @version: V1.0
 * 
 */
public class SpringTest extends BaseTestCase {
	@Resource(name = "userMapper")
	private IUserOperation userOperation;

	@Test
	public void selectTest() {
		List<User> users = userOperation.selectAll();
		System.out.println("selectAll：");
		System.out.println(users);
		User user = userOperation.selectUserByID(1);
		System.out.println("selectUserByID:");
		System.out.println(user);
		List<User> usersbyname = userOperation.selectUsersByName("%e%");
		System.out.println("selectUsersByName:");
		System.out.println(usersbyname);
		List<Article> articles = userOperation.getUserArticles(1);
		System.out.println("getUserArticles");
		System.out.println(articles);
	}

}
