package com.basicProgram;

import java.awt.print.Printable;
import java.util.EnumMap;
import java.util.EnumSet;

enum Status{
	
	BEGINNER,AMETURE,ADVANCE,PROEFFICIENT;
}

public class EnumSetExample{
	
	public static void main(String[] args) {
		
		EnumSet<Status> set1,set2,set3,set4;
		
		set1 = EnumSet.of(Status.BEGINNER,Status.AMETURE,Status.ADVANCE);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(Status.class);
		set4 = EnumSet.range(Status.BEGINNER, Status.ADVANCE);
		
		System.out.println("Set1 "+ set1);
		System.out.println("Set2 "+ set2);
		System.out.println("Set3 "+ set3);
		System.out.println("Set4 "+ set4);
		
		EnumMap<Status, String> eMap = new EnumMap<>(Status.class);
		
	}

}
