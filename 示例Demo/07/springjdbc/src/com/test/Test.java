package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.entity.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao=(UserDao)ctx.getBean("userDao");
		User u=userDao.get(4);
		System.out.println(u.getNickName());
	}

}
