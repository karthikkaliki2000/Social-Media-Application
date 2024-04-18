package com.example.SocialMediaApplication;

import java.util.Scanner;
//
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SocialMediaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	SpringApplication.run(SocialMediaApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Post post=(Post)context.getBean("simplePost");
		User user=(User) context.getBean("simpleUser");
		System.out.println("Social media app! Start");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=s.nextLine();
		user.setUserName(name);
		while(true) {
			//PostList postList=(PostList)context.getBean("simplePostList");//every time creates the same reference becoz its a singleton
			PostList postList=user.getPostList();
			System.out.println("1. make new post\n2. show all posts\n3. exit");
			int menu=s.nextInt();
			switch(menu) {
			case 1:{
				Post post=(Post)context.getBean("simplePost");//every time creates the new reference becoz its a prototype
				System.out.println("please enter a post");
				s.nextLine();
				String message=s.nextLine();
				post.setMessage(message);
				postList.setPost(post);
				break;
			}
			case 2:{
				System.out.println("All the posts!");
				for(int i=0;i<postList.size();i++) {
					System.out.println(i+") "+user.getUserName()+" "+postList.getPost(i).getMessage());
				}
				break;
			}
			case 3:{
				break;
			}
			default:System.out.println("Wrong option please select correct option only");
			}
			if(menu==3) {
				break;
			}
		}
	//	s.close();
//		context.close();
		
	}

}
