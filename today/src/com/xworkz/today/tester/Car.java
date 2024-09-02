package com.xworkz.today.tester;

public class Car {

	
	    String make;
	    String model;
	    int year;
	    String color;

	    public Car(String make) {
	        //this("bmw"); 
	        this.make=make;
	        System.out.println("no args passing");

	    }

	    public Car(String make, String model) {
	    	//this("bmw","x7");
	    	this.make=make;
	    	this.model=model;
	        System.out.println("two args passing");
	    }

	    public Car(String make, String model, int year) {
	    	this("bmw","x7",2001,"black");
	    	this.make=make;
	    	this.model=model;
	    	this.year=year;
	        System.out.println("three args passing");

	    }

	    public Car(String make, String model, int year, String color) {
	    	//this()
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	        System.out.println("no args passing");

	    }
	}
	
	

