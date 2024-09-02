package com.xworkx.Project.projectPhone;

public class Phone {
	
	    String brand ;
	    String model;
	    int storageCapacity; 
	    int ram; 
	    double screenSize; 
	    int batteryCapacity; 
	    boolean has5GSupport;
	    double price;

	    public Phone(String brand, String model, int storageCapacity, int ram, double screenSize, int batteryCapacity, boolean has5GSupport, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.storageCapacity = storageCapacity;
	        this.ram = ram;
	        this.screenSize = screenSize;
	        this.batteryCapacity = batteryCapacity;
	        this.has5GSupport = has5GSupport;
	        this.price = price;
	    }

	    void displayPhoneDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Storage Capacity: " + storageCapacity + " GB");
	        System.out.println("RAM: " + ram + " GB");
	        System.out.println("Screen Size: " + screenSize + " inches");
	        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
	        System.out.println("5G Support: " + (has5GSupport ? "Yes" : "No"));
	        System.out.println("Price: " + price);
	    }
	}

	
	


