package com.onesoft.day15;

public class UseCar {
	public static void main(String[]args) {
		Engine E=new Engine();
		E.setBrand("ford");
		E.setColour("white");
		E.setPrice(50000);
		
		Car c=new Car();
		c.setBrand("hyundai");
		c.setPrice(1000);
		c.setcolour("white");
		c.setEngine(E);
		
		System.out.println(c.getBrand()+ " "+c.getprice()+c.getcolour()+c.getEngine(E));
		
	}

}
