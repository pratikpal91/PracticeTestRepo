package com.array;

public class AreaCalculation {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,5,1,1};
		System.out.println(calculateArea(arr));
	}

	private static int calculateArea(int[] arr) {
		
		if(arr.length == 0)
		{
			return 0;
		}
		if(arr.length <= 1)
		{
			return arr[0];
		}	
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		for(int i : arr)
		{
			if(i > a)
			{
				b = a;
				a =i;
			}else if(i > b)
			{
				b = i;
			}
		}
		return a+b;
	}

}
