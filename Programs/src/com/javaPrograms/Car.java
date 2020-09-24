package com.javaPrograms;


final class Car {
	
	String dept;
	String skillSet;
	int val;
	private final Engine engine;
	
	public Car(String dept, String skillSet, int val, String name, double sal) {
		System.out.println("Inherited consturctor is called");
		this.dept = dept;
		this.skillSet = skillSet;
		this.val = val;
		this.engine = new Engine(3, "BMW", 33.3);
		engine.work();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dept "+dept+ " skillSet "+skillSet+" val "+val;
	}
	
}
