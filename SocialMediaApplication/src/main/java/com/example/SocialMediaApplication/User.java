package com.example.SocialMediaApplication;

public interface User {
	public void setUserName(String userName);
	public String getUserName();
	public PostList getPostList();
	public void setPostList(PostList postList);
}
