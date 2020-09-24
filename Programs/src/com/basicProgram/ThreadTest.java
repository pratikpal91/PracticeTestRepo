package com.basicProgram;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest implements Runnable{

	
	public void run() 
	  { 
	    try
	    { 
	      // Displaying the thread that is running 
	      System.out.println ("Thread " + 
	                Thread.currentThread().getId() + 
	                " is running"); 
	  
	    } 
	    catch (Exception e) 
	    { 
	      // Throwing an exception 
	      System.out.println ("Exception is caught"); 
	    } 
	  } 
	 
	  
	// Main Class 
	
	  public static void main(String[] args) throws InterruptedException, ExecutionException 
	  { 
	    
	      ThreadTest object = new ThreadTest(); 
	  
	      // start() is replaced with run() for 
	      // seeing the purpose of start 
	     
	    Callable<String> exe = Executors.callable(object, "Pratik");
	    ExecutorService ex = Executors.newFixedThreadPool(2);
	    Future<String> f = ex.submit(exe);
	    System.out.println(f.get());
	    
	   
	  }
	  }
