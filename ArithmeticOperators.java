package com.capgemini.rakesh.corejava;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice of operation\nPress 'A' for Add\nPress 'S' for Subtract\nPress 'M' for Multiply\nPress 'D' for Divide");
		char choice = sc.next().charAt(0);
		switch (choice) {
		case 'A':
			System.out.println("Enter the first number");
			int firstNumber = sc.nextInt();
			System.out.println("Enter the second number");
			int secondNumber = sc.nextInt();
			System.out.println("The sum of the numbers you have entered is "+ (firstNumber+secondNumber));
			
			break;
case 'S':
			
			break;
case 'M':
	
	break;
case 'D':
	
	break;

		default:
			System.out.println("Please enter the relevant value");
			break;
		}
	}

}
