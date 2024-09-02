package com.xworkz.projectThree.book;

public class Book {
	
	    private String title;
	    private String author;
	    private String publisher;
	    private int yearOfPublication;
	    private double price;

	    public Book() {

	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }

	    public Book(String title) {
	        this.title = title;
	        System.out.println("this one args value");
	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        System.out.println("this two args value");
	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }

	    public Book(String title, String author, String publisher) {
	        this.title = title;
	        this.author = author;
	        this.publisher = publisher;
	        System.out.println("this three args value");
	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }

	    public Book(String title, String author, String publisher, int yearOfPublication) {
	        this.title = title;
	        this.author = author;
	        this.publisher = publisher;
	        this.yearOfPublication = yearOfPublication;
	        System.out.println("this four args value");
	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }

	    public Book(String title, String author, String publisher, int yearOfPublication, double price) {
	        this.title = title;
	        this.author = author;
	        this.publisher = publisher;
	        this.yearOfPublication = yearOfPublication;
	        this.price = price;
	        System.out.println("this five args value");
	    	System.out.println("print the car name "+title);
	    	System.out.println("print the car name "+author);
	    	System.out.println("print the car name "+publisher);
	    	System.out.println("print the car name "+yearOfPublication);
	    	System.out.println("print the car name "+price);
	    }
	}

