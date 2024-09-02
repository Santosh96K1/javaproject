package co.xworkz.projectThree.college1;

public class Phone {
	
	    public String brand;
	    public String model;
	    public int storageCapacity;
	    public double price;
	    public String color;
	
	    public Phone() 
	    {
	    	System.out.println("no arguments");
	    }

	    public Phone(String brand) 
	    {
	        this.brand = brand;
	        System.out.println("barnd name "+brand);
	        System.out.println("barnd name "+model);
	        System.out.println("barnd name "+storageCapacity);
	        System.out.println("barnd name "+price);
	        System.out.println("barnd name "+color);
	    }


	    public Phone(String brand, String model) 
	    {
	        this.brand = brand;
	        this.model = model;
	        System.out.println("barnd name "+brand);
	        System.out.println("barnd name "+model);
	        System.out.println("barnd name "+storageCapacity);
	        System.out.println("barnd name "+price);
	        System.out.println("barnd name "+color);
	    }

	   public Phone(String brand, String model, int storageCapacity)
	    {
	        this.brand = brand;
	        this.model = model;
	        this.storageCapacity = storageCapacity;
	        System.out.println("barnd name "+brand);
	        System.out.println("barnd name "+model);
	        System.out.println("barnd name "+storageCapacity);
	        System.out.println("barnd name "+price);
	        System.out.println("barnd name "+color);
	    }

	  public Phone(String brand,String model, int storageCapacity, double price)
	    {
	        this.brand = brand;
	        this.model = model;
	        this.storageCapacity = storageCapacity;
	        this.price = price;
	        System.out.println("barnd name "+brand);
	        System.out.println("barnd name "+model);
	        System.out.println("barnd name "+storageCapacity);
	        System.out.println("barnd name "+price);
	        System.out.println("barnd name "+color);
	    }
	  public Phone(String brand, String model, int storageCapacity, double price, String color) 
	    {
	        this.brand = brand;
	        this.model = model;
	        this.storageCapacity = storageCapacity;
	        this.price = price;
	        this.color = color;
	        System.out.println("barnd name "+brand);
	        System.out.println("barnd name "+model);
	        System.out.println("barnd name "+storageCapacity);
	        System.out.println("barnd name "+price);
	        System.out.println("barnd name "+color);
	    }
	}


