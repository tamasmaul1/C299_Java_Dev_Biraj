package demo;

public class Demo {

	public static void main(String[] args) {

		/*
		 * The program first asks the user how many rounds he/she wants to play. Maximum
		 * number of rounds = 10, minimum number of rounds = 1. If the user asks for
		 * outside the range the program prints an error message and quits.
		 * 
		 * If the number of rounds is in range, the program plays that number of rounds.
		 * 
		 * Each round is played according to the requirements below.
		 */
		String initMsg = "Enter Number of rounds to play";
		String errorMsg = "Enter Number of rounds to play";

		output(initMsg);
		String input = input();

		if (isInputValid(input)) {
			play();
		} else {

			output(errorMsg);
		}

	}

	private static void play() {
		// TODO Auto-generated method stub

	}

	private static boolean isInputValid(String input) {

		boolean result = false;

		int tempInput = Integer.parseInt(input);

		if ((1 <= tempInput) && (tempInput <= 10))
			result = true;

		return result;
		// TODO Auto-generated method stub

	}

	private static void output(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);

	}

	private static String input() {
		// TODO Auto-generated method stub
		String input = "";

		return input;
	}

}
