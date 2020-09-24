package com.basicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1 {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String st = br.readLine();
        String[] array = st.split(" ");
        int[] data = new int[size];
        for(int i = 0 ; i< size ; i++)
        {
        	data[i] = Integer.parseInt(array[i]);
        }        
        int curr = 0;
        int near = data[0]; 
        Arrays.sort(data);      //  add this
        System.out.println(Arrays.toString(data));        
        // find the element nearest to zero
        for ( int i=0; i < data.length; i++ ){
            curr = data[i] * data[i]; 
            if ( curr <= (near * near) )  { 
                near = data[i];
            } 
        }
        System.out.println( near );
		
	}
	
	
	
	

}
