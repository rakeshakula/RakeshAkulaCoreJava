/*
 * Created on May 23, 2017
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

/**
 * @author raakula
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PowerOfTwo {
	Scanner sc = new Scanner(System.in);
	int enteredNumber;
	String message;
	public PowerOfTwo(){
		System.out.println("Please enter the number : ");
		enteredNumber = sc.nextInt(); //Capturing the number that has to be checked
		if(isPowerOfTwo(enteredNumber)) //Checking condition to formulate a message
			message = " is a power of 2";
		else 
			message = " is not a power of 2";
		System.out.println("The given number "+"'"+enteredNumber+"'"+message); //Printing out the result
	}

	public boolean isPowerOfTwo(int number){
		
		return ((number!=0) &&  ((number &(number-1))==0)); // Checking the condition whether the given number is not zero and is a power of two
	}
	
	public static void main(String[] args) {
		new PowerOfTwo();
	}
}
