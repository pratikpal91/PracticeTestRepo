package com.algo.sort;

public class BubbleSortingMethod2 {
	
	public static void main(String[] args) {
		
		Integer[] values = {18,17,16,15,14,13,12};
		
		for(int i = 0 ; i < values.length -1 ;i++)
		{
			int temp = values[i+1];
			
			for(int j = i ; j >= 0 ; j--)
			{
				if(values[j] > temp)
				{
					int val = values[j+1];
					values[j+1] = values[j];
					values[j] = val;										
				}
				
			}
		}
		
      for (int i = 0; i <values.length ; i++) {
        	
        	System.out.println(values[i]);
        				
		}
		
	}

}
