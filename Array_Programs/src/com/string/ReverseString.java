package com.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String st = "pratham";
		
		reverseString(st);
	}

	private static void reverseString(String st) {
		int half = st.length()/2;
	    int length = st.length();
		char[] arr = st.toCharArray();
	    for(int i = 0 ; i< half ;i++)
	    {
	         char temp = arr[i];
	         arr[i] = arr[length-1-i];
	         arr[length-1-i] = temp;	    	
	    }
	    System.out.println(new String(arr));
	}

}
