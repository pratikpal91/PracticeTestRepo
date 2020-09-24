package com.truck.profit;

public class multidimensionalArray {
	
	
	
	public static void main(String[] args) {
		
		int[][] arr = {{5,10}, {8,12}};
		
		int totalDistance = findTotalDistance(arr, 2);
		
		System.out.println(totalDistance);	
		
	}

	private static int findTotalDistance(int[][] arr, int size) {
		
		int distance = 0;
		
		for(int i = 0 ; i < size ; i++)
		{
			
			int firstVal = arr[i][0];
			int secVal = arr[i][1];			
			distance = distance + secVal - firstVal;
			
			if(i < size -1 && arr[i][1] > arr[i+1][0])
			{
				int diff =  arr[i][1] - arr[i+1][0];
				distance = distance - diff;
			}
		}
		
		return distance;
	}

}
