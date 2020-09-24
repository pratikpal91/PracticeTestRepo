package com.basicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class CollectionsTest {
	
	
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,2,3,4,5,6,7,1,2,3,4,5,6,7};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(list);
		int mid = (list.size()/2) -1;
		
		System.out.println(mid);
		int count = 0;
		System.out.println(list.indexOf(mid));
		List<List<Integer>> lists = new ArrayList<>(list.stream().collect(Collectors.partitioningBy(e -> list.indexOf(e) > mid)).values());
		
		System.out.println(lists);
		list.remove(Integer.valueOf(1));
		
		System.out.println(list);
		
		list.remove(Integer.valueOf(4));
		System.out.println(list);
		
		List list2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		list2.removeAll(Collections.singletonList(1));
		
		System.out.println(list2);
		
		
		
		
		
		
	}

}
