/**
 * 
 */
package com.banking.bankapplication.core;

import java.util.Scanner;

/**
 * 
 */
public class ScannerClass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the two values");
		int firstEle=scn.nextInt();
		double secondEle=scn.nextDouble();
		String name=scn.next();
		double sum=firstEle+secondEle;
		System.out.println("sum of gives two number = "+sum);
		System.out.println("enter name = "+name);

	}
}
