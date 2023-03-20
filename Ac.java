package com.onesoft.day15;

 public class Ac {
 String brand;
  boolean isAutomatic;

 private int price; 
 private Compressor compresssor;
 private Compressor compressor;


public Ac(String brand,int price,boolean isAutomatic,Compressor compressor) {
	  this.brand=brand;
	  this.price=price;
	  this.isAutomatic=isAutomatic;
	  this.compresssor=compresssor;
	  
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
	  return getPrice();
}

public void setISautomatic(boolean isAutomatic) {
	  this.isAutomatic=isAutomatic;
}
public boolean getIsAutomatic() {
	  return isAutomatic;
}
public void setCompressor(Compressor compressor){
	this.compresssor=compresssor;
}
public Compressor getCompressor() {
	
	return compressor;
}
public String toString() {
	return brand+""+price+""+isAutomatic+""+compresssor;
}
}
