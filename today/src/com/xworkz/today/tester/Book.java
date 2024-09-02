package com.xworkz.today.tester;

public class Book {
	
	    String title;
	    String author;
	    int pages;
	    double price;

	    public Book() {
	        this("java","abc");  
	        System.out.println("no args passing");

	    }

	    public Book(String title, String author) {
	        this("python","Abc",2);  
	    	this.title=title;
	    	this.author=author;
	        System.out.println("two args passing");

	    }

	    public Book(String title, String author, int pages) {
	        //this("python","Abc",2,1200.0); 
	        this.title=title;
	        System.out.println("thre args passing");

	    }

	    public Book(String title, String author, int pages, double price) {
	    	this();
	        this.title = title;
	        this.author = author;
	        this.pages = pages;
	        this.price = price;
	        System.out.println("all args passing");

	    }
	}


