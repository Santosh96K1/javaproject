package com.xworkx.Project.projectcollege;

public class College {
	
	    String collegeName="Presidency  College";
	    String location="bangalore";
	    int establishedYear=2001;
	    String principalName= "Dr.raj";
	    int numberOfDepartments=200;
	    int studentCapacity=90000;
	    boolean hasHostelFacility=true;
	    double annualFees=30000;
	     
	    public static int  age;
	    public static String studentName;
	    public static int price;
	    public static String collName;
	    public static int Pin;
	    public static String area;
	    
	    

	    	public College(String collegeName, String location, int establishedYear, String principalName, int numberOfDepartments, int studentCapacity, boolean hasHostelFacility, double annualFees) {
	        this.collegeName = collegeName;
	        this.location = location;
	        this.establishedYear = establishedYear;
	        this.principalName = principalName;
	        this.numberOfDepartments = numberOfDepartments;
	        this.studentCapacity = studentCapacity;
	        this.hasHostelFacility = hasHostelFacility;
	        this.annualFees = annualFees;
	    }

	    void displayCollegeDetails() {
	        System.out.println("College Name: " + collegeName);
	        System.out.println("Location: " + location);
	        System.out.println("Established Year: " + establishedYear);
	        System.out.println("Principal Name: " + principalName);
	        System.out.println("Number of Departments: " + numberOfDepartments);
	        System.out.println("Student Capacity: " + studentCapacity);
	        System.out.println("Hostel Facility: " + (hasHostelFacility ? "Yes" : "No"));
	        System.out.println("Annual Fees: " + annualFees);
	        System.out.println("------------------------");
	        System.out.println(collegeName);
	        System.out.println(location);
	        System.out.println(establishedYear);
	        System.out.println(principalName);
	        System.out.println(numberOfDepartments);
	        System.out.println(studentCapacity);
	        System.out.println((hasHostelFacility ? "Yes" : "No"));
	        System.out.println(annualFees);
	        System.out.println("------------------------");
	        System.out.println(age);
	        System.out.println(studentName);
	        System.out.println(price);
	        System.out.println(collName);
	        System.out.println(Pin);
	        System.out.println(area);
	        
	    
	    }
	}

	


