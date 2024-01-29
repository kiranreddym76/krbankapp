/**
 * 
 */
package com.banking.bankapplication.core;

/**
 * 
 */
public class Fibonacci {
	public static void main(String[] args) {

		int FirstNum, SecondNum, ThirdNum;

		FirstNum = 0;
		SecondNum = 1;
		ThirdNum = 0;

		System.out.println(FirstNum + "  " + SecondNum);

		for (int num = 3; num <= 7; num++) {

			ThirdNum = FirstNum + SecondNum;
			System.out.println("   " + ThirdNum);
			FirstNum = SecondNum;
			SecondNum = ThirdNum;
		}
	}
}
