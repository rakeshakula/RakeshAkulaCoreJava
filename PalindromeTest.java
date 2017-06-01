/*
 * Created on May 26, 2017
 *
 * TODO 
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

/**
 * @author raakula
 *
 * TODO Sample java program to test if a given string is a palindrome or not
 * 
 */
public class PalindromeTest {
	Scanner sc = new Scanner(System.in);
	String enteredValue; 
	public PalindromeTest(){
		System.out.println("Please enter the string :"); 
		enteredValue = sc.next(); // Taking the input from console
		palindromeCheck(enteredValue); //Calling the method which checks if the given string is a palindrome or not
	}
	
	public void palindromeCheck(String value){
		String originalString = value;
		int counter =0;
		for(int i=0;i<value.length();i++){ //Iterate the string 
			String currentChar = value.substring(i,i+1);
			if(!currentChar.equalsIgnoreCase(value.substring(value.length()-i-1,value.length()-i))){ //if starting letter and ending letter are not same increment the counter. Increment the positions further
				counter++;
			}
		}
		if(counter>0) //if counter is not zero it is not a palindrome else it is a palindrome
			System.out.println("The given string "+"'"+enteredValue+"'"+" is not a palindrome");
		else 
			System.out.println("The given string "+"'"+enteredValue+"'"+" is a palindrome");
	}

	public static void main(String[] args) {
		new PalindromeTest();
	}
}
