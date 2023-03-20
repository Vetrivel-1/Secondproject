package com.onesoft.day15;

public class Laptop {
String brand;
int price;
 String colour;
int Model;
boolean isWarranty;
   
  public Laptop(String brand,int price,String colour,int Model ,boolean isWarranty) {
    this.brand=brand;
    this.colour=colour;
    this.Model=Model;
    this.isWarranty=isWarranty;
    	
    }
      public void setBrand(String brand) {
    	  this.brand=brand;
      }
      public String getBrand() {
    	  return brand;
      }
      public void setColour(String colour) {
    	  this.colour=colour;
    	  
      }
      public String getColour() {
    	  return colour;
      }
      public void setModel(int Model) {
    	  this.Model=Model;
      }
       public int getModel() {
    	   return Model;
       }
       public void setWarranty(boolean isWarranty) {
    	   this.isWarranty=isWarranty;
       }
       public boolean getWarranty() {
    	   return isWarranty;
       }
       
      
    
    
    	
    	public String toString() {
    		return brand+" "+price+" "+colour+""+Model+" "+isWarranty+"";
    	}
    
    }
   
   
	



