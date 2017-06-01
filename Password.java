package com.capgemini.rakesh.corejava;

import java.util.Scanner;

public class Password {
	Scanner sc = new Scanner(System.in);
	String enteredString;
	public Password(){
		System.out.println("Please enter the password");
		enteredString = sc.next();
		passwordValidation(enteredString);
	}

	public void passwordValidation(String text){
		if((text!=null) && (text.length()>=10) && (text.matches("[a-zA-Z0-9]*"))&& containsTwoDigits(text)){
			System.out.println("Password is validated and is successful");
		}
		else {
			System.out.println("The entered password is invalid");
		}
	}
	public boolean containsTwoDigits(String text) {
		// TODO Auto-generated method stub
		int counter = 0;
		for (char c : text.toCharArray()) {
		    if (Character.isDigit(c)) {
		        // found invalid char
		    	counter++;
		    }
		}
		if (counter>=2)
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Password();
	}

}
