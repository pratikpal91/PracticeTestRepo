package com.basicProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparatorTest{
	
	public static void main(String[] args) {

		Employee e1 = new Employee("Pratik", 25, 1025);
		Employee e2 = new Employee("Prabhat", 26, 1026);
		Employee e3 = new Employee("Rini", 27, 1027);
		Employee e4 = new Employee("Rashmi", 28, 1028);
		Employee e5 = new Employee("Pratik", 29, 1029);
		Employee e6 = new Employee("Pratik", 30, 1030);
		
		List<Employee> list = new ArrayList<Employee>()
				{
			{
			    add(e1);
		        add(e2);
		        add(e3);
		        add(e4);
		        add(e5);
		        add(e6);
			}
				};
        
		
		Collections.sort(list, new EmployeeSort());
		
		System.out.println(list);
		
	}
	
	public static class EmployeeSort implements Comparator<Employee>
	{
		
	@Override
	public int compare(Employee o1, Employee o2) {
		
		int compareName = o1.getName().compareTo(o2.getName());
		int compareAge = o1.getAge() - o2.getAge();
		
		if(compareName == 0)
		{
			return (compareAge == 0) ? compareName : compareAge ;			
		}		
		return compareName;
	}
	}
	
	
	
	
}
