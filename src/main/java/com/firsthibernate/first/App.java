package com.firsthibernate.first;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	System.out.println(sessionFactory);
    	System.out.println("hello world");
    	System.out.println(sessionFactory.isOpen());
    }
}
