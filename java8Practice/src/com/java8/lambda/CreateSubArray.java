package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CreateSubArray {
	
	public static void main(String[] args) {
		
		String st = "abcdaedf";
		
		int index = 0;
		int endIndex = 0;
		
		while(index < st.length())
		{
			 
		  endIndex = findSubstring(st.charAt(index),st);
		  
		  String subString = st.substring(index,endIndex+1);
		  
		  for(char ch : subString.toCharArray())
		  {
			  if(st.lastIndexOf(ch) > endIndex)
			  {
				  endIndex = st.lastIndexOf(ch);
			  }
		  }
		 
		  System.out.println(endIndex+1 -index);
		  index = endIndex+1;
		  

	        Map<Integer,Integer> map = new HashMap<>();
        
		  
		}
		
	}
	
	public static int findSubstring(char ch, String st){
		
		
		return st.lastIndexOf(ch);
		
		
		
		
	}

}
