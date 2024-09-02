package com.xworkx.shop.Socil;
import com.xworkx.shop.Socil.Socil;
public class SocilTester {

	public static void main(String[] args) {
     System.out.println("main method started");
     Socil soc= new Socil("insta", 100, "Santu", "yes", "yes");
    String  a =soc.getIdName();
    System.out.println(a);
	}

}
