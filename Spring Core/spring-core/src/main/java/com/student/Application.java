package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
 public static void main(String args[]) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	 Student st = (Student)context.getBean("s1");
	 System.out.println("Student Rollno : " +st.getRollNo());
     System.out.println("Student Name : " +st.getName());
 }
}
