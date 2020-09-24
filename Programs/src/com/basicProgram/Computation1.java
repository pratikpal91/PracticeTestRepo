package com.basicProgram;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Computation1 implements Runnable{
	
	public static int value;
	CyclicBarrier barrier;
	public Computation1(CyclicBarrier cb) {
		this.barrier = cb;
	}

	@Override
	public void run() {
		value = 2*3;
		
		try {
			System.out.println("CyclicBarrier waiting for comp1"+value);
			barrier.await();
			System.out.println("wait finished comp1");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	
}
