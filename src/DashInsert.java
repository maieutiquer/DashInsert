import java.util.Random;


public class DashInsert {

	public static void main(String[] args) {

		Random rand = new Random();

		processNumber(0);
		processNumber(100);
		processNumber(12345678);
		processNumber(11551);
		processNumber(99946);
		processNumber(56730);
		processNumber(rand.nextInt(99999));

	}

	/**
	 * Prints the given number and its DashInsert() result.
	 * <p>
	 * Example:<br>
	 * Input = 99946 Output = "9-9-946"
	 * 
	 * @param num the string to be processed and printed
	 */
	private static void processNumber(int num) {

		System.out.println("Input = " + num + " Output = \"" + dashInsert(num) + "\"");

	}

	public static String dashInsert(int num) {

		// the string representation of the integer num
		String number = String.valueOf(num);

		int dashesCount = 0;

		for (int i=0; i < number.length() - dashesCount; i++) {
			int currentPosition = i + dashesCount;
			int currentDigit = number.charAt(currentPosition);
			if (!isLast(currentPosition, number) &&
					isOdd(currentDigit) &&
					isOdd(number.charAt(currentPosition + 1))) {
				number = number.substring(0, currentPosition + 1) + "-" +
					number.substring(currentPosition + 1, number.length());
				dashesCount++;
			}
		}

		return number;
	}

	/**
	 * Checks if a given position is the last one in a string.
	 * 
	 * @param index the position
	 * @param str the string to check
	 * @return
	 */
	private static boolean isLast(int index, String str) {
		return !(index < str.length() - 1);
	}

	private static boolean isOdd(int num) {
		return !(num % 2 == 0);
	}
}
