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
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();
        
        //Creating first  Question
        Question q=new Question();
        q.setQuestionId(1);
        q.setQuestion("What is your name");
        
        
        //Creating answer of first question
        Answer a=new Answer();
        a.setAnswerId(11);
        a.setAnswer("Tushar");
        a.setQuestion(q);
        
        q.setAnswer(a);

        
        //Creating second question
        Question q2=new Question();
        q2.setQuestionId(2);
        q2.setQuestion("What is your city");
        
        
        //Creating answer of first question
        Answer a2=new Answer();
        a2.setAnswerId(12);
        a2.setAnswer("Phaltan");
        a2.setQuestion(q2);
        
        q2.setAnswer(a2);
        
        s.save(q);
        s.save(a);
        s.save(q2);
        s.save(a2);
        
        tr.commit();
        
        
        Question q3=(Question)s.get(Question.class, 1);
        Answer a3=(Answer)s.get(Answer.class, 11);
        
        System.out.println(q3.getQuestion());
        System.out.println(a3.getAnswer());
     

    
    }
}
