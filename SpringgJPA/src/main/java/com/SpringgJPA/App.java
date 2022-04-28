package com.SpringgJPA;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.SpringgJPA");
        appContext.refresh();
        
        CustomerService c = (CustomerService) appContext.getBean("c");
        c.test();
        appContext.close();
    }
}
