package co.xworkz.projectThree.college;
import co.xworkz.projectThree.college.Car;
public class CarTester {

	public static void main(String[] args)
	{
       Car car = new Car();
       System.out.println("==========================================");
       Car car1 = new Car("BMWX7");
       System.out.println("==========================================");

       Car car2 = new Car("BMWX7",10);
       System.out.println("==========================================");

       Car car3 = new Car("BMWX7",2001,12700000); 
       System.out.println("==========================================");

       Car car4 = new Car("BMWX7",2001,12700000,10); 
       System.out.println("==========================================");

       Car car5 = new Car("BMWX7",2001,12700000,10,"black");
       
	}

}

