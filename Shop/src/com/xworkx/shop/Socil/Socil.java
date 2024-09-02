package com.xworkx.shop.Socil;

public class Socil {
    public String instagram;
    public int user;
    public String idName;
    public String photo;
    public String reels;
    
    
     public Socil(String instagram,int user,String idName,String photo,String reels)
     {
    	 this.instagram=instagram;
    	 this.user=user;
    	 this.idName=idName;
    	 this.photo=photo;
    	 this.reels=reels;
    	 
     } 
     public  String getIdName()
     {
    	 this.getSocil();
    	 return idName;
     }
     public void getSocil()
     {
    	 System.out.println(this.instagram);
    	 System.out.println(this.user);
    	 System.out.println(this.idName);

    	 System.out.println(this.photo);

    	 System.out.println(this.reels);


    	 
     }
}

