package com.onesoft.day15;

public class Car {
	private String brand;
	private int price;
	private String colour;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
		
	}
	public void setcolour(String colour) {
		this.colour=colour;
	}
	public String getcolour() {
		return colour;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}

}
