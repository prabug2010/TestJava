package com.java.inheritance.code;


	class Animal{  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends Animal{  
		void bark(){
			System.out.println("barking...");
			super.eat();
		}  
		}  
		
		class Puppy extends Dog
		{
			void puppy()
			{
				System.out.println("puppy barks and eats");
				
			}
			void bark()
			{
				System.out.println("puppy barking");
				super.bark();
				
			}
			void eat()
			{
				System.out.println("puppy eating");
				super.eat();
			}
		}
	public	class TestInheritance{ 
			
		public static void main(String args[])
		{  
		Dog d=new Dog();  
		d.bark();  
		d.eat(); 
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		}
		}  