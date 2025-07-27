package com.subodh.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subodh.SpringBeans.Student;

public class Main {

	public static void main(String[] args) {
		String config_location="com/subodh/cfg/applicationContext.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(config_location);
		Student std=(Student) ctx.getBean("stdid");
		std.display();

	}

}
