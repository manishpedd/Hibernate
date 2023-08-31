package com.it.bankmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruit {
	private String color;
	private String name;
	
	@Id  //SETS ID AS PRIMARY KEY
	private int id;
	private int rate;
	private Mango mango1 ; //Created an instance of embeddable class in entity class
	
	public Mango getMango1() {
		return mango1;
	}
	public void setMango1(Mango mango1) {
		this.mango1 = mango1;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", name=" + name + ", id=" + id + ", rate=" + rate + ", mango1=" + mango1
				+ "]";
	}

	
	
	

}
