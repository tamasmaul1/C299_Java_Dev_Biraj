package demo;

import java.util.Scanner;

public class Demo {

	static private String initMsg = "Enter Number of rounds to play";
	static private String errorMsg = "Not a valid input. Program shutting down";
	static private String inputMsg = "Enter your choice from : Rock, Paper, Scissors";

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

		output(initMsg);
		String input = input();

		if (isInputValid(input)) {
			play();
		} else {

			output(errorMsg);
		}

	}

	private static void play() {
		output(inputMsg);
		// TODO Auto-generated method stub

	}

	private static boolean isInputValid(String input) {

		boolean result = false;

		int tempInput;
		try {
			tempInput = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return result;
		}

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
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream

		input = sc.next();

		return input;
	}

}
