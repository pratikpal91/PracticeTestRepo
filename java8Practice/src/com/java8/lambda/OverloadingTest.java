package com.java8.lambda;

public class OverloadingTest {
	
	public static void main(String[] args) {
		
	    
		Test a = Test.INSTANCE;
		System.out.println(a.a);
		
		Test b = Test.INSTANCE;
		b.a = 4;
		System.out.println(a.a);
		
		
		//m1(new String("Pratik"));
		
	}
	
	public enum Test{
		
		TEST, RUN,VALIDATE, INSTANCE;
		
        int a = 2;
		
		
	}
	
	public static void m1(String i)
	{
		
		System.out.println("int");
	}

	public static void m1(Object n){
		
		System.out.println("number");
	}
}
