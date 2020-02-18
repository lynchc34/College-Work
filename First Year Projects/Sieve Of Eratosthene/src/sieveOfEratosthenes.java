/* SELF ASSESSMENT 
   1.  createSequence:
Did I use the correct method definition?
Mark out of 5:
Comment:
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5:
Comment:
Did I return the correct item?
Mark out of 5:
Comment:
   2.  crossOutMultiples
Did I use the correct method definition?
Mark out of 5:
Comment:
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2:
Comment:
Did I loop through the array using the correct multiple?
Mark out of 5:
Comment:
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3:
Comment:
   3.  sieve   
Did I have the correct function definition?
Mark out of 5:
Comment:
Did I make calls to other methods?
Mark out of 5:
Comment:      
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2:
Comment:
   4.  sequenceTostring  
Did I have the correct function definition?
Mark out of 5:
Comment:
Did I ensure the parameter to be used is not null?
Mark out of 3:
Comment: 
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10:
Comment:    
   5.  nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5:
Comment:        
Did I ensure the parameter to be used is not null?  
Mark out of 3:
Comment:
Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5:
Comment:
   6.  main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5:
Comments:
Did I make calls to other methods (at least one)?
Mark out of 5:
Comment:  
Did I print the output as shown in the question?  
Mark out of 5:
Comment:  
   7.  Overall
Is my code indented correctly?
Mark out of 4:
Comments:
Do my variable names make sense?
Mark out of 4:
Comments:
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4:
Comments:
      Total Mark out of 100 (Add all the previous marks): 
*/

import java.util.Scanner;

public class sieveOfEratosthenes {

	public static void main(String[] args) {
		
		Scanner numberScanner = new Scanner (System.in);
		System.out.println("Please enter an intger that is >=2 : ");
		int numberEntered =0;
		
		if (numberScanner.hasNextInt())
		{
			
			numberEntered = numberScanner.nextInt();
			if (numberEntered >= 2)
			{
				
			}
			
			else {
				System.out.println("You must enter an integer that is >=2");
			}
		}
		
		numberScanner.close();

	}

	public static int[] createSequence (int numberEntered) {
		
		int [] primeSequence = new int[numberEntered-1];
		int temporaryNumber = 2;
		for (int count =0; count < primeSequence.length; count ++)
		{
			primeSequence[count] = temporaryNumber;
			temporaryNumber++;		
		}
		
		return primeSequence;
		
	}
	
	public static int[] crossOutHigherMultiples (int [] numberSequence) {
		
		if (numberSequence != null)
		{
			int baseMultiple =2;
			while (baseMultiple <= Math.sqrt(numberSequence.length+2))
			{
				for (int count = baseMultiple; count < numberSequence.length; count++ )
				{
					if (numberSequence[count]>0 && numberSequence[count] % baseMultiple == 0)
						numberSequence[count] *= -1;
				}
				
				System.out.println(sequenceToString(numberSequence));
				baseMultiple++;
			}
		}
		
		return numberSequence;
	}
	
	public static int[] sieve (int numberEntered) {
	
		int[] sequence = createSequence(numberEntered);
		System.out.println(sequenceToString(sequence));
		sequence = crossOutHigherMultiples (sequence);
		return sequence;
	}
	
	public static String sequenceToString (int[] numberSequence) {
		
		String numberSequenceString = "";
		
		for (int count : numberSequence)
		{
			
		}
		
		
		return "";
	}
	
	
	public static String nonCrossedOutSubseqToString (int [] numberSequence) {
		
		String numberSequenceString = "";
		
		for ( int count : numberSequence)
		{
			if ( count > 0)
			{
				numberSequenceString += count + ", ";
			}
		}
		
		return numberSequenceString;
		
	}
}
