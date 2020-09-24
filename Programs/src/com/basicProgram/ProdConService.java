package com.basicProgram;

import java.util.LinkedList;

public class ProdConService {
	
	int capacity = 3;
	LinkedList<Integer> list = new LinkedList<Integer>();
	int value = 0;
	
	public synchronized void produce() throws InterruptedException
	{
		while(true){
		
          
			if(list.size() == capacity)
			{
				notify();
				wait();
			}
			
			System.out.println("Producer Produced Value "+ value);
			
			list.add(value++);
			
			Thread.sleep(1000);			
		}
	}

	public synchronized void consume() throws InterruptedException
    {
		while(true){
		
            
			if(list.size() == 0)
			{
			  notify();
			  wait();
			}			  
			
			int val = list.removeFirst();
			
			System.out.println("Consumer consumed value "+val);
			Thread.sleep(1000);			
		} 
		
    }
	
}
