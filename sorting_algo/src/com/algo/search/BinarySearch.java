package com.algo.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,6,7,8,9,10};
		
		System.out.println(binarySeraching(arr,10));
		
		
		
	}

	private static int binarySeraching(int[] arr, int key) {

		if(arr.length <=0)
		{
			return -1;
		}
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			if(key == arr[mid])
			{
				return mid;
			}else if(key > arr[mid])
			{
				start =  mid+1;
			}else
			{
				end = mid -1;
			}		
		 }
		
		return -1;
		
		
		
	}

}
