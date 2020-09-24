package com.algo.sort;

public class InsertionSorting {
	
	public static void main(String[] args) {
		
		Integer[] values = {10,11,16,17,15,18};
		
		for(int i = 1 ; i < values.length ; ++i)
		{
			
			int temp = values[i];
			
			int j = i-1;
			
			while(j >= 0 && values[j] > temp)
			{
				values[j+1] = values[j];
				j = j-1;				
			}	
			values[j+1] = temp;
			
		}
		
		
for (int i = 0; i <values.length ; i++) {
        	
        	System.out.println(values[i]);
        				
		}
		
		
		
	}

}
