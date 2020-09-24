package com.basicProgram;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Computation2 implements Runnable{
	
	public static int sum;
	CyclicBarrier barrier;
	public Computation2(CyclicBarrier cb) {
		this.barrier = cb;
	}

	@Override
	public void run() {

		sum = 4*2;
		try {
            System.out.println("Cyclic barrier waiting for comp2"+sum);
			barrier.await();
			System.out.println("Cyclic barrier wait finished for comp2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
