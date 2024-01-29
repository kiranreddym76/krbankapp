package com.banking.bankapplication.core;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		for(int start=1;start<=5;start++) {
			
			fact=fact*start;
		}
         System.out.println("5 Factorial is:"+fact);
	}

}
