package lab4;

public class Program {

	public static void main(String[] args) {
		
		Utils utils = new Utils();
		
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		
		
//Part 1 – Getting started!
		
		// Task 1 - Find the sum
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		System.out.println("Sum: " + sum);
		
		// Task 2 - Find the average
		int average = (int) sum / numbers.length;
		
		System.out.println("Average: " + average);
		
		
		// Task 3 - Find the minimum
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
		    if (numbers[i] < min) {
		    	min = numbers[i];
		    	}
		}
		
		System.out.println("Minimum: " + min);
		
		// Task 4 - Find the maximum
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
		    if (numbers[i] > max) {
		        max = numbers[i];
		    }
		}

		System.out.println("Maximum: " + max);
		
		// Task 5 – Find the index of zero
		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i] == 0) {
		        System.out.println("Zero found at index: " + i + "\n");
		    }
		}
		
//Part 2 – Calculating the grades for five students 
		
		String[] students = {"James", "Sarah", "Tom", "Emily", "Jack"};

			int[] mark = {75, 60, 48, 85, 101};
			
        for (int i = 0; i < students.length; i++) {
        	String grade = utils.getGrade(mark[i]);

            System.out.println(students[i] + " scored " + mark[i] + " and achieved " + grade);
        }
        
//Part 3 – How long does it take to double your money?     
        System.out.println("\nHow long does it take to double your money?");

        double initialMoney = 100.00;
        double currentMoney = initialMoney;
        double interestRate = 0.05;
        int years = 0;

        while (currentMoney < 200) {
        	currentMoney = currentMoney * (1 + interestRate);
            years++;

        }

        System.out.println("It takes " + years + " years to double your money.");

        System.out.printf("Final balance: £%.2f%n", currentMoney);
        
 //Part 4 – Nested loop practice
        System.out.println("\nMultiplication Table");

	    utils.multiplicationTable();
	    
// Lab challenge (if you have time), Loops and Arrays
	    System.out.println("\nDrawing three random cards:");

	    utils.drawThreeCards();
        
	    System.out.println("\nTwo Player Card Game:");

	    utils.playCardGame();
	    
	}
	
}
