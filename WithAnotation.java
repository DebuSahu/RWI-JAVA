package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithAnotation {
   
         public static void main( String[] args )
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            
            Employee2 emp2 = (Employee2) context.getBean("emp2",Employee2.class);
            System.out.println(emp2); 
        }
    
        
}
