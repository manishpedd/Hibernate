package com.bikkad.bank.Hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.it.bankmodel.Student;

public class Retrieval {
	private static String email;

	// 1st step ADD HIBERNATE CONFIGURATION FILE
	// 2nd step CREATE SESSION FACTORY
	// 3RD STEP CREATE SESSIONS
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	
	
	  Configuration cfg = new Configuration();
	  cfg.configure("hibernate.cfg.xml");//ADD HIBERNATE CONFIGURATION FILE
	  
	  SessionFactory Factory = cfg.buildSessionFactory();// CREATE SESSION FACTORY
       Session Session = Factory.openSession();      //Create sessions
     
       
       //DATA RETRIEVAL OR READ
       
      Student student = Session.get(Student.class, 105);//Gets id 105 from class student
       System.out.println(student.getName());
       String email = student.getEmail();
       System.out.println(email);
       System.out.println(student);
       //Get method is used when not sure about presence of data
       
       //Alternate method instead of get it is out dated method
       Student student1= Session.load(Student.class, 101); 
       System.out.println(student1.getName());
       
       
       //Load method is used when we are 100 percent sure that data is present
       
       
       //New method
     //  Student reference = Session.getReference(Student.class, 101);
     //  System.out.println(reference.getName());
       
       //System.out.println(student1);
       //System.out.println(reference);
      
       Session.close();
       Factory.close();
       
       
       
}
}