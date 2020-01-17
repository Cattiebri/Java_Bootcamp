package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs

		if((day >= 21 && month == 3) || (day <= 20 && month == 4)){
			zodiac = "Aries";
		} else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)){
			zodiac = "Taurus";
		}else if ((day >= 22 && month == 5) || (day <= 21 && month == 6)){
			zodiac = "Gemini";
		}else if ((day >= 21 && month == 6) || (day <= 22 && month == 7)){
			zodiac = "Cancer";
		}else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)){
			zodiac = "Leo";
		}else if ((day >= 23 && month == 8) || (day <= 23 && month == 9)){
			zodiac = "Virgo";
		}else if ((day >= 24 && month == 9) || (day <= 23 && month == 10)){
			zodiac = "Libra";
		}else if ((day >= 24 && month == 10) || (day <= 22 && month == 11)){
			zodiac = "Scorpio";
		}else if ((day >= 23 && month == 11) || (day <= 21 && month == 12)){
			zodiac = "Sagittarius";
		}else if ((day >= 22 && month == 12) || (day <= 20 && month == 1)){
			zodiac = "Capricorn";
		}else if ((day >= 21 && month == 1) || (day <= 19 && month == 2)){
			zodiac = "Aquarius";
		}else if ((day >= 20 && month == 2) || (day <= 21 && month == 3)){
			zodiac = "Pisces";
		}else {
			zodiac = "not a valid date";
		}

		return zodiac;
	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(1, 1));
	}

}
