package com.xworkx.Project.projectThree;

public class Car {
	
	    String brand;
	    String model;
	    int year;
	    String color;
	    int engineCC;
	    int mileage;
	    double price;
	    boolean isElectric;

	    public Car(String brand, String model, int year, String color, int engineCC, int mileage, double price, boolean isElectric) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	        this.engineCC = engineCC;
	        this.mileage = mileage;
	        this.price = price;
	        this.isElectric = isElectric;
	    }

	    void displayCarDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	        System.out.println("Color: " + color);
	        System.out.println("Engine CC: " + engineCC);
	        System.out.println("Mileage: " + mileage + " km/l");
	        System.out.println("Price: " + price);
	        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
	    }
	}

	


