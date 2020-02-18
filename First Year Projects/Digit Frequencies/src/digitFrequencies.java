import java.util.Scanner;
public class digitFrequencies {

	public static final int NUMBER_OF_DIGITS =10;
	
	public static void main(String[] args) {
		
		int [] frequencies = new int [NUMBER_OF_DIGITS];
		for (int count =0; count < NUMBER_OF_DIGITS; count++)
		{
			frequencies[count] =0;
		}
		
		
		boolean finished = false;
		
		while (!finished)
		{
			System.out.println("PLease enter a number --> ");
			Scanner numberInput = new Scanner (System.in);
			if (numberInput.hasNextInt())
			{
				int number = numberInput.nextInt();
				countDigitFrequencies (number, frequencies);
				printDigitFrequencies (frequencies);
			}
			numberInput.close();
		}
		

	}

	public static void countDigitFrequencies (int number, int[] frequencies)
	{
		int remainingNumber = Math.abs(number);
		do
		{
			int digit = remainingNumber%10;
			remainingNumber /=10;
			frequencies[digit]++;
		} while (remainingNumber > 0);
	}
	
	public static void printDigitFrequencies (int[] frequencies)
	{
		System.out.print("Digit Frequencies: ");
		if (frequencies != null)
		{
			boolean quit = false;
			for ( int count =0; count < NUMBER_OF_DIGITS; count++)
			{
				if(frequencies[count]>0)
				{
					System.out.print( (quit ? ", " : "" ) + count + "(" + frequencies[count] + ")" );
					quit = true;
				}
			}
				System.out.println();
		}
			
	}
}
