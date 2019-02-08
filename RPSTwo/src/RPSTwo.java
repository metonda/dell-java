import java.util.Random;
import java.util.Scanner;


public class RPSTwo {

	// Set variables
		public class JavaStringArrayTests
		{
		    private String[] playerChoice = {"Rock", "Paper", "Scissors"};
		}
		public static void main(String[] args) {
			
			// Ask the user for their hand (Rock, Paper, or Scissors)
			System.out.println("Hi player. Let's play rock, paper scissors.");
			System.out.println("Type in rock, paper or scissor. When you press ENTER, I'll show you my hand.");
			Scanner reader = new Scanner(System.in);
			String playerChoice = " ";
			boolean shouldContinue = true;
			while (shouldContinue) {
			try {
				String userInput = reader.nextLine();
				checkUserInput(userInput);
				playerChoice = userInput;
			    shouldContinue = false; // User has entered valid input, tell the while loop to exit
			  } catch (Exception e) { 
	        System.out.println("You need to enter rock, paper, or scissors.");
			  }
			}
//	    reader.close();
			
		
			// Generate a random value as the computer's hand
			Random randNumGenerator = new Random();
		    int randNum = randNumGenerator.nextInt(3); // -> 0, 1, or 2

		    if (randNum == 0) {
		      System.out.println("Rock");
		    }
		    if (randNum == 1) {
		      System.out.println("Paper");
		    }
		    if (randNum == 2) {
		      System.out.println("Scissors");
		    }
		    
//		    reader.close();
			
			// Print out both the user's hand and the computer's hand to the screen
//			System.out.println("You chose " + playerChoice + ".");
//			System.out.println("I chose " + randNum + ".");
			
			// Compare the user's hand against the computer's hand
			// Print out who won
			if (playerChoice.equals("rock") && randNum == 0) {
				System.out.println("It's a tie.");
			}
			
			if (playerChoice.equals("rock") && randNum == 1) {
				System.out.println("I win.");
			}
			
			if (playerChoice.equals("rock") && randNum == 2) {
				System.out.println("You win.");
			}
			
			if (playerChoice.equals("paper") && randNum == 0) {
				System.out.println("You win.");
			}
			
			if (playerChoice.equals("paper") && randNum == 1) {
				System.out.println("It's a tie.");
			}
			
			if (playerChoice.equals("paper") && randNum == 2) {
				System.out.println("I win.");
			}
			
			if (playerChoice.equals("scissors") && randNum == 0) {
				System.out.println("I win.");
			}
			
			if (playerChoice.equals("scissors") && randNum == 1) {
				System.out.println("You win.");
			}
			
			if (playerChoice.equals("scissors") && randNum == 2) {
				System.out.println("It's a tie.");
			}
					
			// TODO Auto-generated method stub. What does this mean?

		}
		public static void checkUserInput(String input) {
			if (!(input.equals("rock") || input.equals("paper") || input.equals("scissors"))) {
			      throw new IllegalArgumentException();
					}
		}
	}
