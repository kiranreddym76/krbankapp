/**
 * 
 */
package com.banking.bankapplication.core;

import java.util.Scanner;

/**
 * 
 */
public class EvenOrOdd {
 
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Num:--");
		int num=scn.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" Is Even");
		} else {
			System.out.println(num+" Is Odd");
		}
	}
}
