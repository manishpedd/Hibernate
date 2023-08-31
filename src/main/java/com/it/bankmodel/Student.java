package com.it.bankmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


//MODEL CLASS OR POJO CLASS - plain old Java objects
@Entity
//entity annotation creates table in database
@Table(name= "Student info")
//Is used to create table table according to our choice
public class Student {
    @jakarta.persistence.Id  //sets that field as primary key
   
	private int id;
	private String name;
	@Column(name="department")       //can set column name according to our choice
	@Transient                       //to keep the field empty
	@Lob                             //To create large size file
	private String dept;
  
	public Certificate getCert() {
		return cert;
	}
	public void setCert(Certificate cert) {
		this.cert = cert;
	}
	private Certificate cert;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + "]";
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;

}
