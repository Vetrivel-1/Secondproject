package com.onesoft.day15;

public class Compressor {
	String brand;
	int price;
	 float capacity;
	 
	 public Compressor(String brand,int price,float capacity) {
		  this.brand=brand;
		  this.price=price;
		  this.capacity=capacity;
	  }
	  
	 
	 public void setBrand(String brand) {
		  this.brand=brand;
	  }
	  public String getBrand() {
		  return brand;
	  }
	  public void setPrice(int price) {
		  this.price=price;
		  
	  }
	  public int getPrice() {
		  return price;
	  }

	  public void setCapacity(float capacity) {
		  this.capacity=capacity;
	  }
	  public float getCapacity() {
		  return capacity;
	  }
	  public String toString() {
		  return brand+""+capacity+""+price+"";
	  }

}
