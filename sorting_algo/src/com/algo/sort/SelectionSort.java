package com.algo.sort;

public class SelectionSort {
	
	
	public static void main(String[] args) {
		
		int[] arr = {73,65,57,49,31,23,15};
		
		sort(arr);
		
        for (int i = 0; i <arr.length ; i++) {
        	
        	System.out.println(arr[i]);
        				
		}
		
		
	}

	private static void sort(int[] arr) {
		
		int length = arr.length;
		
		
		for(int i = 0 ; i < length ; i++)
		{
		    int min_idx = i;
		    
		    for(int j = i+1; j < length ; j++)
		    {
		    	if(arr[min_idx] > arr[j])
		    	{
		    		min_idx = j;
		    	}
		    }
			
		    int temp = arr[min_idx];
		    arr[min_idx] = arr[i];
		    arr[i] = temp; 
		    
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
