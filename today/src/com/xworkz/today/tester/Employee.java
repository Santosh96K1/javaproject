package com.xworkz.today.tester;

public class Employee {

	    String name;
	    int age;
	    String work;
	    int joiningyear;

	    public Employee() {
	    	
	    	System.out.println("no args");
	    }

	    public Employee(String name, int age)
	    {
	    	this();
	    	this.name=name;
	    	this.age=age;
	    	System.out.println("two args");

	    	
	    }

	    public Employee(String name, int age, String course)
	    {
	    	this("name",20);
	    	this.name=name;
	    	this.age=age;
	    	this.work=work;
	    	System.out.println("three args");

	    	
	    }

	    public Employee(String name, int age, String course, int year) 
	    {
	    	this("santosh",24,"Mca");
	        this.name = name;
	        
	        this.age = age;
	        this.work = work;
	        this.joiningyear = joiningyear;
	    	System.out.println("all args");

	    }
	}

