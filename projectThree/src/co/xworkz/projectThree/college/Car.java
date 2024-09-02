package co.xworkz.projectThree.college;

public class Car {
public String carName;
public int car;
public int carPrice;
public int  avg;
public String color;

public Car()
{
	System.out.println("this no args value");
}
public Car(String carName)

{
	this.carName=carName;
	//this.carNumber=carNumber;
	//this.carPrice=carPrice;
	System.out.println("this one args value");
	System.out.println("print the car name "+carName);
	System.out.println("print the car name "+car);
	System.out.println("print the car name "+carPrice);
	System.out.println("print the car name "+avg);
	System.out.println("print the car name "+color);
		
}
public Car(String carName,int car)
{
	this.carName=carName;
	this.car=car;
	//this.carPrice=carPrice;
	
	
	System.out.println("this two args value");
	System.out.println("print the car name "+carName);
	System.out.println("print the car name "+car);
	System.out.println("print the car name "+carPrice);
	System.out.println("print the car name "+avg);
	System.out.println("print the car name "+color);
		
}
public Car(String carName,int car,int carPrice)
{
	this.carName=carName;
	this.car=car;
	this.carPrice=carPrice;
	//this.avg=avg;
	//this.color=color;
	System.out.println("this three args value");
	System.out.println("print the car name "+carName);
	System.out.println("print the car name "+car);
	System.out.println("print the car name "+carPrice);
	System.out.println("print the car name "+avg);
	System.out.println("print the car name "+color);
		
}
public Car(String carName,int car,int carPrice,int avg)
{
	this.carName=carName;
	this.car=car;
	this.carPrice=carPrice;
	this.avg=avg;
	//this.color=color;
	System.out.println("this four args value");
	System.out.println("print the car name "+carName);
	System.out.println("print the car name "+car);
	System.out.println("print the car name "+carPrice);
	System.out.println("print the car name "+avg);
	System.out.println("print the car name "+color);
		
}
public Car(String carName,int car,int carPrice,int avg,String color)
{
	this.carName=carName;
	this.car=car;
	this.carPrice=carPrice;
	this.avg=avg;
	this.color=color;
	System.out.println("this five args value");
	System.out.println("print the car name "+carName);
	System.out.println("print the car name "+car);
	System.out.println("print the car name "+carPrice);
	System.out.println("print the car name "+avg);
	System.out.println("print the car name "+color);
		
}


}
