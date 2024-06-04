package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithoutAnnotation {
     public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bea.xml");
        
        Employee1 emp1 = (Employee1) context.getBean("emp1",Employee1.class);
        System.out.println(emp1); 
    }
}
