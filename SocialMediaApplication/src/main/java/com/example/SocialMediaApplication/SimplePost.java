package com.example.SocialMediaApplication;

public class SimplePost implements Post{
	String message;
	public void init() {
		System.out.println("Simple Post is Created");
	}
	public void destroy() {
		System.out.println("Simple POst destroyed");
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}

}
