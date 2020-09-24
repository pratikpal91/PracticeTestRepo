package com.basicProgram;

public class ProducerConsumerTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		final ProdConService pc = new ProdConService();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}		
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		});
		t1.start(); t2.start();
		t1.join(); t2.join();
		
	}	
	
}
