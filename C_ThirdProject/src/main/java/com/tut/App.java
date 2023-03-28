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
    	SessionFactory f=cfg.buildSessionFactory();
    	Session s=f.openSession();
    	Transaction tr=s.beginTransaction();
    	
    	Student st2=(Student)s.load(Student.class, 2);
    	
    	
    	Student st=(Student)s.get(Student.class, 2);
    	
    	
    	System.out.println(st.getCity());
    	System.out.println(st2.getCity());
    	System.out.println("Done");
    	
    	
    }
}
