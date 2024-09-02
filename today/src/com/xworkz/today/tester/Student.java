package com.xworkz.today.tester;

public class Student {

	    String name;
	    int age;
	    String course;
	    int year;

	    public Student() {
	    	
	    	System.out.println("no args");
	    }

	    public Student(String name, int age)
	    {
	    	this();
	    	this.name=name;
	    	this.age=age;
	    	System.out.println("two args");

	    	
	    }

	    public Student(String name, int age, String course)
	    {
	    	this("name",20);
	    	this.name=name;
	    	this.age=age;
	    	this.course=course;
	    	System.out.println("three args");

	    	
	    }

	    public Student(String name, int age, String course, int year) 
	    {
	    	this("santosh",24,"Mca");
	        this.name = name;
	        
	        this.age = age;
	        this.course = course;
	        this.year = year;
	    	System.out.println("all args");

	    }
	}

