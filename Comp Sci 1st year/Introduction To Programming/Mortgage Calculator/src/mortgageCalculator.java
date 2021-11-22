import java.util.Scanner;
import java.util.NoSuchElementException;
import java.lang.Math;
/* SELF ASSESSMENT
1. Did I use easy-to-understand meaningfu,l properly formatted, variable names and CONSTANTS?
       Mark out of 10: 
       Comment:   
2. Did I indent the code appropriately?
       Mark out of 5: 
       Comment:   
3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
      Mark out of 10: 
       Comment:  
4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
      Mark out of 10: 
       Comment:  
5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
      Mark out of 20: 
       Comment:  
6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
      Mark out of 20: 
       Comment:  
7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easilyunderstood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
      Mark out of 20: 
       Comment:  
8. How well did I complete this self-assessment?
       Mark out of 5: 
       Comment:
Total Mark out of 100 (Add all the previous marks):
 */ 

public class mortgageCalculator {



	public static void main(String[] args) {

		System.out.println("Welcome to the Mortgage Calculator!");

		Scanner calculationInput = new Scanner (System.in); 
		double mortgageAmount = readDoubleFromUser("Please enter the mortgage amount");
		mortgageAmount = calculationInput.nextDouble();
		double annualInterestRate = readDoubleFromUser("Please enter the annual interest rate (APR)");
		annualInterestRate = calculationInput.nextDouble();

		System.out.println("Assuming a 20 year term, the monthly repayments would be " + calculateMonthlyRepayment(mortgageAmount, annualInterestRate) + "."
				+ "\nHow much can you afford to pay per month?");
		double monthlyPayableAmount = calculationInput.nextDouble();

		System.out.println("If you pay " + monthlyPayableAmount + " per month your mortgage would be paid off in "
				+ calculateMonthsToRepayMortgage (mortgageAmount, annualInterestRate, monthlyPayableAmount));

		calculationInput.close();

	}


	public static double readDoubleFromUser (String questionInput)
	{

		try 
		{

			System.out.println(questionInput);

		}

		catch (NoSuchElementException exception)
		{
			System.out.println("Error please input a valid entry");
		}



		return 0.0;
	}

	public static double calculateMonthlyRepayment (double mortgageAmount, double annualInterestRate)
	{

		double monthlyRepayment = 0.0;
		monthlyRepayment = ( mortgageAmount * (annualInterestRate/12/100) / (1-(Math.pow((1+annualInterestRate/12/100), (-20*12)))));

		return monthlyRepayment;
	}

	public static double calculateMonthsToRepayMortgage (double mortgageAmount, double annualInterestRate, double monthlyPayableAmount) 
	{

		double lengthOfMortgageRepaymentRemaining = 0.0;

		while (mortgageAmount >= 0)
		{
			lengthOfMortgageRepaymentRemaining = ((((mortgageAmount)*((annualInterestRate/100)/12))-monthlyPayableAmount));
		}


		return lengthOfMortgageRepaymentRemaining;
	}
}


/* public static final int LENGTH_OF_MORTGAGE_TERM = 240;
 /* double timeLeftForRepayment = 0.0;

		while ( mortgageAmount !=0)
		{
			mortgageAmount = (mortgageAmount - 12*(monthlyPayableAmount));
			mortgageAmount = ((mortgageAmount/100)*4.1);

		} */

/* double totalPayed = 0.0;
		double loanAmountRemaining = 0;
		int month =1;

		while (totalPayed <= mortgageAmount)
		{
			totalPayed = totalPayed + monthlyPayableAmount;
			double totalLoanAmount = mortgageAmount + loanAmountRemaining;
			loanAmountRemaining = totalLoanAmount - totalPayed;
			month++;
		}
 */