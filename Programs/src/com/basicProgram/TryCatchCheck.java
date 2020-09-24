package com.basicProgram;

public class TryCatchCheck {
	
	
	public static void main(String[] args) {
		
		try{			
			System.out.println("Try test");
			throw new NullPointerException("custom");			
		}catch(NullPointerException ex)
		{
			System.out.println("Catch");
			//System.exit(0);
		}finally {
			System.out.println("Finally block");
		}
		
		
	}
    
}
