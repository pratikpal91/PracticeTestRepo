package com.java8.lambda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test1Serialization extends TestSerialization implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1798111212761818826L;
	int j ;
	int k ;
    int l;	
    public Test1Serialization(int i, int j, int k) {
         super(i);
         this.j = j;
         this.k = k;    
    }
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		
    	FileOutputStream fos = new FileOutputStream("C:/Users/prpal/Documents/steam.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	
    	Test1Serialization test = new Test1Serialization(15,20, 30);
    	
    	oos.writeObject(test);
    	oos.flush();
    	oos.close();
    	System.out.println(test);
    	
    	FileInputStream fis = new FileInputStream("C:/Users/prpal/Documents/steam.txt");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	TestSerialization obj = (TestSerialization)ois.readObject();
    	ois.close();
    	System.out.println(obj);    
    	
    	for(int i =10 ; ++i < 20;)
    	{
    		System.out.println(i);
    	}
    	
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString()+" "+String.valueOf(j)+" "+String.valueOf(k);
    }

}
