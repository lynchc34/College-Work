import java.util.Scanner;

import javax.swing.JOptionPane;

/* SELF ASSESSMENT
1. Did I use easy-to-understand meaningful variable and CONSTANT names? 
    Mark out of 10: 10
    Comment: All constants and variable names are easy to read and meaningful to the values they are representing
2. Did I format the variable and CONSTANT names properly (in lowerCamelCase and UPPERCASE_WITH_UNDERSCORES)?
    Mark out of 10: 10
    Comment: All constants and variable names are formatted and named properly according to standard coding practice
3. Did I indent the code appropriately?
    Mark out of 10: 9
    Comment: Due to the transferring of the file the indentation has been adjusted 
4. Did I read the input correctly from the user using appropriate questions?
    Mark out of 15: 15
    Comment: All of the user inputs were properly properly processed and all necessary information was received 
    from the user by appropriate questions being asked
5. Did I computer the disposable income and disposable income percentage correctly, and output it in the correct format?
    Mark out of 15: 15
    Comment: All of the disposable income is computed correctly and is outputed in the correct format
6. Did I use an appropriate series of if statements to generate the income analysis to the user?
    Mark out of 25: 25
    Comment: All of the if statements are logically inputted to generate the income analysis for the user  
7. Did I provide the correct output for each possibility in an easy to read format?
    Mark out of 10: 10
    Comment: All of the information is given in an easy to read format for the user 
8. How well did I complete this self-assessment?
    Mark out of 5: 5
    Comment: I believe I gave myself a fair and truthful self-assessment
Total Mark out of 100 (Add all the previous marks): 99
*/
public class DisposableIncome {

	public static final double TAX = 0.35;
	public static final int PERCENTAGE = 100;
	public static final double AVERAGE_DISPOSABLE_INCOME = 500.00;
	public static final double AVERAGE_PERCENT = 0.5;


	public static void main(String[] args) {


		String grossIncomeInput = JOptionPane.showInputDialog("How much are you paid a month before tax?");
		Scanner input = new Scanner (grossIncomeInput);
		double income = input.nextDouble();


		String rentInput = JOptionPane.showInputDialog("How much do you pay in rent/ mortgage a month?");
		input = new Scanner (rentInput);
		double rent = input.nextDouble();

		String commuteInput = JOptionPane.showInputDialog("How much does your commute cost a month");
		input = new Scanner (commuteInput);
		double commute = input.nextDouble();

		String foodInput = JOptionPane.showInputDialog("How much do you spend on food a month?");
		input = new Scanner (foodInput);
		double foodCost = input.nextDouble();

		double afterTaxIncome = (income-(income*TAX));
		double disposableIncome = (afterTaxIncome-rent-commute-foodCost);
		double salaryPercentage = (disposableIncome/income);

		JOptionPane.showMessageDialog(null, "Your salary as a percentga is" + salaryPercentage*PERCENTAGE);
		JOptionPane.showConfirmDialog(null, "Your disposable income is" + disposableIncome);
		
		if (disposableIncome == 0) {
			JOptionPane.showMessageDialog(null, "You have no disposable income");
		}
		else if (disposableIncome > (AVERAGE_DISPOSABLE_INCOME*AVERAGE_PERCENT) + AVERAGE_DISPOSABLE_INCOME) {
			JOptionPane.showMessageDialog(null, "Your monthly disposable income is much greater than the average disposable income");
		}
		else if (disposableIncome > AVERAGE_DISPOSABLE_INCOME) {
			JOptionPane.showMessageDialog(null, "Your monthly disposble income is greater than the average disposable income");
		}
		else if (disposableIncome == AVERAGE_DISPOSABLE_INCOME) {
			JOptionPane.showMessageDialog(null, "Your monthly disposable income is exactly the average disposable income");
		}
		else if (disposableIncome < (AVERAGE_DISPOSABLE_INCOME-(AVERAGE_DISPOSABLE_INCOME*AVERAGE_PERCENT))) {
			JOptionPane.showMessageDialog(null,"Your monthly disposable income is much less than the average disposable income");
		}
		else if (disposableIncome < AVERAGE_DISPOSABLE_INCOME) {
			JOptionPane.showMessageDialog(null, "Your monthly disposable income is less than the average disposable income");
		}
		

		input.close();




	}

}
