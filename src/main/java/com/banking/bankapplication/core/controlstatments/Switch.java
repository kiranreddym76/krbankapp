/**
 * 
 */
package com.banking.bankapplication.core.controlstatments;

import java.util.Scanner;

/**
 * 
 */
public class Switch {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Day:--");
		int day=scn.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
			break;//This Statement is Used to Current Itteration is Break..
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Invalid day");
		}
		
	}
}
