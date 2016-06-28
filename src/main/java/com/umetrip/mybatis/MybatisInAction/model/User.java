package com.umetrip.mybatis.MybatisInAction.model;
/**  

 * Copyright © 2016 王思杰. All rights reserved.

 *

 * @Title: User.java

 * @Prject: MybatisInAction

 * @Package: com.umetrip.mybatis.MybatisInAction.model

 * @Description: 和Mysql中的user表对应

 * @author: 王思杰  

 * @date: 2016年6月28日 下午12:18:24

 * @version: V1.0  

 */
public class User {
	private int id;
	private int age;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("[").append("id=").append(id)
				.append(";name=").append(name).append(";age=").append(age)
				.append(";address=").append(address).append("]").toString();
	}
}
