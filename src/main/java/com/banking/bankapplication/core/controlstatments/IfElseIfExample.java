/**
 * 
 */
package com.banking.bankapplication.core.controlstatments;

import java.util.Scanner;

/**
 * 
 */
public class IfElseIfExample {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Number:--");
		int number=scn.nextInt();
		
		if(number>0) {
			System.out.println("Posstive Number...");
		} else if(number<0) {
			System.out.println("Negative Number...");
		} else {
			System.out.println("Zero...");
		}
	}
}
