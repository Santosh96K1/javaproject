package co.xworkz.projectThree.college1;
import com.xworkz.projectThree.book.Think;
public class ThinkTester {

	public static void main(String[] args) {
     Think th =new Think("yes");
     th.getThinkDetails();
     th.thinkType();
     System.out.println(th.getData(LocalDate.now()));
     
    		 
	}

}
