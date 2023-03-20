 package com.onesoft.day15;

  public class Coil {		
     class coil{
	private	String brand;
	private int price;
    private String weight;
	


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

  public void setWeight(String weight) {
	  this.weight=weight;
  }
  public String getweight() {
	  return weight;
  }
  public coil(String brand,int price,String weight) {
	  this.brand=brand;
	  this.price=price;
	  this.weight=weight;
  }
  
  public String toString() {
	  return "brand"+brand+"Price"+price+"Weight"+weight;
	  
  }
  class Fan{
	  private	String brand;
		private int price;
		private int  noOfWings;
		private coil coil;

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

		  public void setNoFwings(int noOfWings) {
			  this.noOfWings=noOfWings;
		  }
		  public int getNoOFwings() {
			  return noOfWings;
		  }
		  public void setCoil(Coil coil) {
			  this.coil=coil;
		  }
		  public coil getCoil() {
			  return coil;
		  }
		  public Fan(String brand,int price,int noOfWings,Coil coil) {
			  this.brand=brand;
			  this.price=price;
			  this.noOfWings=noOfWings;
			  this.coil=coil;
		  }
	}

}
