package com.bikkad.bank.Hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.it.bankmodel.Student;

/**
 * Hello world!
 *
 */
public class App 
// 1st step ADD HIBERNATE CONFIGURATION FILE
// 2nd step CREATE SESSION FACTORY
// 3RD STEP CREATE SESSIONS
{
    public static void main( String[] args )
    {
   
     Configuration cfg = new Configuration();//It is a class
     cfg.configure("hibernate.cfg.xml");//ADD HIBERNATE CONFIGURATION FILE
     
     SessionFactory Factory = cfg.buildSessionFactory();// CREATE SESSION FACTORY
     //Above code will create session factory object and return it
    	Session Session = Factory.openSession();//CREATE SESSIONS
    	//above code will create session object and establish connection
    	//with database
    	
    	//CREATE TABLE
    	Student st = new Student();
    	st.setId(106);
        st.setName("Ramesh");
        st.setEmail("ramesh@gmail.com");
        st.setDept("ct");
        Transaction txt= Session.beginTransaction();//Initialize transaction
        Session.save(st);//save transaction
        
        txt.commit();
        Session.close();
        
        
        
    
    }
}