package com.xworkx.Project.projectLibrary;

public class Library {
	
	    String libraryName ="College";
	    String location="Bangalore";
	    int establishedYear=2001;
	    int numberOfBooks=50000;
	    int numberOfStaff=50;
	    boolean hasDigitalLibrary=true;
	    double membershipFee=600;
	    String librarianName="Dr Ram";
	    
	    public static int  age;
	    public static String studentName;
	    public static int price;
	    public static String collName;
	    public static int Pin;
	    public static String area;

	    public Library(String libraryName, String location, int establishedYear, int numberOfBooks, int numberOfStaff, boolean hasDigitalLibrary, double membershipFee, String librarianName) {
	        this.libraryName = libraryName;
	        this.location = location;
	        this.establishedYear = establishedYear;
	        this.numberOfBooks = numberOfBooks;
	        this.numberOfStaff = numberOfStaff;
	        this.hasDigitalLibrary = hasDigitalLibrary;
	        this.membershipFee = membershipFee;
	        this.librarianName = librarianName;
	    }

	    void displayLibraryDetails() {
	        System.out.println("Library Name: " + libraryName);
	        System.out.println("Location: " + location);
	        System.out.println("Established Year: " + establishedYear);
	        System.out.println("Number of Books: " + numberOfBooks);
	        System.out.println("Number of Staff: " + numberOfStaff);
	        System.out.println("Digital Library: " + (hasDigitalLibrary ? "Yes" : "No"));
	        System.out.println("Membership Fee: " + membershipFee);
	        System.out.println("Librarian Name: " + librarianName);
	        System.out.println("____________________________________");
	        System.out.println(libraryName);
	        System.out.println(location);
	        System.out.println(establishedYear);
	        System.out.println(numberOfBooks);
	        System.out.println(numberOfStaff);
	        System.out.println((hasDigitalLibrary ? "Yes" : "No"));
	        System.out.println(membershipFee);
	        System.out.println(librarianName);
	    }
	}

	


