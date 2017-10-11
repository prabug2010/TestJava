package com.alti.test;


class Bike{  
	  void run(){System.out.println("running");}  
	 
void ran()
{
	System.out.println("running now");
}
}
	class Splender extends Bike{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Splender b = new Splender();//upcasting  
	    b.run();  
	    b.ran();
	    
	    
	  }  
	}  