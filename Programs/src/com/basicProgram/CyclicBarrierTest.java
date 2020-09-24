package com.basicProgram;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
	
	public static CyclicBarrier barrier= new CyclicBarrier(3);;
	
	public static void main(String[] args) {
		
		Computation1 cp1 = new Computation1(barrier);
		Computation2 cp2 = new Computation2(barrier);
		
		Thread t1 = new Thread(cp1);
		Thread t2 = new Thread(cp2);
		t1.start();
        t2.start();		
		try {			
			barrier.await();
			System.out.println("Barrier broken");
			System.out.println(Computation1.value+Computation2.sum);
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	

}
