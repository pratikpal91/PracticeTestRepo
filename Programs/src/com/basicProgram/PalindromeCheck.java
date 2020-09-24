package com.basicProgram;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		int number = 123321;
		String value = Integer.toString(number);
		
	     boolean isPrime = isPalindrome(value);
	     
	     System.out.println("is Prime : " + isPrime);
		
	}

	private static boolean isPalindrome(String value) {

		char[] val = value.toCharArray();
	     int size = 0;
	     size = val.length/2;
	     int i = 0;
	     while(i < size)
	     {
	     if(val[i] == val[val.length -1 -i])
	       {
	    		 i++;
	       }else{
	    	   return false;
	       }
	     }
	     
	     return true;
	}

}
