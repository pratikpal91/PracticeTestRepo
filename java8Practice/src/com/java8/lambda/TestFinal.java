package com.java8.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestFinal {
	
	public static void main(String[] args) throws IOException  {
		
		//FinalParentTestClass ob = new FinalChildTest();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of array :- ");
		int count = 0;
		int size = sc.nextInt();
		int[] arr = new int[size];
		while(count < size)
		{
			System.out.println("Enter elements : ");
			arr[count] = sc.nextInt();
			count++;
		}
		
		 System.out.println("Size of the array is : "+size);
		 System.out.println("elements entered are : ");
		for(int i : arr){
			System.out.println(i);
		}
		
		
		
	}

}
