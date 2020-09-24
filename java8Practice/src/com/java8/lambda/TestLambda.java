package com.java8.lambda;


public class TestLambda{	
  
	
	public static void main(String[] args) {
		
		final int a = 12;
	
		Thread t = new Thread(() -> {
			
			System.out.println("new thread");

			System.out.println(a);
		});
		t.start();
		
		System.out.println(t.getName());
		
		
	}
	
}
