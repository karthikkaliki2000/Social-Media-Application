package com.example.SocialMediaApplication;

public class SimpleUser implements User {
	PostList postList;
	String userName;
	public void init() {
		System.out.println("Simple User is Created");
	}
	public void destroy() {
		//
	}
	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName=userName;

	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public PostList getPostList() {
		// TODO Auto-generated method stub
		return this.postList;
	}

	@Override
	public void setPostList(PostList postList) {
		// TODO Auto-generated method stub
		this.postList=postList;

	}

}
