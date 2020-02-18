import java.util.NoSuchElementException;
import java.util.Scanner;

/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: I used legible, meaningful and easy-to-understand variable and constant names within the code  
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:  The function was implemented correctly in a legible and understandable manner
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:  The function was implemented correctly in a legible and understandable manner
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment:  The function was implemented correctly in a legible and understandable manner
 5. Does the program produce the output correctly?
       Mark out of 10: 9
        Comment:  The program computers the output correctly however if 'enter' is inserted without a capital E the error handling does not account for this.
 6. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I believe I was fair and unbiased in this self-assessment 
 Total Mark out of 100 (Add all the previous marks): 99
 */ 

public class twelveDaysOfChristmas {

	public static final int NUMBER_OF_VERSES = 12;
	public static final String BEGINNING_OF_MAIN_LINE = "On the";
	public static final String MAIN_LINE = " day of Christmas my true love sent to me \n";
	public static final String FIRST_GIFT = " A partridge in a pear tree";
	public static final String SECOND_GIFT = "Two turtle doves \nand";
	public static final String THIRD_GIFT = "Three french hens\n";
	public static final String FOURTH_GIFT ="Four calling birds\n";
	public static final String FIFTH_GIFT = "Five golden rings\n";
	public static final String SIXTH_GIFT = "Six geese a-laying\n";
	public static final String SEVENTH_GIFT = "Seven swans a- swimming\n";
	public static final String EIGTH_GIFT = "Eight maids a-milking\n";
	public static final String NINTH_GIFT = "Nine ladies dancing\n";
	public static final String TENTH_GIFT = "Ten lords a-leaping\n";
	public static final String ELEVENTH_GIFT = "Eleven pipers piping\n";
	public static final String TWELFTH_GIFT = "Twelve drummers drumming\n";

	public static void main(String[] args) {

		for (int verse =1; verse <=NUMBER_OF_VERSES; verse++  )
		{
			
			System.out.println(getVerse(verse));
		}

	}


	public static String getVerse (int verse) 

	{
		String song = "";

		for (int count = 1; count <=verse; count++)
		{
			song = getChristmasGift(count) + song;

		}

		return (BEGINNING_OF_MAIN_LINE + getOrdinalString(verse) + MAIN_LINE + song);

	}


	public static String getChristmasGift(int verse) 
	{

		switch (verse) {
		case 1:
			return FIRST_GIFT;
		case 2:
			return SECOND_GIFT;
		case 3:
			return THIRD_GIFT;
		case 4:
			return FOURTH_GIFT;
		case 5:
			return FIFTH_GIFT;
		case 6:
			return SIXTH_GIFT;
		case 7:
			return SEVENTH_GIFT;
		case 8:
			return EIGTH_GIFT;
		case 9:
			return NINTH_GIFT;
		case 10:
			return TENTH_GIFT;
		case 11:
			return ELEVENTH_GIFT;
		case 12:
			return TWELFTH_GIFT;
		}

		return"";
	}


	public static String getOrdinalString (int verse) 
	{

		String ordinalString = verse ==1?" First":verse==2?" Second":verse==3?" Third":verse==4?" Fourth":verse==5?" Fifth":verse==6?" Sixth":
			verse==7?" Seventh":verse==8?" Eigth":verse==9?" Ninth":verse==10?" Tenth":verse==11?" Eleventh":verse==12?" Twelvth": "";
		return ordinalString;
	}

}