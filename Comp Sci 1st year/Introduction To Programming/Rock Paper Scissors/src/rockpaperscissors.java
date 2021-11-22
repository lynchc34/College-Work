/* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10: 7
       Comment: I used legible and easy-to-understand variable and constant names within the code
       however I did not use constants completely throughout the code due to looking at the way the 
       information was inputted in the example and following the numbers corresponding to the rock, paper 
       and scissors
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: Yes all variable and constant names are formatted in appropraite casing
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: The computer's choice was generated correctly using the Random number generator
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: All inputs from the user are received correctly in each game
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: All of the choices are correctly compare between the user and computer and then as a 
       result each score is updated accordingly
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 10
       Comment: The user is infomred after each round who won and the winning move
   7. Did I use an appropriate for loop to allow the player to play 5 games?  
   	  There should be only one loop.
       Mark out of 20: 20
       Comment: A for loop was used to allow the user to play only five games
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10: 10
       Comment: The final scores were correctly outputted and formatted correctly after five games were
       played
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I feel that i completed this self-assessment accurately and without bias
   Total Mark out of 100 (Add all the previous marks): 97
 */


import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors {

	public static final int GAMES_ALLOWED = 5;

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int userScore = 0;
		int computerScore = 0;


		System.out.println("You are about to start the Rock, Paper, Scissors Game!");
		Random generator = new Random();

		int userChoice =0;
		int computerChoice = 0;

		for (int count = 0; count < GAMES_ALLOWED; count++)

		{

			System.out.println("Please pick a number, 1 for Rock, 2 for Paper and 3 for Scissors.");
			userChoice = input.nextInt();
			computerChoice = generator.nextInt(3)+1;
			if ( userChoice == 1 && computerChoice == 3)
			{
				System.out.println("You win because I chose Scissors!");
				userScore++;
			}
			else if (userChoice == 1 && computerChoice == 1)
			{
				System.out.println ("We draw, we both chose Rock!");
			}
			else if (userChoice == 1 && computerChoice == 2)
			{
				System.out.println("I win because I chose Paper!");
				computerScore++;
			}
			else if (userChoice == 3 && computerChoice == 2)
			{
				System.out.println("You win because I chose Paper!");
				userScore++;
			}
			else if (userChoice==3 && computerChoice==3)
			{
				System.out.println("We draw, we both chose Scissors!");
			}
			else if (userChoice == 2 && computerChoice ==2)
			{
				System.out.println("We draw, we both chose Paper!");
			}
			else if (userChoice == 3 && computerChoice == 1)
			{
				System.out.println("I win because I chose Rock!");
				computerScore++;
			}
			else if (userChoice== 2 && computerChoice ==3)
			{
				System.out.println("I win because I chose Scissors!");
				computerScore++;
			}
			else if (userChoice == 2 && computerChoice == 1)
			{
				System.out.println ("You win because I chose Rock!");
				userScore++;
			}

		}
		input.close();
		System.out.println("Your score is " +userScore + " my score is " +computerScore);


	} 
}