package in.sudha.basics;

public class LeapYear {

	public static void main(String[] args) {

		int y = 2021;
		boolean leap = false;
		// checking year is devisable by 4 or not
		if (y % 4 == 0) {
			// checking year is devisable by 100 or not
			if (y % 100 == 0) {
				// checking year is devisable by 400 or not
				if (y % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else {
			leap = false;
		}
		// printing the result .
		if (leap == true)
			System.out.println("\n" + y + " is a Leap Year.");
		else
			System.out.println("\n" + y + " is not a Leap Year.");

		// or

		if (y % 100 == 0 || y % 4 == 0 || y % 400 == 0)
			System.out.println("\n" + y + " is a Leap Year.");
		else
			System.out.println("\n" + y + " is not a Leap Year.");
	}

}
