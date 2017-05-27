/*
 * Created on May 23, 2017
 *
 * This program counts the characters in a string 
 * The characters are case insensitive
 */
package com.capgemini.rakesh.corejava;

import java.util.Scanner;

/**
 * @author raakula
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CountingCharInAString {
	Scanner sc = new Scanner(System.in);
	String wholeString;
	String countCharacter;
	int occurences;
	
	public CountingCharInAString(){
		System.out.println("Please enter the string :");
		wholeString = sc.next(); // Take the value of the String
		System.out.println("Please enter the character :");
		countCharacter = sc.next().substring(0,1); //Take the character and store it as a string
	
		count(); //Call method to perform the counting operation
	}

	public void count(){
		for(int i =0;i<wholeString.length();i++){ // Iterates the string to compare
			String currentCharacter = wholeString.substring(i,i+1); //Identifying current character for comparison
			if(currentCharacter.equalsIgnoreCase(countCharacter)){ //check if the characters are matching
				occurences++; //increment the counter
			}
		}
		System.out.println("The number of occurrences of the character "+countCharacter+" in the string "+"**"+wholeString+"**"+" is "+occurences); //Print the number of preferences
	}
	public static void main(String[] args) {
		new CountingCharInAString();
	}
}
