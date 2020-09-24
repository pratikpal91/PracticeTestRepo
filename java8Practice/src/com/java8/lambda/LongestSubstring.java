package com.java8.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		int maxSize = Integer.MIN_VALUE;
		int initIndex = Integer.MIN_VALUE;
		int lastIndex = Integer.MIN_VALUE;
		
		for(int i =0 ; i < input.length();i++)
		{
			for(int j = i+1 ; j < input.length();j++)
			{
				if(isUniqueSubstring(input.substring(i, j+1)) && (j+1-i) > maxSize)
				{
					maxSize = j+1-i;
					initIndex = i;
					lastIndex = j;
				}
				
			}
			
		}
		
		System.out.println("size " +maxSize+ " and substring "+ input.substring(initIndex, lastIndex+1));
		
	}
	
	public static boolean isUniqueSubstring(String st)
	{
		String[] arr = st.split("");
		Set<String> set = new HashSet<>(Arrays.asList(arr));
		
		if(set.size() < st.length())
		{
			return false;
		}
		
		return true;
		
	}



}
