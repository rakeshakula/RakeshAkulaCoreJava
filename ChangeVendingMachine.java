package com.capgemini.rakesh.corejava;

import java.util.Scanner;

public class ChangeVendingMachine {
	Scanner sc = new Scanner(System.in);
	int twoThousandNotes;
	int thousandNotes;
	int fiveHundredNotes;
	int hundredNotes;
	int fiftyNotes;
	int twentyNotes;
	int tenNotes;
	int fiveRupeeCoins;
	int twoRupeeCoins;
	int oneRupeeCoins;
	public ChangeVendingMachine(){
		System.out.println("Please enter the amount :");
		long amount = sc.nextLong();
		vendingMachine(amount);
	}

	public void vendingMachine(long amount) {
		// TODO Auto-generated method stub
		twoThousandNotes = (int) (amount/2000);
		if(amount>0)
			amount = amount - (twoThousandNotes*2000);
		if(amount>0 )
			thousandNotes = (int)(amount/1000);
		if(thousandNotes>0)
			amount = amount - (thousandNotes*1000);
		if(amount>0 )
			fiveHundredNotes = (int)(amount/500);
		if(fiveHundredNotes>0)
			amount = amount - (fiveHundredNotes*500);
		if(amount>0 && hundredNotes==0)
			hundredNotes = (int)(amount/100);
		if(hundredNotes>0)
			amount = amount - (hundredNotes*100);
		if(amount>0 && fiftyNotes==0)
			fiftyNotes = (int)(amount/50);
		if(fiftyNotes>0)
			amount = amount - (fiftyNotes*50);
		if(amount>0 && twentyNotes==0)
			twentyNotes = (int)(amount/20);
		if(twentyNotes>0)
			amount = amount - (twentyNotes*20);
		if(amount>0 && tenNotes==0)
			tenNotes = (int)(amount/10);
		if(tenNotes>0)
			amount = amount - (tenNotes*10);
		if(amount>0 && fiveRupeeCoins==0)
			fiveRupeeCoins = (int)(amount/5);
		if(fiveRupeeCoins>0)
			amount = amount - (fiveRupeeCoins*5);
		if(amount>0 && twoRupeeCoins==0) 
			twoRupeeCoins = (int)(amount/2);
		if(twoRupeeCoins>0)
			amount = amount - (twoRupeeCoins*2);
		if(amount>0 && oneRupeeCoins==0) 
			oneRupeeCoins = (int)(amount);
		System.out.println("The Denomination is as follows : \n"
				+ "No of 2000 notes to be dispensed :"+twoThousandNotes+
				"\nNo of 1000 notes to be dispensed :"+thousandNotes+
				"\nNo of 500 notes to be dispensed :"+fiveHundredNotes+
				"\nNo of 100 notes to be dispensed :"+hundredNotes+
				"\nNo of 50 notes to be dispensed :"+fiftyNotes+
				"\nNo of 20 notes to be dispensed :"+twentyNotes+
				"\nNo of 10 notes to be dispensed :"+tenNotes+
				"\nNo of 5 notes to be dispensed :"+fiveRupeeCoins+
				"\nNo of 2 notes to be dispensed :"+twoRupeeCoins+
				"\nNo of 1 notes to be dispensed :"+oneRupeeCoins   );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangeVendingMachine();
	}

}
