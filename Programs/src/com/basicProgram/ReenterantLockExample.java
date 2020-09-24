package com.basicProgram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantLockExample {
	
	
	public static void main(String[] args) {
		
		ReentrantLock rl = new ReentrantLock();
		
		ExecutorService pool = Executors.newFixedThreadPool(1);
		
		Runnable r1 = new WorkerThread("thread1", rl);
		Runnable r2 = new WorkerThread("thread2", rl);
		Runnable r3 = new WorkerThread("thread3", rl);
		pool.execute(r1); pool.execute(r2); pool.execute(r3);
		
		pool.shutdown();
		
	}

}
