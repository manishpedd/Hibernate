package com.it.bankmodel;

import jakarta.persistence.Embeddable;

@Embeddable            //merge it into entity class
public class Mango {
	
	private String colors;
	private String variety;
	private int idz;
	private int price;
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public int getIdz() {
		return idz;
	}
	public void setIdz(int idz) {
		this.idz = idz;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mango [colors=" + colors + ", variety=" + variety + ", idz=" + idz + ", price=" + price + "]";
	}
	
	

}
