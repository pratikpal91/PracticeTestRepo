package com.java8.lambda;

import java.util.Stack;

public class TestSerialization {
	
	int i;
	
    public TestSerialization(int i) {
		this.i = i;
	}
    
    public TestSerialization() {
		this.i=10;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}

}
