package lab1c;

public class Program {

	public static void main(String[] args) {
		
		Utils utils = new Utils();
		/*
		int number = getInt("Enter a number: ");
		
		String name = getString("Enter you name: ");
		
		System.out.println("Your number is: " + number);
		System.out.println("Your name is: " + name);
		*/

		// Part 2 - Lunch queue
		theLunchQueue(utils);
		
        // Part 3 - Pounds conversion
        int pounds = utils.getInt("\nEnter your weight in pounds: ");
        convertInputToStonesPounds(pounds);
        
        int kg = utils.getInt("\nEnter your weight in kilograms: ");
        convertKgsToStonesPounds(kg);
	}
	
	
	public static void theLunchQueue(Utils utils) {
		
		String mainCourse = utils.getString("What main dish would you like (Fish, Burgers or Veg)? ");
		
		int roastPotatoes = utils.getInt("How many roast potatoes? ");
		int brusselSprouts = utils.getInt("How many brussel sprouts? ");
		
		System.out.println("Hello, your lunch is " + mainCourse + " with " + roastPotatoes + " roast potatoes and " + brusselSprouts + " Brussel sprouts.");
	}
	
	public static void convertInputToStonesPounds(int pounds) {
        int stones = pounds / 14;
        int remainingPounds = pounds % 14;
        System.out.println(pounds + " pounds is " + stones + " stones and " + remainingPounds + " pounds.");

    }

    public static void convertKgsToStonesPounds(int kg) {

        int pounds = (int) Math.round(kg * 2.20462);
        convertInputToStonesPounds(pounds);

    }
	
}
