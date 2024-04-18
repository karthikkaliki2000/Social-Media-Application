package com.example.SocialMediaApplication;

import java.util.ArrayList;

public interface PostList {
	ArrayList<Post> postList=new ArrayList();
	public Post getPost(int i);
	public ArrayList<Post> getAllPosts();
	public void setPost(Post post);
	public int size();
	
}
