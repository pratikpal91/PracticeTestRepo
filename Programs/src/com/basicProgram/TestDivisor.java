package com.basicProgram;

public class TestDivisor {
	
	public static void main(String[] args) {
		
		System.out.println(findSmallestDivisor("abababab", "abab"));
		
	}
	
	
	public static int findSmallestDivisor(String s, String t) {
	    // Write your code here
	    int sLen = s.length();
	    int tLen = t.length();
	    if(tLen == 0 || sLen%tLen != 0)
	    {
	        return -1;
	    }
	    
	    int len = sLen/tLen;
	    String temp = "";
	    for(int i =0 ; i<len;i++)
	    {
	      temp += t;
	      
	    }
	    

	    if(s.equals(temp))
	    {
	       return countCommonDivisor(t);
	    }else return -1;


	    }

	    public static int countCommonDivisor(String t)
	    {
	        int m = t.length();

	        for(int i =1 ; i <= m/2 ; i++)
	        {
	            if(m%i == 0)
	            {
	            	int quotent = m/i;
	                if(check(t.substring(0,i),t,quotent))
	                	return i;
	            }
	        }
	       return t.length();
	    }

	    public static boolean check(String st , String t ,int quotent)
	    {
	    	String temp = "";
	        for(int i =1;i<= quotent;i++)
	        {
	            temp +=st;
	        }
	        if(temp.equals(t))
	        {
	        	return true;
	        }
	        return false;
	    }

	}


