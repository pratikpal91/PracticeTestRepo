package com.design.pattern.examples;

public class EmployeeRecord implements Prototype{
	
	private String name, id , address;
	private double salary ;

	public EmployeeRecord() {
	
		System.out.println("***Employee Records Of Company***");
		System.out.println("==================================");
		System.out.println("Name \t  id \t address \t salary ");
	}	
	
	public EmployeeRecord(String name, String id , String address , double salary)
	{
		this();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;		
	}

	@Override
	public Prototype getClone() {
		
		return new EmployeeRecord(name, id, address, salary);
	}
	
	public void displayRecord()
	{
		System.out.println(name+ "\t" + id+ "\t"+address+"\t"+salary);
		
	}
	
	
}
