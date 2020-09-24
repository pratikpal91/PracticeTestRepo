package com.basicProgram;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(4);
		
		Worker w1 = new Worker(1000,latch,"w1");
		Worker w2 = new Worker(2000,latch,"w2");
		Worker w3 = new Worker(3000,latch,"w3");
		Worker w4 = new Worker(4000,latch,"w4");
		
		w1.start(); w2.start(); w3.start(); w4.start();
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName()+" has finished execution");		
		
	}

}
