/*
 * Created on May 24, 2017
 *
 * Program to check if the list of numbers between any 2 given numbers 
 * has prime numbers or not. 
 */
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

/**
 * @author raakula
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PrintPrimeNumbers {
	
		Scanner sc = new Scanner(System.in);
		int firstNumber;
	public PrintPrimeNumbers(){

			System.out.println("Please enter the first number : ");
			firstNumber = sc.nextInt(); //Capturing the first number that has to be checked
			System.out.println("Please enter the last number :");
			int secondNumber = sc.nextInt(); //Capturing the last number that has to be checked
			printPrimeNumbers(firstNumber,secondNumber); //Calling the method that prints the prime numbers
		}
	public void printPrimeNumbers(int startingNumber, int endingNumber){
		int counter = 0;
		if(startingNumber<endingNumber){
			for(int a = startingNumber;a<=endingNumber;a++){
				
				counter = 0;
				for(int i = 1; i<=a;i++){
					int j = a%i; //gives the remainder
					if(j==0){
						counter++; //counts the number of times the remainder was 0
					}
				}
				if(counter==2) // If the count is 2 its a prime number
					System.out.println(a+" is a prime number between "+firstNumber+ " and "+endingNumber);
			}
			
		}
		else 
			System.out.println("The given first number "+"'"+firstNumber+"'"+" is greater in value than the second number "+"'"+endingNumber+"'"+".");
		
	}

	public static void main(String[] args) {
		new PrintPrimeNumbers();
	}
}
