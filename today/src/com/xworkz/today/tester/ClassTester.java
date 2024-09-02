package com.xworkz.today.tester;
import com.xworkz.today.tester.Student;
import com.xworkz.today.tester.Car;
import com.xworkz.today.tester.Book;
import com.xworkz.today.tester.Employee;

public class ClassTester {

	public static void main(String[] args) {
        System.out.println("=================================");

		Student student1 = new Student();
        Student student2 = new Student("santosh", 20);
        Student student3 = new Student("John", 20, "CS");
        Student student4 = new Student("John", 20, "CS", 2);
        System.out.println("=================================");

        Car car1 = new Car("bmw");
        Car car2 = new Car("bmw", "x7");
        Car car3 = new Car("Toyota", "x7", 2020);
        Car car4 = new Car("Toyota", "x7", 2020, "Blue");
        System.out.println("=================================");

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("bmw",20);
        Employee emp3 = new Employee("Toyota",20,"x7");
        Employee emp4 = new Employee("Toyota", 2020,"x7",2023);



       
        System.out.println("=================================");

        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "Author A");
        Book book3 = new Book("Java Basics", "Author A", 300);
        Book book4 = new Book("Java Basics", "Author A", 300, 29.99);

    }
		
	}


