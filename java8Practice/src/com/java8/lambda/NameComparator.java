package com.java8.lambda;

import java.util.Comparator;

public class NameComparator implements Comparator<Car>{

	boolean isAsc;
	
	public NameComparator(boolean isAsc) {

		this.isAsc = isAsc;
	}
	
	@Override
	public int compare(Car o1, Car o2) {		
		if(isAsc)
		return o1.getName().compareTo(o2.getName());
		else
		return o2.getName().compareTo(o1.getName());
	}
	
	

}
