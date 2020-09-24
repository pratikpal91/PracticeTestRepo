package com.basicProgram;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] arr = {18,17,16,15,14,13,12};
		
		for(int i = 1 ; i < arr.length ; i++)
		{
            int j = i-1;
            
            int temp = arr[i];
            
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
		}
		
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
}
