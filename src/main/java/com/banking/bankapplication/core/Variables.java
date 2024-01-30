/**
 * 
 */
package com.banking.bankapplication.core;

/**
 * 
 */
public class Variables {

	/**
	 * @param args
	 */
	static long accountNum=34757350463l;//Static Variable
	int number=97;   //Non-Static Variable
	public static void main(String[] args) {
		
		String subject="Java";//Local Variable

		
		System.out.println("Subject is:--"+subject);
		System.out.println("AccountNum is:--"+accountNum);
		
		Variables variable=new Variables();//Object Creation
		System.out.println("Number is:--"+variable.number);
	}

}
