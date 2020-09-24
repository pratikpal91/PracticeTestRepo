package com.basicProgram;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

public class Solution {

	
	public static boolean canWin(int leap, int[] game) {
		 int position = 0;
         int length = game.length;
         if(leap >length)
         {
             return true;
         }
         for(int i = 0 ; i<length ;i++)
         {

             if(game[i] == 1 && ((i+leap) < length && game[i+leap]==1 ))
             {
                 position = i-1;
                 break;
             }else if(game[i] == 0 && (i+1 < length && game[i+1] == 1))
             {
                 if((i+leap) >= game.length){
                 return true;
                 }else if(game[i+leap] == 0){
                    i = i+leap-1;
                 }else if(i != 0 && game[i-1] == 0)
                 {
                     boolean found = false;
                     while(i != 0 && game[i-1] == 0)
                     {
                         if(game[i-1+leap] == 0)
                         {
                             i = i +leap -2;
                             found =true;
                             break;
                         }
                         i--;
                     }
                   if(!found){return false;}
                 }
                 else{ 
                     position = i;
                     break;
                   }
             }else if(i+leap >= length)
             {
                 return true;
             }
         
         }
         if(position+leap >= game.length)
         {return true;}
         
         return false;
	}

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int q = scan.nextInt();
      while (q-- > 0) {
          int n = scan.nextInt();
          int leap = scan.nextInt();
          
          int[] game = new int[n];       
          for (int i = 0; i < n; i++) {
              game[i] = scan.nextInt();
          }


          System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
      }
      scan.close();
  }
}