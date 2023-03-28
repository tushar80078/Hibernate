package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sc=sf.openSession();
    	Transaction tr=sc.beginTransaction();
    	
    	Student st=new Student();
    	
    	st.setId(2);
    	st.setName("ravi");
    	st.setCity("ph");
    	
    	sc.save(st);
    	tr.commit();
    	
    	System.out.println("Completed");
        
    }
}
