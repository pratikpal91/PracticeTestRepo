package com.javaPrograms;

public class ExceptionTest {
	
	
	
	public static void main(String[] args) {
		
		try{
			
			System.out.println("test exception");
			int a = 12;
			System.out.println("result "+a/0);
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			System.out.println("jo hua so hua ..... lets start again");
		}
		
		
		
	}

}

