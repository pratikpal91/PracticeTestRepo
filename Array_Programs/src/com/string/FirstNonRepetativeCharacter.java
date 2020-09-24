package com.string;

public class FirstNonRepetativeCharacter {

	
	public static void main(String[] args) {
		
		String st = "tenten";
		
	    System.out.println(findFirstNRChar(st));
		
	}

	private static String findFirstNRChar(String st) {
		
		if(st.isEmpty() || st == null)
		{
			return "";
		}
		
		for(int i = 0 ; i <st.length();i++)
		{
			char ch = st.charAt(i);
			int lindex = st.lastIndexOf(ch);
			int findex = st.indexOf(ch);
			if(findex == i && lindex ==i)
			{
				return ""+ch;
			}
		}		
		return "None Found";
	}
}
