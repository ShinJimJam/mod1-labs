package qa;

import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		char repeat;
		
		Scanner input = new Scanner(System.in);
		
		do {
				
		System.out.print("Enter amount in GBP: ");
		double amount = input.nextDouble();
		
		System.out.println("Choose currency ");
		System.out.println("1 = USD");
		System.out.println("2 = EUR");
		System.out.println("3 = JPY");
		System.out.print("Your Choice: ");
		int currency = input.nextInt();
		
		System.out.println("Enter customer type (R/V/S)");
		System.out.println("R = Regular");
		System.out.println("V = VIP");
		System.out.println("S = Staff");
		System.out.print("Your Choice: ");
		char customerType = input.next().toUpperCase().charAt(0);
		
		float exchangeRate;
		
		switch (currency) {
		case 1:
			exchangeRate = 1.25f;
			break;
			
		case 2:
			exchangeRate = 1.15f;
			break;
			
		case 3:
			exchangeRate = 180.50f;
			break;
			
		default:
			System.out.println("Invalid currency selection");
			return;
		}
		
		double serviceFee;
		double amountAfterFee;

		if (amount < 100) {
		    serviceFee = amount * 0.05;
		} else {
		    serviceFee = amount * 0.025;
		}

		amountAfterFee = amount - serviceFee;
		
		double taxRate;

		if (customerType == 'R') {
		    taxRate = 0.10;
		} else if (customerType == 'V') {
		    taxRate = 0.05;
		} else if (customerType == 'S') {
		    taxRate = 0.0;
		} else {
		    System.out.println("Invalid customer type");
		    return;
		}

		double tax = amountAfterFee * taxRate;
		double amountAfterTax = amountAfterFee - tax;
		
		double foreignAmount = amountAfterTax * exchangeRate;

		int finalAmount = (int) foreignAmount;
		
		System.out.println("---------------------------");
		System.out.println("Exchange Summary");
		System.out.println("---------------------------");

		System.out.println("Original GBP: £" + amount);
		System.out.println("Amount after service fee: £" + amountAfterFee);
		System.out.println("Amount after tax: £" + amountAfterTax);
		System.out.println("Final foreign currency: " + finalAmount);
		
		System.out.println("---------------------------");
	    System.out.print("Would you like to make another exchange? (Y/N): ");
	    repeat = input.next().toUpperCase().charAt(0);
		
		}
		while (repeat == 'Y');
		input.close();

	}
	
}
