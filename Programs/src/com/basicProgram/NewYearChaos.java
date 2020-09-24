package com.basicProgram;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {	

	    // Complete the minimumBribes function below.
	    static void minimumBribes(int[] q) {
	    int value = 0;
	    boolean isNotChaotic = true;
		while (!isSorted(q) & isNotChaotic) {
			for (int i = 0; i < q.length - 1; i++) {
				if (q[i] > i + 3) {
					isNotChaotic =false; 
					break;
				}else{
					
					if(q[i] > q[i+1])
					{
						int temp = q[i];
						q[i] = q[i+1];
						q[i+1] = temp;
						value++;
					}
					
				}

			}
		}
		
		System.out.println(!isNotChaotic ? "Too chaotic" : value);    	
	    	
	    }
	    
	    public static boolean isSorted(int[] q)
	    {
	    	for(int i=1;i<q.length-1;i++)
	    	{
	    		if(q[i-1]>q[i])
	    		{
	    			return false;
	    		}
	    		
	    	}
	    	return true;	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int[] q = new int[n];

	            String[] qItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int i = 0; i < n; i++) {
	                int qItem = Integer.parseInt(qItems[i]);
	                q[i] = qItem;
	            }

	            minimumBribes(q);
	        }

	        scanner.close();
	    }
	


}
