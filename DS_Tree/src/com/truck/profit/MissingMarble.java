package com.truck.profit;

public class MissingMarble {	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,9,11};
		
		int result = missingMarbleInJar(5 , arr);
		
		System.out.println(result);
		
	}

	private static int missingMarbleInJar(int size, int[] arr) {
		
		int j = size -1 ;
		int sum = arr[0] + arr[j];		
		
		for(int i = 0 ;i <= size/2 ; i++)
		{
			
			if(arr[i] == arr[j])
			{
				return sum - arr[i];
			}
			int total = arr[i] + arr[j] ;
			
			
			if(total != sum)
			{
				if(total > sum)
				{
					return total -sum;
				}else
				{
					return sum - total;
				}
				
			}
			j--;
			
		}
		return 0;
		
	}

}
