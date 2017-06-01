/*
 * Created on May 26, 2017
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
public class DateDayRetrieval {
	Scanner sc = new Scanner(System.in);
	String enteredDate;
	String monthName;
	int dateValue;
	int monthValue;
	int yearValue;
	
	int[] months30 = {04,06,9,11};
	int[] months31 = {01,03,05,07,8,10};
	int[] months;
	int monthOddDays;
	
	boolean valueAvailable;
	public DateDayRetrieval(){
		dateEntryAndValidation();
		
	}
	public void dateEntryAndValidation(){ // Validates the date entered
		System.out.println("Please enter the date in DDMMYYYY format");
		enteredDate = sc.next();
		dateValue = Integer.parseInt(enteredDate.substring(0,2)); //Extracting the date from the Entered String 
		monthValue = Integer.parseInt(enteredDate.substring(2,4)); //Extracting the month from the Entered String
		yearValue = Integer.parseInt(enteredDate.substring(4,8)); //Extracting the year from the Entered String 
		System.out.println(dateValue+"-"+monthValue+"-"+yearValue); //printing the individual values
		if((null==enteredDate)||("".equalsIgnoreCase(enteredDate))||(enteredDate.length()!=8)){ //Validating the length of date
			System.out.println("Please re-enter the digits");
			dateEntryAndValidation();
		}
		if(!monthAvailable(monthValue)){ //If the month is not of 30 or 31 days then it is February
			monthOddDays= monthValue/7;
		}
		
		if(dateValue<1 || dateValue>31){
			System.out.println("Entered Date should be between 1 and 31");
			dateEntryAndValidation();
		}
		else{
		dayFinder(enteredDate);
		}
	}
	public int monthName(int value){
		switch (value) {
		case 0:
			monthOddDays = 0;
			break;
		case 01:
			monthOddDays = 3;
			break;
		case 02:
			break;
		case 03:
			monthOddDays = 6;
			break;
		case 04:
			monthOddDays = 8;
			break;
		case 05:
			monthOddDays = 11;
			break;
		case 06:
			monthOddDays = 13;
			break;
		case 07:
			monthOddDays = 16;
			break;
		case 8:
			monthOddDays = 19;
			break;
		case 9:
			monthOddDays = 21;
			break;
		case 10:
			monthOddDays = 24;
			break;
		case 11:
			monthOddDays = 26;
			break;
		case 12:
			monthOddDays = 28;
			break;

		default:
			System.out.println("Please enter a valid month");
			monthName(value);
			break;
		}
		return monthOddDays;
	}
	public boolean monthAvailable(int value){
		if(value!=0){
			months = new int[months30.length+months31.length];
			int i;
			for(i=0;i<months30.length;i++)
				months[i] = months30[i];			
			for (int j = 0; j < months31.length; j++) 
				months[i++]=months31[j];
			for(int k=0;k<months.length;k++){
				if(value==months[k]){
					valueAvailable = true;
				}
				
			}
		}
		else 
			valueAvailable = false;
		return valueAvailable;
	}
	public void dayFinder(String date){
		int finalOddDays = (yearOddDay(yearValue-1) + monthOddDay(monthValue-1) + daysOddDay(dateValue))%7;
			finalOddDays+=1;
		switch(finalOddDays)
		{
		case 0:
			System.out.println("The date "+enteredDate+" falls on Sunday");
			break;
		case 1:
			System.out.println("The date "+enteredDate+" falls on Monday");
			break;
		case 2:
			System.out.println("The date "+enteredDate+" falls on Tuesday");
			break;
		case 3:
			System.out.println("The date "+enteredDate+" falls on Wednesday");
			break;
		case 4:
			System.out.println("The date "+enteredDate+" falls on Thursday");
			break;
		case 5:
			System.out.println("The date "+enteredDate+" falls on Friday");
			break;
		case 6:
			System.out.println("The date "+enteredDate+" falls on Saturday");
			break;
		default : 
			System.out.println("Error in program. Loading again...");
			new DateDayRetrieval();
			break;

		}
	}
	public int daysOddDay(int day) {
		// TODO Auto-generated method stub
		return day%7;
	}
	public int monthOddDay(int month) {
		// TODO Auto-generated method stub
		
		return monthName(month);
	}
	public int yearOddDay(int year) {
		// TODO Auto-generated method stub
		
		int yearOddDays = 0 ;
		year = year%400;
		if(year>300){
			int leapyears = (year - 300)/4;
			int normalYears = year - 300 - leapyears;
			yearOddDays = (1 + (leapyears*2)+normalYears)%7;
		}
		else if (year>200){
			int leapyears = (year - 200)/4;
			int normalYears = year - 200 - leapyears;
			yearOddDays = (3 + (leapyears*2)+normalYears)%7;
		}
		else if (year>100){
			int leapyears = (year - 100)/4;
			int normalYears = year - 100 - leapyears;
			yearOddDays = (5 + (leapyears*2)+normalYears)%7;
		}
		else {

			int leapyears = year/4;
			int normalYears = year - leapyears;
			yearOddDays = ((leapyears*2)+normalYears)%7;
		
		}
		
		return yearOddDays;
	}
	public static void main(String[] args) {
		new DateDayRetrieval();
	}
}
