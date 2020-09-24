package com.string;

public class CountOfCharacterInString {
	
	public static void main(String[] args) {
		
		String st = "couCCntofcharaCCterCC";
		
		System.out.println(countOfChar(st,'c'));
		
	}

	private static int countOfChar(String st, char ch) {

		if(st == null || st.isEmpty())
			return 0;
		
		st = st.toLowerCase();
		
		int findex = st.indexOf(ch);
		int lindex = st.lastIndexOf(ch);
		int count =1;
		if(findex != -1 && findex == lindex)
			return 1;
		else if (findex != -1)
		{			
			while(findex != lindex)
			{
				findex = st.indexOf(ch,findex+1);
				count++;
			}
			return count;
		}
		
		
		return 0;
	}

}
