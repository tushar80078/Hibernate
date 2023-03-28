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
	        
	        Student st=new Student();
	        st.setId(3);
	        st.setName("Akkshay");
	        st.setCity("name");
	        
	        Certificate ct=new Certificate();
	        ct.setCourse("java");
	        ct.setDuration("2mon");
	        
	        st.setCerti(ct);
	        
	        s.save(st);
	        tr.commit();
	        
	        
	    }
}
