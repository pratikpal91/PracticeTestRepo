package com.algo.sort;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] arr = {73,65,57,49,31,23,15};
		
		MergeSort.sort(arr);		
		
		System.out.println("\nSorted array"); 
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
	}

	private static void sort(int[] arr) {

		int length = arr.length;
		if(length < 2)
		{
			return;
		}
		
		int mid = length/2;
		
		int[] left = new int[mid];
		int[] right = new int[length - mid];
		
		for(int i = 0 ; i < mid ; i++)
		{
			left[i] = arr[i];
		}
		
		for(int i = mid ; i < length ; i++ )
		{
			right[i-mid] = arr[i];
		}
		
		sort(left);
		sort(right);
		merge(left , right , arr);
		
	}

	private static void merge(int[] left, int[] right, int[] arr) {

		int lsize = left.length;
		int rsize = right.length;
		
		int i = 0 ,j = 0,k = 0 ;
		
		while(i < lsize && j < rsize)
		{
		    if(left[i] < right[j])
		    {
		    	arr[k++] = left[i++];
		    	
		    }else
		    {
		    	arr[k++] = right[j++];
		    }			
		}
		
		while(i < lsize)
		{
			arr[k++] = left[i++];
		}
		
		while(j < lsize)
		{
			arr[k++] = right[j++];
		}
		
	}

}
