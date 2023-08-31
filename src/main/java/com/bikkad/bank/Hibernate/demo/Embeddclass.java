package com.bikkad.bank.Hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.it.bankmodel.Fruit;
import com.it.bankmodel.Mango;

public class Embeddclass {
	public static void main(String[] args) {
	
		 Configuration cfg = new Configuration();
		  cfg.configure("hibernate.cfg.xml");//ADD HIBERNATE CONFIGURATION FILE
		  
  SessionFactory Factory = cfg.buildSessionFactory();// CREATE SESSION FACTORY contains 
  //open session method
  Session Session = Factory.openSession();      //Create sessions
  
     Fruit fr = new Fruit();
     fr.setId(126);
     fr.setColor("saffron");
     fr.setName("orange");
     fr.setRate(80);
     
     
     Mango m = new Mango();
     m.setColors("yellow");
     m.setIdz(106);
     m.setPrice(90);
     m.setVariety("hapus");
     fr.setMango1(m);
     
     Transaction txt= Session.beginTransaction();//Initialize transaction
     Session.save(fr);//save transaction  
     txt.commit();
     Session.close();
     
     
	     
		
		
		
		
		
		
		
		
	}

}
