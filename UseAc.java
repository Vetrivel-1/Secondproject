package com.onesoft.day15;

public class UseAc {
   public static void main(String[]args) {
	  String []x=args[0].split(",");
	 String a=x[0];
	 int b=Integer.parseInt(x[1]);
	 float c=Float.parseFloat(x[2]);
	 Compressor compressor=new Compressor(a,b,c);
  String []y=args[1].split(",");
	   String s=x[0];
	   int t=Integer.parseInt(y[1]);
	   boolean d=Boolean.parseBoolean(y[2]);
	   Ac ac=new Ac(s,t,d,compressor);
	   System.out.println(ac);
	   
   }
}
