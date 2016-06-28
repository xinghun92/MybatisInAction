package com.umetrip.mybatis.MybatisInAction.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  

 * Copyright © 2016 王思杰. All rights reserved.

 *

 * @Title: BaseTestCase.java

 * @Prject: MybatisInAction

 * @Package: com.umetrip.mybatis.MybatisInAction.test

 * @Description: TODO

 * @author: 王思杰  

 * @date: 2016年6月28日 下午9:36:30

 * @version: V1.0  

 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationTestContext.xml")
public class BaseTestCase extends AbstractJUnit4SpringContextTests{
	@Test
	public void test1(){
		
	}
}
