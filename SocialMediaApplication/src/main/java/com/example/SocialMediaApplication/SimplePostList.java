package com.example.SocialMediaApplication;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	ArrayList<Post> postList;
	
	public void init() {
		Post post=new SimplePost();
		post.setMessage("From DB");
		postList.add(post);
	}
	public void destroy() {
		System.out.println("Simple Post List destroyed");
	}
	public SimplePostList() {
		this.postList=new ArrayList<Post>();
	}
	@Override
	public Post getPost(int i) {
		// TODO Auto-generated method stub
		return this.postList.get(i);
	}

	@Override
	public void setPost(Post post) {
		// TODO Auto-generated method stub
		this.postList.add(post);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.postList.size();
	}
	@Override
	public ArrayList<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return this.postList;
	}

}
