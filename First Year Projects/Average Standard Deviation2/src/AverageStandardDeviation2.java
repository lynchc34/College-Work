import java.util.Scanner;

public class AverageStandardDeviation2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println("This program computes the average and standard deviation of a list of numbers.");
		double[] numbers = null;
		double total = 0.0;
		boolean finished = false;
		do {
			System.out.print("Enter a number to add to the list (enter quit to finish) >>  ");
			if (input.hasNextDouble())
			{
				// Extend array and store new number.
				double[] newNumbers = new double[(numbers==null)?1:numbers.length+1];
				if (numbers!= null)
					System.arraycopy( numbers, 0, newNumbers, 0, numbers.length );
				newNumbers[newNumbers.length-1] = input.nextDouble();;
				numbers = newNumbers;
				total += numbers[numbers.length-1];
			}
			else finished = true;
		} while (!finished);
		
		if (numbers != null)
		{
			double average = total/((double) numbers.length);
			double sumOfSquaredDifferences = 0.0;
			for (int index=0; index < numbers.length; index++)
			{
				sumOfSquaredDifferences += Math.pow(numbers[index]-average,2.0);
			}
			double standardDeviation = Math.sqrt(sumOfSquaredDifferences/((double) numbers.length));
			System.out.println("The average is " + average + " and the standard deviation is " + standardDeviation);
		}
		
		input.close();
		
	}

}