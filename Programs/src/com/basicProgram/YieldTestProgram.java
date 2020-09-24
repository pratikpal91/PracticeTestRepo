package com.basicProgram;


public class YieldTestProgram {
	
	public static void main(String[] args) throws InterruptedException {
		
		TestThread t = new TestThread();
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		
		for(int i = 0 ; i <= 10; i++)
		{
			Thread.yield();
			System.out.println("Thread in control "+Thread.currentThread().getName());
		
		}
		
		
	}

}
