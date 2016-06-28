package com.umetrip.mybatis.MybatisInAction.model;
/**  

 * Copyright © 2016 王思杰. All rights reserved.

 *

 * @Title: Article.java

 * @Prject: MybatisInAction

 * @Package: com.umetrip.mybatis.MybatisInAction.model

 * @Description: 与Article表相对应

 * @author: 王思杰  

 * @date: 2016年6月28日 下午8:54:34

 * @version: V1.0  

 */
public class Article {
	private int id;
	private User user;
    private String title;
    private String content;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("[").append("articleId=").append(id)
				.append(";user=").append(user).append(";title=").append(title)
				.append(";content=").append(content).append("]").toString();
	}
}
