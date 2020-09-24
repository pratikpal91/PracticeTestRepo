package com.basicProgram;

public class VolatileTest  extends Thread{
	
	boolean exit = false;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Inside main");
		
		VolatileTest t1 = new VolatileTest();
		VolatileTest t2 = new VolatileTest();
		t1.start();
		t2.start();
		Thread.sleep(5);
		t1.interrupt();
		t2.interrupt();
					
		System.out.println("Exited");
	}
	
	@Override
	public void run() {
		System.out.println("Inside Run");
		while(!this.isInterrupted())
		{
			System.out.println("Running thread"+Thread.currentThread().getName());
		}
	}	

}
