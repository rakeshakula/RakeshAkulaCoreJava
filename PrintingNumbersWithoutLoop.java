/*
 * Created on May 23, 2017
 *
 * This program prints list of numbers as designed by the user. The starting and 
 * ending numbers are inclusive of the list
 */
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

/**
 * @author raakula
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PrintingNumbersWithoutLoop {

	/**
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	int firstNumber;
	public PrintingNumbersWithoutLoop(){
		System.out.println("Please enter the first number : ");
		firstNumber = sc.nextInt(); //Capturing the first number that has to be printed
		System.out.println("Please enter the last number :");
		int secondNumber = sc.nextInt(); //Capturing the last number that has to be printed
		printNumbers(firstNumber,secondNumber); //Calling the method that prints the numbers
	}

	public void printNumbers(int startingNumber,int endingNumber){
		if(startingNumber<=endingNumber){ //Checking whether the first number is smaller or equal to the last number
			System.out.println("The number between "+firstNumber+" and "+endingNumber+" is : "+startingNumber);
			startingNumber++; //incrementing the printed number 
			printNumbers(startingNumber,endingNumber); //calling the current method recursively
		}
	}
	
	public static void main(String[] args) {
		new PrintingNumbersWithoutLoop();
	}
}
