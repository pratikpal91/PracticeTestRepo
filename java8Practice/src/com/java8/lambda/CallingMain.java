package com.java8.lambda;

public class CallingMain {
	
    static int i = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
		CallingMain main = new CallingMain();
		main.caller();
		
	}
	
	public static void main()
	{
		
	}
	
	public void caller()
	{
		i++;
		System.out.println("Caller");
		
		if(i<3)
		{	    
	     CallingMain.main(null);
		}
	}

}
