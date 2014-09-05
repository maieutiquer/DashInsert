
public class DashInsert {

	public static void main(String[] args) {

		

	}

	/**
	 * Prints the given number and its DashInsert() result.
	 * <p>
	 * Example:<br>
	 * Input = 99946 Output = "9-9-946"
	 * 
	 * @param num the string to be checked and printed
	 */
	private static void checkString(int num) {

		System.out.println("Input = " + num + " Output = \"" + DashInsert(num) + "\"");

	}

	public static String DashInsert(int num) {

		/**
		 * The string representation of the integer num
		 */
		String number = String.valueOf(num);

		int dashesCount = 0;

		for (int i=0; i < number.length() - 1; i++) {
			if (isLast(number.charAt(i + dashesCount)) ) {
				
			}
		}

		return number;
	}

	private static boolean isLast(char charAt) {
		
		return false;
	}

}
