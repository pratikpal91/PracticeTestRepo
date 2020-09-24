package com.basicProgram;

public class Cat extends Animal {

	@Override
	public void sleep() {
		System.out.println("cat sleep");
	}
	
	public static void eat()
	{
		System.out.println("cat animal");
	}
	
	
	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.eat();
		animal.sleep();
		
		
		System.out.println(15 & 2);
	}
}
