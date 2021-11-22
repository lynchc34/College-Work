import java.util.Scanner;

public class multiples5 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("Input a number you would like to know the multiples of");
		double inputtedNumber = input.nextDouble();
		if (inputtedNumber <= 0)
		{ System.out.println ("Nope");
		}

		System.out.println("Input the number you would like to know the multiples up to");
		double maxNumber = input.nextDouble();
		if (maxNumber <= 0)
		{ System.out.println ("Forget it");
		}

		System.out.println ("The multiples of the " + inputtedNumber + " up to " + maxNumber + " are");
		for (int count = 0; (count < maxNumber); count += inputtedNumber )
		{ System.out.print (count + ",");

		}


		input.close();

	}

}