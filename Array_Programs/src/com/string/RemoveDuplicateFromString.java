package com.string;


import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String st = "pratikpratik";
		
		System.out.println(removeDuplicate(st));
		
		
	}

	private static String removeDuplicate(String st) {
		
		String st1 = new String();
		Set<Character> set =st.chars().mapToObj(ob -> (char)ob).collect(Collectors.toSet());
        for(char ch : set)
        {
        	st1 += ch;	
        }
        
        return st1;
         
	}

}
