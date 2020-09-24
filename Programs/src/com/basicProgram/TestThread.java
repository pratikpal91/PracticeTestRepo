package com.basicProgram;

public class TestThread extends Thread{
	
	
	@Override
	public void run() {
		
		for(int i = 0 ; i <= 10; i++)		
		System.out.println("Thread in control "+Thread.currentThread().getName());
		
	}

}
