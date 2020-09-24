package com.basicProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.CyclicBarrier;

public class Solution1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
        List<String> list = new ArrayList<>();
        list.add("(");
        list.add("[");
        list.add("{");
        Map<String,String> map = new HashMap<String,String>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        boolean isValid = true;
        while (sc.hasNext()) {   
            String input1=sc.next();  
            char[] arr = input1.toCharArray();
            for(char c :arr)
            {
            String input =String.valueOf(c);
            if(!stack.empty() && input.equals(map.get(stack.peek())))
            {
                
                stack.pop();
            }else if(map.keySet().contains(input))
            {
                stack.push(input);
            }else
            {
                isValid = false;
                break;
            }
            }
            System.out.println(stack.isEmpty() && isValid ? "true":"false");
		}
        
		
	}
       
}
