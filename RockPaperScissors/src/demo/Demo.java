package demo;

import java.util.Scanner;

public class Demo {

	static private String initMsg = "Enter Number of rounds to play";
	static private String errorMsg = "Not a valid input. Program shutting down";
	static private String inputMsg = "Enter your choice from : Rock, Paper, Scissors";

	public static void main(String[] args) {

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
		if(isChoiceValid(input())) {
			
			
		}
		
		else
		{
			play();
		}
		// TODO Auto-generated method stub

	}

	private static boolean isChoiceValid(String input) {
		
		boolean result = false;
		// TODO Auto-generated method stub
		

		return result;
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
