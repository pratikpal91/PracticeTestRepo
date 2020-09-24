package com.array;

import java.util.HashMap;
import java.util.Map;


public class SubSequence {
	
	static Map<String,Integer> input = new HashMap<String,Integer>();
    static Map<String,Integer> sequence = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		
		String[] st = {"r","a","b", "b","b" ,"i", "t"};
		String[] subsq = {"r","a","b", "b","i", "t"};
		
		System.out.println(getSubsequenceCount(st,subsq));
	}

	private static int getSubsequenceCount(String[] st, String[] subsq) {

		if(st.length < subsq.length )
		{
			return -1;
		}
		String current , next = null;
        for(String s : subsq)
        {
        	if(sequence.containsKey(s))
        	{
        		sequence.put(s,sequence.get(s)+1);
        	}else{
        		sequence.put(s, 1);
        	}
        }
		for(int i =0 ; i<subsq.length ;i++)
		{
			current = subsq[i];
			int j = i+1;
			while(j < subsq.length && subsq[j] == current)
			{
				j++;
				next = subsq[j];
			}
						
			getCount(current,next,st,i);			
			i = j;			
		}
		
       return calculatesubsequence();
	}

	private static int calculatesubsequence() {
		int total = 0;
		for(String st : sequence.keySet())
		{		
			int val = input.get(st);
			int subcount = sequence.get(st);
			if(subcount > 1)
			{
				total += val/((val- subcount)*subcount);
			}else{
				total *= val;
			}		
		}
			
		return total;
	}

	private static void getCount(String current, String next, String[] st, int startIndex) {
		
		int count =0;
		for(int i=startIndex; i<st.length ;i++)
		{
		    if(st[i] == current)
		    {
		    	count++;
		    }else if(st[i] == next)
		    	break;
		}
		
		input.put(current, count);		
	}

}
