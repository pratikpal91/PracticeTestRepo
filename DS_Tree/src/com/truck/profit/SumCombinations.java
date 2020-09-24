package com.truck.profit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumCombinations {
	
	static void sum_combinations_recursive(ArrayList<Integer> inputNumbers, int targetSum, ArrayList<Integer> partialNumbers, List<List<Integer>> list) {

	       int sum = 0;
	     	       
	       //calculate summation of partial numbers
	       for (int x: partialNumbers) {	 
	   
	    	   sum += x;

	       } 
	       
	       //check if summation of partial numbers is equal to sum target
	       if (sum <= targetSum)
	    	   
	    	   list.add(partialNumbers);
	            System.out.println("sum("+Arrays.toString(partialNumbers.toArray())+")="+targetSum);
	       
	       //if we sum is greater than the target sum then why to continue 
	       if (sum >= targetSum){

	    	   //ends the current method invocation
	    	   return;
	       }	            
	       
	       //add the remaining numbers in the partial number list 
	       for(int i=0;i<inputNumbers.size();i++) {	  
	   
	             ArrayList<Integer> remainingNumbers = new ArrayList<Integer>();

	             int n = inputNumbers.get(i);	
         
	             for (int j=i+1; j<inputNumbers.size();j++) {

	            	 remainingNumbers.add(inputNumbers.get(j));
	             }
	             
	             ArrayList<Integer> partialNumbersList = new ArrayList<Integer>(partialNumbers);

	             partialNumbersList.add(n);

	             //recursive call
	             sum_combinations_recursive(remainingNumbers,targetSum,partialNumbersList, list);
	       }
	       
	    }
	    static void sum_combinations(ArrayList<Integer> inputNumbers, int targetSum) {

	    	ArrayList<Integer> output = new ArrayList<Integer>();
	    	List<List<Integer>> list = new ArrayList<List<Integer>>();
	    	sum_combinations_recursive(inputNumbers,targetSum,output , list);
	    	
	    	
	    	
	    	System.out.println(list.size());
	    	

	    }

	    public static void main(String args[]) {

	        Integer[] inputNumbers = {1,2,3,4,10,15,20,35,50,100};

	        int targetSum = 50;

	        sum_combinations(new ArrayList<Integer>(Arrays.asList(inputNumbers)),targetSum);

	    }


}
