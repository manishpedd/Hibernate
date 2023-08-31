package com.bikkad.bank.Hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.it.bankmodel.Certificate;
import com.it.bankmodel.Student;

public class EmbedDemo {

	public static void main(String[] args) {

		Configuration cfg1 = new Configuration();
		cfg1.configure("hibernate.cfg.xml");// ADD HIBERNATE CONFIGURATION FILE

		SessionFactory Factory = cfg1.buildSessionFactory();// CREATE SESSION FACTORY contains
		// open session method

		Session Session = Factory.openSession(); // Create sessions
		
		

    	//CREATE TABLE
    	Student st = new Student();
    	st.setId(106);
        st.setName("Ramesh");
        st.setEmail("ramesh@gmail.com");
        st.setDept("ct");
        
        Certificate cert = new Certificate();
        cert.setCourse("java");
        cert.setDuration("1 month");
        
        st.setCert(cert);
        

        Transaction txt= Session.beginTransaction();//Initialize transaction in db
        Session.save(st);//save transaction  
        txt.commit();
        Session.close();
        
        

	}
}