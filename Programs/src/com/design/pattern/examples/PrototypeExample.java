package com.design.pattern.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeExample {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Employee Name : ");
		
		String name = br.readLine();
		
		System.out.println("Enter Employee Id ");
		
		String id = br.readLine();
		
		System.out.println("Enter city ");
		
		String address = br.readLine();
		
		System.out.println("Enter salary");
		
		Double salary = Double.parseDouble(br.readLine());
		
		
		EmployeeRecord e1 = new EmployeeRecord(name, id, address, salary);
		
		e1.displayRecord();
		
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		
		e2.displayRecord();
		
	}

}
