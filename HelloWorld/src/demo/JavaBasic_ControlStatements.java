package demo;

public class JavaBasic_ControlStatements {

	public static void main(String[] args) {

		// If block

		int value = 1;
		boolean valueCheck = true;

		if (valueCheck)
			System.out.println("Condition Met");

		int numberToCheck = 0;
		if (isNumberEven(numberToCheck))
			System.out.println("Condition Met");

		int number = 0;

		switch (number) {
		case 0: {
			System.out.println("Number is zero");
			break;
			}
		default :{
			System.out.println("");
		}
		}
		
		
		
		
		if (isNumberEven(numberToCheck))
			System.out.println("Condition Met");
		else if (isNumberOdd(numberToCheck)) {
			
			System.out.println("Variable was altered");
		}
		else
		{
			System.out.println("Condition Not Met");
		}
	}

	private static boolean isNumberOdd(int numberToCheck) {
		// TODO Auto-generated method stub
		boolean value = false;
		
		System.out.println(value);
		return value;
	}

	private static boolean isNumberEven(int numberToCheck) {
		// TODO Auto-generated method stub
		return false;
	}

}
