package com.basicProgram;

public class ArmstrongNumber {
	
	
public static void main(String[] args) {
	
	
	int number = 371;
	   String value = Integer.toString(number);
	   
	   char[] num = value.toCharArray();
	      
	   int total = 0;  
	   
	   for(int i = 0 ; i < num.length ;i++)
	   {
		   String st = Character.toString(num[i]);
		   int a = Integer.parseInt(st);
		   total+= a*a*a;
	   }
	
	   if(total == number)
	   {
		   System.out.println("Armstrong number "+ number);
	   }
	   else{
		   System.out.println("Not an armstrong number "+ number);
	   }
}	  

}
