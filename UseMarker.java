package com.onesoft.day15;

public class UseMarker {
	public static void main(String[]args) {
		Refill r=new Refill();
		r.brand="cello";
		r.price=10;
		r.colour="black";
		
		 Marker m=new Marker();
		 m.brand="reunolds";
		 m.price=70;
		 m.colour="wihte";
		 m.refill=r;
		 System.out.println(m.brand+" "+m.price+" "+m.colour+" "+ m.refill.brand+" "+m.refill.price+" "+m.colour+"");
		
		
		
		
		
		
	}

}
