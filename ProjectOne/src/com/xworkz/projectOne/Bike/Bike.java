package com.xworkz.projectOne.Bike;

public class Bike {
	    int dist;
	    double no ;
	    String name;
	    boolean oil;
	    char serices;
	    long price ;
	    float petrolPrice;
	    byte passing;
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.dist=10;
		bike.no=1001l;
		bike.name="Kawasaki Ninja10r";
		bike.oil=true;
		bike.serices='A';
		bike.price=1400000;
		bike.petrolPrice=100.0f;
		bike.passing=39;
		System.out.println("literal:"+bike.dist);
		System.out.println("bike no:"+bike.no);
		System.out.println("bikename:"+bike.name);
		System.out.println("bikeole type:"+bike.oil);
		System.out.println("bikeserice type:"+bike.serices);
		System.out.println("bike price type:"+bike.price);
		System.out.println("bike petrotal  type:"+bike.petrolPrice);
		System.out.println("bike passing type:"+bike.passing);

		
		
		
		
		
	}

}
