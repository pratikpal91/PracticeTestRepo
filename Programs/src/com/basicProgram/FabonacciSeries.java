package com.basicProgram;

public class FabonacciSeries {
	
	public static void main(String[] args) {
		
		int n1=0,n2=1,count =10, i=0;
		
		fabonacciSeries(n1,n2,count,i);
		
		
	}

	private static void fabonacciSeries(int n1, int n2, int count, int i) {
		
		
		if(i < count)
		{
			if(i == 0)
			{
				System.out.println("Fabonacci Series : "+ n1+ " "+ n2);
			}
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
			fabonacciSeries(n1, n2, count, i);
			
		}
		
		
		
	}

}
