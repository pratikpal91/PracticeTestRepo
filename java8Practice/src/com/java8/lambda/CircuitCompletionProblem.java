package com.java8.lambda;

public class CircuitCompletionProblem {
	
	public static void main(String[] args) {
		
		
		int[] gas = {1,2,3,4,5};
		int[] cost = {1,3,2,4,5};
		
		System.out.println(canCompleteCircuit(gas, cost));		
		
	}
	
	
	public static int canCompleteCircuit(int[] gas, int[] cost){
		int startIndex = -1;
		startIndex =   calculateStartIndex(gas,cost, startIndex);
        System.out.println("index " +startIndex);
		int index = -1;
		while(startIndex != -1)
		{		       
		       if(checkCircuit(gas,cost, startIndex))
		       {
		    	   System.out.println("passed");
		       return startIndex;
		       }
		       else{
		    	   
		    	   startIndex = calculateStartIndex(gas,cost, startIndex);
		    	   
		       }

		}

		return index;

		}
	
	public static boolean checkCircuit(int[] gas, int[] cost, int startIndex) {
		int totalGas = 0;	

		for(int i = startIndex ; i < gas.length ; i++)
		{
		totalGas += gas[i];
			if (cost[i] > totalGas) {
				return false;
			} else {
				totalGas -= cost[i];
			}

		}
		
		for(int i =0 ; i < startIndex ; i++)
		{
			totalGas += gas[i];
			if (cost[i] > totalGas)
				return false;
			else {
				totalGas -= cost[i];
			}

		}
		return true;

	}
	
	
	public static int calculateStartIndex(int[] gas, int[] cost, int afterIndex)
	{
	int i =0;
	      if(afterIndex != -1)
	{ 
	   i = afterIndex +1;
	}
	        for(;i<gas.length;i++)
	         {
	                if(gas[i] >= cost[i])
	                return i;
	         }
	     return -1; 
	}



}
