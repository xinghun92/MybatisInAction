package com.umetrip.mybatis.MybatisInAction.test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
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
 * @Title: UserTest.java
 * 
 * @Prject: MybatisInAction
 * 
 * @Package: com.umetrip.mybatis.MybatisInAction.test
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
	private SqlSession session;
	private IUserOperation userOperation;
	

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Before
	private void openSession(){
		session=sqlSessionFactory.openSession();
		userOperation=session.getMapper(IUserOperation.class);
	}
	
	@After
	private void closeSession(){
		session.close();;
	}

//	@Test
//	public void SelectTest() {
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			User user = session.selectOne("com.umetrip.mybatis.MybatisInAction.model.UserMapper.selectUserByID", 1);
//			System.out.println(user);
//			List<User> users = session.selectList("com.umetrip.mybatis.MybatisInAction.model.UserMapper.selectAll");
//			System.out.println(users);
//		} finally {
//			session.close();
//		}
//	}
	
	@Test
	public void selectTest(){
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
	
	@Test
	public void addTest(){
            User user = new User();
            user.setAge(20);
            user.setName("大毛");
            user.setAddress("毛毛之家");
            userOperation.addUser(user);
            session.commit();
            System.out.println("addUser");
            System.out.println(user);
	}
	
	@Test
	public void updateTest(){
            User user = new User();
            user.setId(7);
            user.setAge(20);
            user.setName("毛毛爸");
            user.setAddress("毛毛之家");
            userOperation.updateUserById(user);
            session.commit();
            System.out.println("updateUserById");
            System.out.println(user);
	}
	
	@Test
	public void deleteTest(){
			int id = 7;
            IUserOperation userOperation=session.getMapper(IUserOperation.class);
            userOperation.deleteUserById(id);
            session.commit();
            System.out.println("deleteUserById-->selectUserByID");
            User user = userOperation.selectUserByID(id);
            System.out.println(user);
	}
}
