package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sessionfac {
public static SessionFactory factory;

public static SessionFactory getfactory(){
	
	if(factory==null){
		Configuration cnf=new Configuration().configure("hibernate.cnf.xml");
		factory=cnf.buildSessionFactory();
		
		
	}
	return factory;
}
	public static  void closeFactory() {
		if(factory.isOpen()) {
			factory.close();
			
		}
	}

	
}

