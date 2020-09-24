package com.java8.lambda;

import java.util.Scanner;

public class GetLongestPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int maxSize = Integer.MIN_VALUE;
		int initIndex = Integer.MIN_VALUE;
		int lastIndex = Integer.MIN_VALUE;
		
		for(int i =0 ; i < input.length();i++)
		{
			for(int j = i+1 ; j < input.length();j++)
			{
				if(isPalindrome(input.substring(i, j+1)) && (j+1-i) > maxSize)
				{
					maxSize = j+1-i;
					initIndex = i;
					lastIndex = j;
				}
				
			}
			
		}
		
		System.out.println("size " +maxSize+ " and substring "+ input.substring(initIndex, lastIndex+1));
		
	}
	
	public static boolean isPalindrome(String st)
	{
		for(int i=0;i<st.length()/2;i++)
		{
			if(st.charAt(i) != st.charAt(st.length()-1-i))
			{
				return false;
			}
			
		}
		
		return true;
		
	}

}
