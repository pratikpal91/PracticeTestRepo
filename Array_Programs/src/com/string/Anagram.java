package com.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String st1 = "mary";
		String st2 = "army";
		
		System.out.println(isAnagram1(st1,st2));
		System.out.println(isAnagram2(st1,st2));
		System.out.println(isAnagram3(st1,st2));
		
	}

	private static boolean isAnagram3(String st1, String st2) {
		if(st1.length() !=  st2.length())
		{return false;}
		
		for(Character ch : st1.toCharArray())
		{
			int index = st2.indexOf(ch);
			if(index != -1)
			{
			   st2 = st2.substring(0, index)+ st2.substring(index+1, st2.length());
			}else return false;
		}
		return st2.isEmpty();
	}

	private static boolean isAnagram2(String st1, String st2) {
		if(st1.length() != st2.length())
			return false;
		char[] arrst1 = st1.toCharArray();
		char[] arrst2 = st2.toCharArray();
		
		Arrays.sort(arrst1);
		Arrays.sort(arrst2);
		
		return Arrays.equals(arrst1, arrst2);
	}

	private static boolean isAnagram1(String st1, String st2) {
		char[] arr = st1.toCharArray();
		
		StringBuilder bl = new StringBuilder(st2);
		
		for(char ch : arr)
		{
			int index = bl.indexOf(""+ch);
			if(index != -1)
			bl.deleteCharAt(index);
			else
				return false;
		}
		return bl.length() == 0;
	}
	
	

}
