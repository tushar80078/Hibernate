package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

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
	public static void main(String[] args) throws IOException 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		Address ad=new Address();
		ad.setStreet("dont");
		ad.setCity("pune");
		ad.setX(10.3);
		ad.setAddedDate(new Date());
		ad.setOpen(true);
		
		FileInputStream fis=new FileInputStream("src/main/java/emp.png");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		
		ad.setImg(data);
		
		s.save(ad);
		tr.commit();
		
		System.out.println("Done");
		
	}

}
