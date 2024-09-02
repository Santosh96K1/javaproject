package com.xworkx.Project.projectcollege;
import com.xworkx.Project.projectcollege.College;
public class Tester {

	public static void main(String[] args) {

		
	    
	    
		
		College myCollege = new College("Presidency  College", "bangalore", 2001, "Dr.pradeep", 10, 3000, true, 15000.00);
		
		College.age=20;
		College.studentName="Santosh";
		College.price=20000;
		College.collName="Presidency college";
		College.Pin=560024;
		College.area="hebbal";
		
		        myCollege.displayCollegeDetails();
		       // College.displayCollegeDetails();

		       
		}
}
