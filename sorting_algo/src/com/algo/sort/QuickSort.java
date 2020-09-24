package com.algo.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr = {10,80,30,70,40,50,90};
		
		int lenght = arr.length;
		
		sort(arr, 0 , lenght-1);
		
for (int i = 0; i <arr.length ; i++) {
        	
        	System.out.println(arr[i]);
        				
		}
		
	
	}

	private static void sort(int[] arr, int low, int high) {

		
		if(low < high)
		{
			
			int pivot = partition(arr, low , high);
			sort(arr,low, pivot-1);
			sort(arr, pivot+1, high);
			
		}
	}

	private static int partition(int[] arr, int low, int high) {
		
		int i = low -1;
		int pivot = arr[high];
	    for(int j = low ; j < high; j++)
	    {
	    	if(arr[j] < pivot)
	    	{
	    	   i++;
	    	   int temp = arr[i];
	    	   arr[i] = arr[j];
	    	   arr[j] = temp;
	    		
	    	}    	
	    }
	    
	    int temp = arr[high];
	    arr[high] = arr[i+1];
	    arr[i+1] = temp;	
		
		return i+1;
	}	
}
