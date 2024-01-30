/**
 * 
 */
package com.banking.bankapplication.core;

import java.util.Scanner;

/**
 * 
 */
public class ScannerClass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		  System.out.println("enter the two values..");
		  int firstEle=scn.nextInt();
		  int secondEle=scn.nextInt();
		  String name=scn.next();
		  int sum=firstEle+secondEle;
		  System.out.println("sum of given two number="+sum);
		  System.out.println("enter name="+name);

	}

}
