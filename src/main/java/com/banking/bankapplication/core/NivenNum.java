/**
 * 
 */
package com.banking.bankapplication.core;

import java.util.Scanner;

/**
 * 
 */
public class NivenNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		   Scanner scn=new Scanner(System.in);
		   System.out.println("Enter The Number:---");
		   int num=scn.nextInt();
		
		 if(num<0) {
			   System.out.println("No-Negatives");
		   } else {
			   
			   int sum=0;
			  int temp=num;
			  
			   while(num>0) {
				   int rem=num%10;
				   sum=sum+rem;
				   num=num/10;
			   }
			   if(temp%sum==0) {
				   System.out.println("Niven Number");
			   } else {
				   System.out.println("No-Niven Number");
			   }

}
}
}