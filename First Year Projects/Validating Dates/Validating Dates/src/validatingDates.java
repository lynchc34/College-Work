import java.util.NoSuchElementException;
import java.util.Scanner;

public class validatingDates {
	
	public static final int DAYS_IN_FEBRUARY_IN_LEAP_YEAR = 29;
	public static final int DAYS_IN_FEBRUARY_NORMALLY = 28;
	public static final int DAYS_IN_SEPT_APR_JUN_NOV = 30;
	public static final int DAYS_IN_JAN_MAR_MAY_JUL_AUG_OCT_DEC = 31;
	public static final int MONTHS_IN_YEAR = 12;
	

	public static void main(String[] args) {
		
		try 
		{
		System.out.println("Please enter the date you would like to be validated?");
		Scanner dateInput = new Scanner (System.in);
		int dayInput = dateInput.nextInt();
		int monthInput = dateInput.nextInt();
		int yearInput = dateInput.nextInt();
		
		if (validDate ( dayInput, monthInput, yearInput)) 
		{
			System.out.println(dayInput + " " + monthInput + " " + yearInput + " "+ " is a valid date.");
		}
		else 
		{
			System.out.println(dayInput + " " + monthInput + " " + yearInput + " "+ " is not a valid date.");
		}
		
		dateInput.close();
		}
		catch (NoSuchElementException exception)
		{
			System.out.println("Error \nNo valid entry inputted\nPlease enter a date to be validated");
		}
	} 
	
	public static boolean validDate (int dayInput, int monthInput, int yearInput) {
		
		return ((yearInput >= 0) && (monthInput>=1) && (monthInput <= MONTHS_IN_YEAR) && (dayInput >= 1) 
														&& (dayInput <=daysInMonth( dayInput, monthInput, yearInput)));
		
	}
	
	public static int daysInMonth (int dayInput, int monthInput, int yearInput) {
		
		int daysInMonth = 0;
		
		switch (monthInput)
		{
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				daysInMonth = DAYS_IN_JAN_MAR_MAY_JUL_AUG_OCT_DEC;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
				daysInMonth = DAYS_IN_SEPT_APR_JUN_NOV;
				break;
		case 2: 
				daysInMonth = isLeapYear (yearInput) ? DAYS_IN_FEBRUARY_IN_LEAP_YEAR :
													DAYS_IN_FEBRUARY_NORMALLY;
						break;
		}
	
		return daysInMonth;
		
	}
	
	public static boolean isLeapYear (int yearInput) {
		
		return (((yearInput%4 == 0) && (yearInput%100 != 0)) || (yearInput%400 == 0));

	}

}




