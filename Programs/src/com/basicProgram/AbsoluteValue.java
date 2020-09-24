package com.basicProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AbsoluteValue {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,6,5,2,3,3,2};
		
		Set<Integer> set = new HashSet<Integer>(Arrays.stream(arr).boxed().collect(Collectors.toList()));		
		Integer sum = set.stream().reduce(0,(a,b)-> a+b);		
		System.out.println(sum);		
	}

}
