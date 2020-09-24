package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Honda", "Red", "V6");
		Car car2 = new Car("Toyota", "black", "V6");
		Car car3 = new Car("Ford", "blue", "V5");
		Car car4 = new Car("Aston Martin", "White", "V8");
		
		
		List<Car> set = new ArrayList<>();
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);	
		
		Collections.sort(set, new NameComparator(true));
		
		
		System.out.println(set);
		
		
	}

}
