package com.basicProgram;

public class ThreadPool1 implements Runnable {
	
	@Override
	public void run() {

		System.out.println("Thread Created with Thread pool"+Thread.currentThread().getName());
		
	}

}
