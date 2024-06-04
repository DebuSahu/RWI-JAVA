package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {
     public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Res.xml");

        Student stu = (Student) context.getBean("details");
        stu.print(); 
    }
}
