package com.basicProgram;

import java.util.concurrent.locks.ReentrantLock;

public class WorkerThread implements Runnable{
	
	public String threadName;
	public ReentrantLock rl;
	
	
	public WorkerThread(String threadName, ReentrantLock rl) {
		this.threadName=threadName;
		this.rl=rl;	
	}
	
	@Override
	public void run() {
		
		boolean done =false;
	    while(!done)
	    {
	    	boolean ans = rl.tryLock();
	    	
	    	if(ans)
	    	{
	    		try {
	    			System.out.println("Doing outer work lock acqired. "+ threadName);
	    			Thread.sleep(1000);
	    			
	    			System.out.println("count "+rl.getHoldCount());
	    			
	    			rl.lock();
	    			
	    			System.out.println("acquired inner lock "+threadName);
	    			
	    			System.out.println("count "+ rl.getHoldCount());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					System.out.println("Lock releasing" + threadName);
					rl.unlock();
					System.out.println("count "+ rl.getHoldCount());					
					
					System.out.println("Lock releasing" + threadName);
					rl.unlock();
					System.out.println("count "+ rl.getHoldCount());
					done = true;
					
				}
	    		
	    		
	    		
	    	}else
	    	{
	    		
	    		System.out.println("Waiting for lock "+threadName);
	    		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    }
		
		
		
	}

}
