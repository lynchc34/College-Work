import java.util.Scanner;

public class highScoreGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the High Score Game!");
		System.out.println("Please input the amount of numbers you would like to record: ");
		Scanner amountNumberInput = new Scanner (System.in);
		int amountOfNumbers = amountNumberInput.nextInt();

		int [] scoreInput = new int [amountOfNumbers];
		boolean finished = false;


		while (!finished)
		{
			System.out.println("Please input the score you would like to record");
			Scanner newScoreInput = new Scanner (System.in);
			insertScore(scoreInput, newScoreInput.nextInt());
			printHighScores (scoreInput);
			newScoreInput.close();
		}
		
		amountNumberInput.close();



	}

	public static void  initialiseHighScores (int [] scoreInput)
	{
		for (int count =0; count < scoreInput.length; count++)
		{ 
			scoreInput[count] = 0;
		}
	}

	public static void printHighScores (int[] scoreInput)
	{

		System.out.print("The high scores are ");
		for ( int count =0; count < scoreInput.length; count ++)
		{
			if (scoreInput[count]!=0)
			{
				System.out.print( scoreInput[count] + ", ");
			}
		}

	}

	public static boolean higherThan (int newScore, int[] scoreInput)
	{

		for (int count =0; count < scoreInput.length; count ++)
		{
			if (newScore > scoreInput[count])
			{
				return true;
			}
		}



		return false;
	}

	public static void insertScore (int [] scoreInput, int newScore)
	{
		if (higherThan(newScore, scoreInput))
		{
			for (int count =0; count < scoreInput.length && newScore > 0; count ++)
			{
				if (scoreInput[count]==0)
				{
					scoreInput[count] = newScore;
					newScore =-1;
				}
				else if ( scoreInput[count] < newScore )
				{
					for (int count2 =scoreInput.length-1; count2 > count; count2 --)
					{
						scoreInput[count2]= scoreInput[count2-1];
					}
					scoreInput[count] = newScore;
					newScore = -1;
				}
			}
		}


	}





}