package lab1d;

import java.util.Random;

public class Utils {

	public String getGrade(int mark) {

	    if (mark >= 1 && mark < 50) {
	        return "Fail";
	    }
	    else if (mark >= 50 && mark <= 60) {
	        return "Pass";
	    }
	    else if (mark >= 61 && mark <= 70) {
	        return "Merit";
	    }
	    else if (mark >= 71 && mark <= 100) {
	        return "Distinction";
	    }
	    else {
	        return "Error: marks must be between 1..100";
	    }

	}
	
	public void multiplicationTable() {

	    for (int row = 1; row <= 10; row++) {
	        for (int col = 1; col <= 10; col++) {
	            System.out.printf("%5d", col * row);
	        }
	        System.out.println();
	    }
	}
	

	static String[] cards = {
	    "A ♠", "2 ♠", "3 ♠", "4 ♠", "5 ♠", "6 ♠", "7 ♠", "8 ♠",
	    "9 ♠", "10 ♠", "J ♠", "Q ♠", "K ♠",
	    "A ♥", "2 ♥", "3 ♥", "4 ♥", "5 ♥", "6 ♥", "7 ♥", "8 ♥",
	    "9 ♥", "10 ♥", "J ♥", "Q ♥", "K ♥",
	    "A ♣", "2 ♣", "3 ♣", "4 ♣", "5 ♣", "6 ♣", "7 ♣", "8 ♣",
	    "9 ♣", "10 ♣", "J ♣", "Q ♣", "K ♣",
	    "A ♦", "2 ♦", "3 ♦", "4 ♦", "5 ♦", "6 ♦", "7 ♦", "8 ♦",
	    "9 ♦", "10 ♦", "J ♦", "Q ♦", "K ♦"
	};
	
	static int[] values = {
	    10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
	    10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
	    10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
	    10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
	};


	public void drawThreeCards() {
	
	    Random rand = new Random();
	    
	    boolean[] drawn = new boolean[cards.length];
	
	    int total = 0;
	    
	    for (int i = 0; i < 3; i++) {
	    
	    	int index;

        // Keep generating random indexes until we find an unused card
	        do {
	            index = rand.nextInt(cards.length);
	        } while (drawn[index]);
	        
	    // Mark this card as drawn
	        drawn[index] = true;
	
	        String card = cards[index];
	        int value = values[index];
	
	        System.out.println("Card: " + card + " - Value: " + value);
	
	        total = total + value;
	
	    }
	
	    System.out.println("Total value: " + total);

	}
	

public void playCardGame() {

    Random rand = new Random();

    boolean[] drawn = new boolean[cards.length];

    int player1Total = 0;
    int player2Total = 0;

    // Player 1's hand
    System.out.println("\nPlayer 1's hand:");

    for (int i = 0; i < 3; i++) {

        int index;

        do {
            index = rand.nextInt(cards.length);
        } while (drawn[index]);

        drawn[index] = true;

        System.out.println(cards[index] + " - Value: " + values[index]);

        player1Total = player1Total + values[index];
    }

    System.out.println("Player 1 total: " + player1Total);


    // Player 2's hand
    System.out.println("\nPlayer 2's hand:");

    for (int i = 0; i < 3; i++) {

        int index;

        do {
            index = rand.nextInt(cards.length);
        } while (drawn[index]);

        drawn[index] = true;

        System.out.println(cards[index] + " - Value: " + values[index]);

        player2Total = player2Total + values[index];
    }

    System.out.println("Player 2 total: " + player2Total);


    // Compare the scores
    System.out.println("\nResult:");

    if (player1Total > player2Total) {
        System.out.println("Player 1 wins!");
    }
    else if (player2Total > player1Total) {
        System.out.println("Player 2 wins!");
    }
    else {
        System.out.println("It's a draw!");
    }

}

	
	

}
