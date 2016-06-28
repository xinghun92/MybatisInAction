package com.umetrip.mybatis.MybatisInAction;

import static org.junit.Assert.*;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.umetrip.mybatis.MybatisInAction.model.User;

/**
 * 
 * Copyright © 2016 王思杰. All rights reserved.
 *
 * 
 * 
 * @Title: UserTest.java
 * 
 * @Prject: MybatisInAction
 * 
 * @Package: com.umetrip.mybatis.MybatisInAction
 * 
 * @Description: TODO
 * 
 * @author: 王思杰
 * 
 * @date: 2016年6月28日 下午12:33:51
 * 
 * @version: V1.0
 * 
 */
public class UserTest {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void SelectTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			User user = (User) session.selectOne("com.umetrip.mybatis.MybatisInAction.model.UserMapper.selectUserByID", 1);
			System.out.println(user);
		} finally {
			session.close();
		}
	}
}
