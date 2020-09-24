package com.basicProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	String name;
	int age,rollNo;	
	
	public Employee(String name, int age, int rollNo)
	{
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;		
	}
		
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Pratik", 25, 1025);
		Employee e2 = new Employee("Prabhat", 26, 1026);
		Employee e3 = new Employee("Rini", 27, 1027);
		Employee e4 = new Employee("Rashmi", 28, 1028);
		Employee e5 = new Employee("Pratik", 29, 1029);
		Employee e6 = new Employee("Pratik", 30, 1030);
		
		List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        
        //list = list.stream().sorted(Comparator.comparing(Employee :: getAge)).collect(Collectors.toList());
        
        //list.forEach(System.out::println);
        
        Comparator<Employee> compare = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).reversed();
        
        Collections.sort(list, compare);
        System.out.println(list);
        
        List<String> stringList = new ArrayList<String>();
        stringList.add("Pratik");
        stringList.add("Prabhat");
        stringList.add("Rohan");
        stringList.add("Prati");
        stringList.add("Prab");
        stringList.add("Prashant");
        
        List<String> sorted = stringList.stream().sorted().collect(Collectors.toList());
        List<String> reverseSorted = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        sorted.forEach(System.out::println);
        
        reverseSorted.forEach(System.out::println);
        
        
        
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		
		return "Employee { Name "+name+" Age "+ age +" Roll No. "+rollNo+ " }";  
	}
}
