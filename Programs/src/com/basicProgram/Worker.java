package com.basicProgram;


import java.util.concurrent.CountDownLatch;


enum Color{
	
	RED,GREEN,YELLOW,PINK;
}


public class Worker extends Thread {

	int delay;
	CountDownLatch latch;
	public Worker(int delay, CountDownLatch latch, String threadName)
	{
		super(threadName);
		this.delay=delay;
		this.latch=latch;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+ "finished execution");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
