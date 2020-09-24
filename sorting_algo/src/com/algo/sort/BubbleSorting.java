package com.algo.sort;

public class BubbleSorting {
	
	
	
	public static void main(String[] args) {
		
		Integer[] values = {86,72,63,54,42,37,29};
		
        for(int i=0; i < values.length -1  ; i++)
        {
        	for(int j = 0; j < values.length - i - 1 ; j++)
        	{
                if(values[j] > values[j+1])
                {
                	int temp = values[j];
                	values[j] = values[j+1];
                	values[j+1] = temp;
                }
        	}
        	
        }
        
        for (int i = 0; i <values.length ; i++) {
        	
        	System.out.println(values[i]);
        				
		}
	}
	
	
	

}
