package com.basicProgram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		executorService.execute(new ThreadPool1());
		if(executorService.isShutdown())
		{
			executorService.shutdown();
		}		
		
	}

}
