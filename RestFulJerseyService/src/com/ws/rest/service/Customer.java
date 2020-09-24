package com.ws.rest.service;

public class Customer {
	
	private String name;
	private int age;
	private String address;
	private boolean employment;
	
	
	public Customer(){}
	
	
	public Customer(String name, int age, String address, boolean employment)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.employment = employment;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
	}
	public boolean isEmployment() {
		return employment;
	}
	public void setEmployment(boolean employment) {
		this.employment = employment;
	}
	
	
	

}
