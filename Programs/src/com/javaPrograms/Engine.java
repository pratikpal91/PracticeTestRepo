package com.javaPrograms;

public class Engine {
	
	int val;
	String name;
	double sal;

	protected Engine(int val, String name, double sal)
	{
		System.out.println("Base constructor called");
		
		this.val = val;
		this.name = name;
		this.sal = sal;	
	}
	
	protected void work()
	{
		System.out.println("start engine");
		
	}

}


