package com.xworkz.projectThree.book;
import  java.time.LocalDate;
public class Think {

	public String thinking;
	 
	public Think()
	{
		System.out.println("no args constructer");
	}
	public Think(String thinking) 
	
	{
		this();
		System.out.println("one args constructer");
	}
	
	public void getThinkDetails()
	{
		System.out.println("Yes i am thinking");
	}
	public String thinkType()
	{
		System.out.println("Yes i am thinking now");
		return "yes";
		

	}
	public LocalDate getDate(LocalDate date)
	{
		System.out.println( "todays date");
		return date;
	}
}
