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
	int monthValue;
	int[] months30 = {04,06,9,11};
	int[] months31 = {01,03,05,07,8,10};
	int[] months;
	int oddDays;
	boolean valueAvailable;
	public DateDayRetrieval(){
		dateEntryAndValidation();
		
	}
	public void dateEntryAndValidation(){
		System.out.println("Please enter the date in DDMMYY format");
		enteredDate = sc.next();
		int dateValue = Integer.parseInt(enteredDate.substring(0,2));
		monthValue = Integer.parseInt(enteredDate.substring(2,4));
		int yearValue = Integer.parseInt(enteredDate.substring(4,6));
		System.out.println(dateValue+" "+monthValue+" "+yearValue);
		monthName();
		if(!monthAvailable(monthValue)){
			oddDays= monthValue/7;
		}
		
		if((null!=enteredDate)||("".equalsIgnoreCase(enteredDate)||(enteredDate.length()!=6))){
			System.out.println("Please re-enter the digits");
			dateEntryAndValidation();
		}
		else if(dateValue<1 || dateValue>31){
			System.out.println("Entered Date should be between 1 and 31");
			dateEntryAndValidation();
		}
		
		else if(yearValue>2017){
			System.out.println("Please enter a valid year");
			dateEntryAndValidation();
		}
		else{
		dayFinder(enteredDate);
		}
	}
	public void monthName(){
		switch (monthValue) {
		case 01:
			monthName = "January";
			oddDays = 3;
			break;
		case 02:
			monthName = "February";
			break;
		case 03:
			monthName = "March";
			break;
		case 04:
			monthName = "April";
			break;
		case 05:
			monthName = "May";
			break;
		case 06:
			monthName = "June";
			break;
		case 07:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;

		default:
			System.out.println("Please enter a valid month");
			monthName();
			break;
		}
	}
	public boolean monthAvailable(int value){
		if(monthValue!=0){
			months = new int[months30.length+months31.length];
			int i;
			for(i=0;i<months30.length;i++)
				months[i] = months30[i];			
			for (int j = 0; j < months31.length; j++) 
				months[i++]=months31[j];
			for(int k=0;k<months.length;k++){
				if(monthValue==months[k]){
					valueAvailable = true;
				}
				else 
					valueAvailable = false;
			}
		}
		else 
			valueAvailable = false;
		return valueAvailable;
	}
	public void dayFinder(String date){
		
	}
	public static void main(String[] args) {
		new DateDayRetrieval();
	}
}
