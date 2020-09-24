package com.java8.lambda;

public class ShuffleString {
	
	public static void main(String[] args) {
		
		String input = "codeleet";
		int[] arr = {4,5,6,7,0,2,1,3};
		
		char[] chararr = new char[input.length()];
		
		for(int i=0;i < input.length();i++)
		{
			chararr[arr[i]] = input.charAt(i);
		}
		
		System.out.println(new String(chararr));
		 
	}

}
