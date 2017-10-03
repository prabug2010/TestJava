package com.java.inheritance.code;

public class OverloadingExample {
  
		  void sum(int a,long b){System.out.println("a method invoked");}  
		  void sum(long a,int b){System.out.println("b method invoked");}  
		  void sum(long a,long b){System.out.println("c method invoked");}  
		  void sum(int a,int b){System.out.println("c method invoked");}  
		  
		  public static void main(String args[]){  
			  OverloadingExample obj=new OverloadingExample();  
		//  obj.sum(20,20);//now
			  obj.s(12, 11);
			  obj.sum(20, 20);
			  obj.s(12l,11);
			  obj.s(12, 10);
			  
		  }  
		  void s(int a,int b){System.out.println("int arg method invoked");}  
		  void s(long a,long b){System.out.println("long arg method invoked");}  
		  void s(long a,int b){System.out.println("long/int arg method invoked");}  
		  
		  
		}  